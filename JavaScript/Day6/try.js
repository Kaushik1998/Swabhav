var globalNameSpace = globalNameSpace || {};
globalNameSpace.TeamB = globalNameSpace.TeamB || {};
globalNameSpace.TeamB.student = function (fname, mname, lname) {
  this.fname = fname;
  this.mname = mname;
  this.lname = lname;
  this.getFullName = function () {
    return this.fname + " " + this.mname + " " + this.lname;
  };
};

