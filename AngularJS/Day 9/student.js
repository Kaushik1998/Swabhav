let root = angular.module("root", []);

// root.service("getDataFromStudentAPI", [
//   "$http",
//   function (http) {
//     this.loadStudent = function () {
//       let student = { nani: "Nani" };
//       http
//         .get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
//         .then(function (response) {
//           this.student = response.data;
//         });
//       return student;
//     };
//   },
// ]);

root.factory("studentFactory", [
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

root.service("httpService", [
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

root.controller("ctrl", [
  "$scope",
  "$http",
  "studentFactory",
  "httpService",
  function (scope, http, studentFactory, httpService) {
    scope.loadStudents = function () {
      scope.students = studentFactory.getStudents();
      console.log(typeof scope.students);
    };

    scope.addStudent = function () {
      let studentID = httpService.addStudent(scope.newStudent);
      studentID.then((message) => {
        alert(`Student added\nID : ${message}`);
        console.log("Success Add Student");
        scope.loadStudents();
      });
    };

    scope.updateStudent = function () {
      let successStatus = httpService.updateStudent(scope.existingStudent);
      successStatus.then(() => {
        {
          alert(`Update student\nID : ${scope.existingStudent.id}`);
          console.log("Success Update Student");
          scope.loadStudents();
        }
      });
    };

    scope.deleteStudentID = function () {
      let successStatus = httpService.deleteStudent(scope.deleteStudent);
      successStatus.then(() => {
        {
          alert(`Deleted student\nID : ${scope.deleteStudent}`);
          console.log("Success Deleted Student");
          scope.loadStudents();
        }
      });
    };

    scope.loadStudents();
  },
]);
