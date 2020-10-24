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

root.controller("ctrl", [
  "$scope",
  "$http",
  function (scope, http) {
    http
      .get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
      .then(function (response) {
        scope.students = response.data;
        console.log(scope.students[1]);
      });

    scope.addStudent = function () {
      http
        .post(
          "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
          JSON.stringify(scope.newStudent)
        )
        .then(function (response) {
          alert(`Student added \nID : ${response.data}`);
          console.log("Success Add Student");
        });
    };

    scope.updateStudent = function () {
      http
        .put(
          `http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${scope.existingStudent.id}`,
          JSON.stringify(scope.existingStudent)
        )
        .then(function (response) {
          alert(`Student Updated \nID: ${scope.existingStudent.id}`);
          console.log("Success Update Student");
          scope.existingStudent = {};
        });
    };

    scope.deleteStudentID = function () {
      http
        .delete(
          `http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${scope.deleteStudent}`
        )
        .then(function (response) {
          alert(`Student Deleted \nID: ${scope.deleteStudent}`);
          console.log("Success Delete Student");
        });
    };
  },
]);
