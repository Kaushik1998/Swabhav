var globalNameSpace = (function student(fname, mname, lname) {
  this.fname = fname;
  this.mname = mname;
  this.lname = lname;
  this.getFullName = function () {
    return this.fname + " " + this.mname + " " + this.lname;
  };
})();

(function Team1() {
  function student(fname, lname) {
    this.fname = fname;
    this.lname = lname;
    this.getFullName = function () {
      return this.fname + " " + this.lname;
    };
  }
})();

let s = new student("K", "S", "N");
console.log(s.getFullName());
