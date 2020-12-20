const mysql = require("mysql");
const prompt = require("prompt-sync")();

const con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
});

setTimeout(() => {
  console.log("Starting connection");
  con.connect(function (error) {
    if (error) throw error;
    console.log("Connected!");
  });
}, 1000);

setTimeout(() => {
  con.query("CREATE DATABASE Swabhav", function (err, result) {
    if (err) throw err;
    console.log("Database created Swabhav");
  });
}, 2000);

setTimeout(() => {
  con.query("USE Swabhav", function (err, result) {
    if (err) throw err;
    console.log("Using Dababase Swabhav");
  });
}, 3000);

setTimeout(() => {
  let query =
    "CREATE TABLE Employee (id INT PRIMARY KEY, name VARCHAR(50), address VARCHAR(200))";
  con.query(query, function (err, result) {
    if (err) throw err;
    console.log("Created table Employee");
  });
}, 4000);

setTimeout(() => {
  let query =
    "INSERT INTO Employee (id,name, address) VALUES (1,'Kaushik', 'Malad')";
  con.query(query, function (err, result) {
    if (err) throw err;
    console.log("Values Inserted");
  });
  con.query(
    "INSERT INTO Employee (id,name, address) VALUES (2,'Paras', 'Ulhasnager')",
    function (err, result) {
      if (err) throw err;
    }
  );
  con.query(
    "INSERT INTO Employee (id,name, address) VALUES (3, 'Jayant', 'Solapur')",
    function (err, result) {
      if (err) throw err;
    }
  );
}, 5000);

setTimeout(() => {
  console.log("This is where SQL injection can happen. ");
  let id = prompt("Enter ID: ");
  console.log("ID is " + id);
  let query = `SELECT * from Employee WHERE id = ${id}`;
  con.query(query, function (err, result) {
    if (err) throw err;
    console.log("Where Clause");
    console.log(result);
  });
}, 6000);
