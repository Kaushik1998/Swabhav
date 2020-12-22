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
      .when("/update", {
        templateUrl: "./pages/update.html",
        controller: "updateCtrl",
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

root.factory("stateService", function () {
  let stateObject = {};
  stateObject.states = [
    "Andhra Pradesh",
    "Arunachal Pradesh",
    "Assam",
    "Bihar",
    "Chhattisgarh",
    "Goa",
    "Gujarat",
    "Haryana",
    "Himachal Pradesh",
    "Jammu and Kashmir",
    "Jharkhand",
    "Karnataka",
    "Kerala",
    "Madhya Pradesh",
    "Maharashtra",
    "Manipur",
    "Meghalaya",
    "Mizoram",
    "Nagaland",
    "Odisha",
    "Punjab",
    "Rajasthan",
    "Sikkim",
    "Tamil Nadu",
    "Telangana",
    "Tripura",
    "Uttarakhand",
    "Uttar Pradesh",
    "West Bengal",
    "Andaman and Nicobar Islands",
    "Chandigarh",
    "Dadra and Nagar Haveli",
    "Daman and Diu",
    "Delhi",
    "Lakshadweep",
    "Puducherry",
  ];
  return stateObject;
});

root.directive("w3TestDirective", function () {
  var directive = {};
  directive.restrict = "E";
  directive.templateUrl = `public/pages/address.html `;

  return directive;
});

root.controller("contactCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  async (scope, root, cs) => {
    scope.storeContact = function (contact) {
      root.storedContact = contact;
    };
    scope.$on("$viewContentLoaded", function () {
      cs.getContacts().then((result) => {
        scope.contacts = result.data;
      });
    });
  },
]);

root.controller("updateCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "stateService",
  async (scope, root, contactService, stateService) => {
    scope.states = stateService.states;
    scope.contact = root.storedContact;
    console.log(root.storedContact);
  },
]);

root.controller("addCtrl", [
  "$scope",
  "contactService",
  "stateService",
  async (scope, contactService, stateService) => {
    scope.states = stateService.states;
    scope.contact = {
      name: {
        firstName: "Kaushik",
        lastName: "Nippanikar",
      },
      contact: 8779385779,
      address: {
        roomNo: 404,
        street: "Road",
        city: "Mumbai",
        state: "Maharastra",
        building: "Pushpak",
      },
    };
    scope.postContact = function () {
      contactService.addContact(scope.contact).then((result) => {
        console.log(scope.contact);
        scope.newContactId = result.data["_id"];
      });
    };
  },
]);
