var mainApp = angular.module("mainApp", []);
mainApp.directive("student", function () {
  //define the directive object
  var directive = {};

  //restrict = E, signifies that directive is Element directive
  directive.restrict = "E";

  //template replaces the complete element with its text.
  directive.template =
    "Student: <b>{{student.name}}</b> ,RollNo: <b>{{student.rollno}}</b>";

  //scope is used to distinguish each student element based on criteria.
  directive.scope = {
    student: "=name",
  };

  //compile is called during application initialization. AngularJS calls it once when html page is loaded.

  directive.compile = function (element, attributes) {
    element.css("border", "1px solid #cccccc");

    //linkFunction is linked with each element with scope to get the element specific data.
    var linkFunction = function ($scope, element, attributes) {
      element.html(
        "Student: <b>" +
          $scope.student.name +
          "</b> ,  Roll No: <b>" +
          $scope.student.rollno +
          "</b><br/>"
      );
      element.css("background-color", "#ff00ff");
    };
    return linkFunction;
  };

  return directive;
});

mainApp.controller("StudentController", function ($scope) {
  $scope.Mahesh = {};
  $scope.Mahesh.name = "Mahesh Parashar";
  $scope.Mahesh.rollno = 1;

  $scope.Piyush = {};
  $scope.Piyush.name = "Piyush Parashar";
  $scope.Piyush.rollno = 2;

  $scope.Kaushik = {
    name: "Kaushik",
    rollno: "93",
  };
});
