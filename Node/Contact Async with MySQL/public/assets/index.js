const root = angular.module("root", ["ngRoute"]);

root.config([
  "$routeProvider",
  function (route) {
    route
      .when("/", {
        templateUrl: "./pages/landing.html",
      })
      .when("/contacts", {
        templateUrl: "./pages/contacts.html",
      })
      .otherwise({
        templateUrl: "./pages/page-not-found.html",
      });
  },
]);

root.controller("landing");
