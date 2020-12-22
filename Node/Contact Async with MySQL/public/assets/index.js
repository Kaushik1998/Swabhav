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
        controller: "contactCtrl",
      })
      .when("/add", {
        templateUrl: "./pages/add.html",
        controller: "addCtrl",
      })
      .otherwise({
        templateUrl: "./pages/page-not-found.html",
      });
  },
]);

root.service("contactService", [
  "$q",
  "$http",
  function (q, http) {
    return {
      getContacts: function () {
        return http.get("/api/contacts").then(
          function (response) {
            return response;
          },
          function (response) {
            return q.reject(response);
          }
        );
      },
      addContact: function (contact) {
        return http.post("/api/contacts", JSON.stringify(contact)).then(
          function (response) {
            return response;
          },
          function (response) {
            return q.reject(response);
          }
        );
      },
    };
  },
]);

root.controller("contactCtrl", [
  "$scope",
  "contactService",
  async (scope, cs) => {
    scope.$on("$viewContentLoaded", function () {
      cs.getContacts().then((result) => {
        scope.contacts = result.data;
      });
    });
  },
]);
root.controller("addCtrl", [
  "$scope",
  "contactService",
  async (scope, cs) => {
    scope.postContact = function () {
      cs.addContact(scope.contact).then((result) => {
        alert(JSON.stringify(result.data));
      });
    };
  },
]);
