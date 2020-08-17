var globalNameSpace = globalNameSpace || {};
globalNameSpace.TeamA = globalNameSpace.TeamA || {};
globalNameSpace.TeamA.student = function (fname, lname) {
  this.fname = fname;
  this.lname = lname;
  this.getFullName = function () {
    return this.fname + " " + this.lname;
  };
};
