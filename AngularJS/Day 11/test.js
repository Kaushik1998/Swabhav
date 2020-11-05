let test = angular.module("test", []);
test.factory("random", function () {
  var randomObject = {};
  var number = Math.floor(Math.random() * 100);
  randomObject.generate = function () {
    return number;
  };
  return randomObject;
});
test.controller("ctrl", [
  "$scope",
  "random",
  function (scope, random) {
    scope.random = random;
  },
]);
