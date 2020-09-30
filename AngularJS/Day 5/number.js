let numberApp = angular.module("numberApp", []);

numberApp.controller("numberController", function ($scope, $http) {
  $scope.loadVariables = function () {
    $scope.number = localStorage.getItem("number");
    $scope.numberData = localStorage.getItem("data");
    $scope.timespan = `Update ${moment(
      localStorage.getItem("date")
    ).fromNow()}`;
  };
  $scope.getData = function () {
    $http
      .get(`http://numbersapi.com/${$scope.number}`)
      .then(function (response) {
        $scope.numberData = response.data;
        $scope.timespan = `Update ${moment(
          localStorage.getItem("date")
        ).fromNow()}`;
        localStorage.setItem("date", moment());
        localStorage.setItem("number", $scope.number);
        localStorage.setItem("data", response.data);
      });
  };
});
