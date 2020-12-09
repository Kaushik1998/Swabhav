const movieApp = require("./movies-service");
const prompt = require('prompt-sync')();

let app = new movieApp();
console.log("\n");
console.log("1.list - List all Movies");
console.log("2.add - Add a Movie");
console.log("3.del - Delete a Movie");
console.log("4.find - Find a Movie by year");
console.log("5.exit");

loop: while (true) {
  console.log("\n");
  let command = prompt("Command : ");
  switch (command) {
    case "list":
      let listOfMovies = app.listOfMovies();
      for (let i = 0; i < listOfMovies.length; i++) {
        console.log(
          `${i + 1} : ${listOfMovies[i].name} (${listOfMovies[i].year}) @${
            listOfMovies[i].price
          }`
        );
      }
      break;
    case "add":
      const name = prompt("What is your Movie Name?");
      const year = prompt(`What year was ${name} released?`);
      const price = prompt(`How much did tickets for ${name} cost?`);
      let newMovie = { name, year, price };
      console.log(app.addMovie(newMovie));
      break;
    case "del":
      const index = prompt("Number : ");
      let deletedMovie = app.deleteMovie(index);
      console.log(`${deletedMovie.name} was deleted`);
      break;
    case "find":
      const yearToFind = prompt("Year : ");
      let movies = app.findMovie(yearToFind);
      movies.forEach((movie) => {
        console.log(`${movie.name} was realeased in ${movie.year}`);
      });
      break;
    case "exit":
      console.log("Closing App");
      break loop;
    default:
      console.log("Enter valid choice.");
      break;
  }
}
