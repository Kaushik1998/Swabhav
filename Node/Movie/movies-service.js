const fs = require("fs");

module.exports = class MovieApp {
  MOVIES_DB_PATH = "MOVIES_DB.json";
  constructor() {
    let moviesData = fs.readFileSync(this.MOVIES_DB_PATH);
    this.MOVIES_DB = JSON.parse(moviesData);
  }

  listOfMovies() {
    return this.MOVIES_DB;
  }

  addMovie(newMovie) {
    this.MOVIES_DB.push(newMovie);
    this._writeToFile();
    return `${newMovie.name} was added`;
  }

  deleteMovie(index) {
    let deletedMovieName = this.MOVIES_DB[index - 1];
    this.MOVIES_DB.splice(index - 1, 1);
    this._writeToFile();
    return deletedMovieName;
  }

  findMovie(year) {
    return this.MOVIES_DB.filter((movie) => {
      return movie.year == year;
    });
  }

  _writeToFile() {
    fs.writeFile(
      this.MOVIES_DB_PATH,
      JSON.stringify(this.MOVIES_DB),
      (error) => {
        if (error) throw error;
      }
    );
  }
};
