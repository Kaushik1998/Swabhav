var app = angular.module("myApp", []);
debugger;
app.controller("validateCtrl", function ($scope) {
  $scope.user = "Kaushik";
  $scope.email = "ksn@gmail.com";
  $scope.submit = function () {
    debugger;
    console.log("HEllO");
  };
});
