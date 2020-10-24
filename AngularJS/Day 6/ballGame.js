let ballGame = angular.module("ballGameApp", []);

ballGame.controller("ballGameCtrl", function ($scope) {
  $scope.balls = [1, 2, 3, 4, 5];
  $scope.gameStarted = true;
  $scope.toggleStartGame = function () {
    $scope.gameStarted = !$scope.gameStarted;
  };
});

function balls() {
  return {
    correct: false,
  };
}
