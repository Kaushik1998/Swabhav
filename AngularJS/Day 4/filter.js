let fullName = document.getElementById("fullName");
let filterApp = angular.module("filterApp", []);

filterApp.controller("filterCtrl", function ($scope) {
  $scope.firstName;
  $scope.lastName;
  $scope.fullName;
  $scope.getFullName = () => {
    if ($scope.firstName && $scope.lastName) {
      $scope.fullName = $scope.firstName + " " + $scope.lastName;
    }
  };
  $scope.money;
});
