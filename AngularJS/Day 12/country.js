let country = angular.module("country", ["ngRoute"]);

country.config([
  "$routeProvider",
  function (route) {
    route.when("/", {
      templateUrl: "./landing.html",
      controller: "landingCtrl",
    });
    route.when("/countries", {
      templateUrl: "./countries.html",
      controller: "countryCtrl",
    });
  },
]);

country.controller("landingCtrl", function ($scope) {
  $scope.title = "Hello World";
});

country.controller("countryCtrl", [
  "$scope",
  "$http",
  function (scope, http) {
    http.get("http://restcountries.eu/rest/v2/all").then(function (response) {
      scope.data = response.data;
    });
  },
]);

country.service("countryGetFromAPI",["$http",function(http){
    
}])
