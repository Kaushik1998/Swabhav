let blueBall = 1;
let root = angular.module("blueBall", []);

root.controller("mainCtrl", function ($scope) {
  $scope.array = [1, 2, 3, 4, 5, 6];
  $scope.ballIsClicked = function (ball, number) {
    if (number == blueBall) {
        console.log([].constructor(5));
    }
  };
});

root.directive("ball", function () {
  return {
    templateUrl: `ball.html`,
  };
});
