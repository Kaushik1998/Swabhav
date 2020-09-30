let myTest = angular.module("myTest", []);

myTest.controller("myCtrl", function ($scope) {
  $scope.msg = "Hello";
  $scope.index = 0;
});

myTest.directive("checkb", function () {
  return {
    template: `<h1>{{msg}} Kaushik </h1>`,
  };
});
