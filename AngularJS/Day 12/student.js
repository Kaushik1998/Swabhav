let student = angular.module("student", ["ngRoute"]);

student.config([
  "$routeProvider",
  function (route) {
    route.when("/", {
      templateUrl: "./studentLanding.html",
    });
    route.when("/student", {
      templateUrl: "./student.html",
      controller: "studentCtrl",
    });
    route.when("/add", {
      templateUrl: "./add.html",
      controller: "studentCtrl",
    });
    route.when("/update", {
      templateUrl: "./update.html",
      controller: "studentCtrl",
    });
    route.when("/delete", {
      templateUrl: "./delete.html",
      controller: "studentCtrl",
    });
    route.when("/deleteAll", {
      templateUrl: "./deleteAll.html",
      controller: "studentCtrl",
    });
  },
]);

student.factory("studentFactory", [
  "$http",
  function (http) {
    let factory = {};
    factory.getStudents = function () {
      let students = [];
      http
        .get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
        .then(function (response) {
          response.data.forEach((element) => {
            students.push(element);
          });
        });
      return students;
    };
    return factory;
  },
]);

student.controller("studentCtrl", [
  "$scope",
  "studentFactory",
  function (scope, student) {
    scope.students = student.getStudents();
  },
]);

student.service("httpService", [
  "$http",
  function (http) {
    this.addStudent = async function (newStudent) {
      let studentData = null;
      await http
        .post(
          "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
          JSON.stringify(newStudent)
        )
        .then(function (response) {
          studentData = response.data;
          console.log(`Response ${studentData}`);
        });
      console.log(`Student ${studentData}`);
      return studentData;
    };

    this.updateStudent = async function (existingStudent) {
      let successStatus;
      await http
        .put(
          `http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${existingStudent.id}`,
          JSON.stringify(existingStudent)
        )
        .then(function () {
          successStatus = true;
        })
        .catch(function () {
          successStatus = false;
        });
      return successStatus;
    };

    this.deleteStudent = async function (deleteStudentID) {
      let successStatus;
      await http
        .delete(
          `http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${deleteStudentID}`
        )
        .then(function () {
          successStatus = true;
        })
        .catch(function () {
          successStatus = false;
        });
      return successStatus;
    };
  },
]);

student.controller("studentCtrl", [
  "$scope",
  "$http",
  "studentFactory",
  "httpService",
  function (scope, http, studentFactory, httpService) {
    scope.loadStudents = function () {
      scope.students = studentFactory.getStudents();
    };

    scope.addStudent = function () {
      let studentID = httpService.addStudent(scope.newStudent);
      studentID.then((message) => {
        alert(`Student added\nID : ${message}`);
        console.log("Success Add Student");
        scope.loadStudents();
      });
    };

    // scope.updateStudent = function () {
    //   let successStatus = httpService.updateStudent(scope.existingStudent);
    //   successStatus.then(() => {
    //     {
    //       alert(`Update student\nID : ${scope.existingStudent.id}`);
    //       console.log("Success Update Student");
    //       scope.loadStudents();
    //     }
    //   });
    // };

    scope.deleteAll = function () {
      scope.students.forEach((student) => {
        httpService.deleteStudent(student.id);
        console.log("Attempted Delete " + student.id);
      });
    };

    scope.deleteStudentID = function () {
      let successStatus = httpService.deleteStudent(scope.deleteStudent);
      successStatus.then(() => {
        {
          console.log(`Deleted student\nID : ${scope.deleteStudent}`);
          console.log("Success Deleted Student");
          scope.loadStudents();
        }
      });
    };

    scope.loadStudents();
  },
]);
