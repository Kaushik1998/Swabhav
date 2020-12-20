const mysql = require("mysql");
const prompt = require("prompt-sync")();

const con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
});

console.log("Starting connection");
con.connect(function (error) {
  if (error) throw error;
  console.log("Connected!");
});

con.query("CREATE DATABASE Sqli", function (err, result) {
  if (err) throw err;
  console.log("Database created Sql-Injection");
});

console.log("Using Sql-Injection ");
con.query("USE Sqli", function (err, result) {
  if (err) throw err;
  console.log("Using Dababase Sql-Injection");
});

console.log(
  "Creating a Table with Employee (id INT PRIMARY KEY, name VARCHAR(50), address VARCHAR(200))"
);
let query =
  "CREATE TABLE Employee (id INT PRIMARY KEY, name VARCHAR(50), address VARCHAR(200))";
con.query(query, function (err, result) {
  if (err) throw err;
  console.log("Created table Employee");
});

console.log("Inserting some values in table");
con.query(
  "INSERT INTO Employee (id,name, address) VALUES (1,'Kaushik', 'Malad')",
  function (err, result) {
    if (err) throw err;
  }
);
con.query(
  "INSERT INTO Employee (id,name, address) VALUES (2,'Paras', 'Ulhasnager')",
  function (err, result) {
    if (err) throw err;
  }
);
con.query(
  "INSERT INTO Employee (id,name, address) VALUES (3,'Jayant', 'Solapur')",
  function (err, result) {
    if (err) throw err;
  }
);

console.log("Asking user for ID where you can also inject malicious SQL");
console.log("-----------------------------------------------------");
let id = prompt("Enter id of Employee yoy want . ");
con.query(`SELECT * FROM Employee WHERE name = ${id}`, function (err, result) {
  if (err) throw err;
  console.log("Result of the query ");
  console.log(result);
});
