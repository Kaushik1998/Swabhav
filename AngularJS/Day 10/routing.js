let root = angular.module("root", ["ngRoute"]);

root.config([
  "$routeProvider",
  function (route) {
    route.when("/", {
      templateUrl: "./landing.html",
      controller: "mainCtrl",
    });
    route.when("/contact", {
      templateUrl: "./contact-us.html",
      controller: "mainCtrl",
    });
  },
]);

root.controller("mainCtrl", function ($scope) {
  $scope.title = "Hello Worald";
});
