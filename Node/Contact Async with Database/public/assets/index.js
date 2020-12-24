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
      .when("/search", {
        templateUrl: "./pages/search.html",
        controller: "searchCtrl",
      })
      .when("/test", {
        templateUrl: "./pages/test.html",
        controller: "testCtrl",
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
    let contactService = {};
    contactService.dummyContact = {
      name: {
        firstName: "Kaushik",
        lastName: "Nippanikar",
      },
      contact: 8779385779,
      address: [
        {
          roomNo: 404,
          street: "Road",
          city: "Mumbai",
          state: "Goa",
          building: "Pushpak",
        },
      ],
    };

    contactService.getContacts = function () {
      return http.get("/api/contacts").then(
        function (response) {
          return response;
        },
        function (response) {
          return q.reject(response);
        }
      );
    };

    contactService.addContact = function (contact) {
      return http.post("/api/contacts", JSON.stringify(contact)).then(
        function (response) {
          return response;
        },
        function (response) {
          return q.reject(response);
        }
      );
    };

    contactService.updateContact = function (contact) {
      return http.put("/api/contacts", JSON.stringify(contact)).then(
        function (response) {
          return response;
        },
        function (response) {
          return q.reject(response);
        }
      );
    };
    contactService.deleteContact = function (contactID) {
      return http({
        method: "DELETE",
        url: `/api/contacts`,
        data: contactID,
        headers: {
          "Content-type": "application/json",
        },
      }).then(
        function (response) {
          return response;
        },
        function (response) {
          return q.reject(response);
        }
      );
    };
    contactService.searchContact = function (contact) {
      return http({
        method: "GET",
        url: `/api/searchContacts`,
        data: contact,
        headers: {
          "Content-type": "application/json",
        },
      }).then(
        function (response) {
          return response;
        },
        function (response) {
          return q.reject(response);
        }
      );
    };
    return contactService;
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

root.directive("contactForm", function () {
  var directive = {};
  directive.restrict = "E";
  directive.scope = {
    contact: "=",
  };
  directive.controller = "addressCtrl";
  directive.controllerAs = "address";
  directive.templateUrl = `./pages/contact-form.html`;
  return directive;
});

root.controller("contactCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  async (scope, root, contactService) => {
    scope.storeContact = function (contact) {
      scope.updateContact = contact;
    };
    scope.$on("$viewContentLoaded", function () {
      contactService.getContacts().then((result) => {
        scope.contacts = result.data;
      });
    });

    scope.getKeys = function (obj) {
      return Object.keys(obj);
    };

    scope.putContact = function (contact) {
      let newContact = Object.assign({}, contact);
      let id = newContact._id;
      delete newContact._id;
      delete newContact.__v;
      contactService.updateContact({ id, newContact }).then((result) => {
        scope.newContactId = result.data["_id"];
        console.log(result.data);
      });
    };
    scope.deleteContact = function (contact) {
      contactService
        .deleteContact({ _id: contact._id })
        .then((result) => {
          scope.newContactId = result.data["_id"];
        })
        .catch((err) => console.log("Error"));
    };
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
  },
]);

root.controller("addCtrl", [
  "$scope",
  "contactService",
  "stateService",
  async (scope, contactService, stateService) => {
    scope.states = stateService.states;
    scope.contact = contactService.dummyContact;
    scope.postContact = function () {
      contactService.addContact(scope.contact).then((result) => {
        scope.newContactId = result.data["_id"];
      });
    };
  },
]);

root.controller("addressCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "stateService",
  async (scope, root, contactService, stateService) => {
    scope.removeAddress = function (object) {
      scope.contact.address.pop(object);
    };
    scope.states = stateService.states;
    scope.addAddress = function () {
      let addressArray = scope.contact["address"];
      addressArray.push({
        roomNo: null,
        street: null,
        city: null,
        state: "Assam",
        building: null,
      });
    };
  },
]);

root.controller("searchCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "stateService",
  async (scope, root, contactService, stateService) => {
    scope.getKeys = function (obj) {
      return Object.keys(obj);
    };
    scope.searchContactFromApi = function () {
      contactService.searchContact(scope.searchContact).then((result) => {
        scope.results = result.data;
        console.log(scope.results);
      });
    };
  },
]);

root.controller("testCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "stateService",
  async (scope, root, contactService, stateService) => {
    scope.states = stateService.states;
    scope.contact = root.storedContact;
  },
]);
