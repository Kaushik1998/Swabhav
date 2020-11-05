let root = angular.module("root", []);

root.controller("ctrl", [
  "$scope",
  "$rootScope",
  "$location",
  "$window",
  function (scope, rootScope, location, window) {
    scope.home = function () {
      location.url("home");
    };

    scope.contact = function () {
      location.url("contact");
    };
    scope.about = function () {
      location.url("about");
    };

    scope.display = function () {
      if (location.url()) {
        console.log(location.url() + " is loaded");
      }
    };

    rootScope.$on("$locationChangeStart", function () {
      switch (location.url()) {
        case `/about`:
          scope.about = true;
          scope.homePage = scope.contact = scope.home = false;
          scope.display();
          break;
        case `/home`:
          scope.home = true;
          scope.homePage = scope.about = scope.contact = false;
          scope.display();
          break;
        case `/contact`:
          scope.contact = true;
          scope.homePage = scope.home = scope.about = false;
          scope.display();
          break;

        case "":
          scope.homePage = true;
          scope.display();
          break;

        default:
          scope.display();
          break;
      }
    });
  },
]);
