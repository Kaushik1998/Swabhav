const root = angular.module("root", ["ngRoute"]);

root.config([
  "$routeProvider",
  "$compileProvider",
  function (route, $compileProvider) {
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

    $compileProvider.imgSrcSanitizationWhitelist(/blob:/);
  },
]);

root.factory("objectService", function () {
  let object = {};
  object.dummyContact = {
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
  object.nullContact = {
    name: {
      firstName: null,
      lastName: null,
    },
    address: [
      {
        city: null,
        state: null,
        building: null,
        street: null,
        roomNo: null,
      },
    ],

    contact: {
      type: Number,
    },
  };
  object.states = [
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
  return object;
});

root.service("contactService", [
  "$q",
  "$http",
  function (q, http) {
    let contactService = {};
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

    contactService.addContactToServer = function (contact) {
      console.log(contact);
      let form = new FormData();
      for (property in contact) {
        form.append(property, JSON.stringify(contact[property]));
      }
      if (contact.file) {
        form.append("file", contact.file);
        console.log(contact.file);
      }

      return http.post("/api/contacts/add", form, {
        transformRequest: angular.identity,
        headers: { "Content-Type": undefined },
      });
    };

    contactService.updateContactToServer = function (contact) {
      console.log(contact);
      delete contact._v;
      delete contact.profilePicture;
      let form = new FormData();
      for (property in contact) {
        form.append(property, JSON.stringify(contact[property]));
      }
      if (contact.file) {
        form.append("file", contact.file);
        console.log(contact.file);
      }

      return http.post("/api/contacts/update", form, {
        transformRequest: angular.identity,
        headers: { "Content-Type": undefined },
      });
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
    contactService.searchContactFromServer = function (contact) {
      return http({
        method: "POST",
        url: `/api/contacts/search`,
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

root.service("imageService", [
  function () {
    let service = {};
    service.parseImage = function (profilePicture) {
      if (profilePicture) {
        let arrayBufferView = new Uint8Array(profilePicture.data.data);
        let blob = new Blob([arrayBufferView], {
          type: profilePicture.contentType,
        });
        let urlCreator = window.URL || window.webkitURL;
        imageString = urlCreator.createObjectURL(blob);
        return imageString;
      } else {
        return null;
      }
    };
    return service;
  },
]);

root.directive("fileModel", [
  "$parse",
  function ($parse) {
    return {
      restrict: "A",
      link: function (scope, element, attrs) {
        var model = $parse(attrs.fileModel);
        var modelSetter = model.assign;
        element.bind("change", function () {
          scope.$apply(function () {
            modelSetter(scope, element[0].files[0]);
          });
        });
      },
    };
  },
]);

root.directive("contactForm", function () {
  var directive = {};
  directive.restrict = "E";
  directive.scope = {
    contact: "=",
  };
  directive.controller = "contactFormCtrl";
  directive.templateUrl = `./pages/contact-form.html`;
  return directive;
});

root.controller("contactFormCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "objectService",
  async (scope, root, contactService, objectService) => {
    scope.removeAddress = function (object) {
      scope.contact.address.pop(object);
    };
    scope.states = objectService.states;
    scope.addAddress = function () {
      let blankAddress = {
        roomNo: null,
        street: null,
        city: null,
        state: null,
        building: null,
      };
      if (scope.contact["address"]) {
        let addressArray = scope.contact["address"];
        addressArray.push(blankAddress);
      } else {
        scope.contact["address"] = blankAddress;
      }
    };
  },
]);

root.controller("contactCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "imageService",

  async (scope, root, contactService, imageService) => {
    scope.storeContact = function (contact) {
      scope.updateContact = contact;
    };
    scope.$on("$viewContentLoaded", function () {
      contactService.getContacts().then((result) => {
        scope.contacts = result.data;
        scope.contacts.forEach((contact) => {
          contact.imageString = imageService.parseImage(contact.profilePicture);
        });
        console.log(scope.contacts);
      });
    });

    scope.getKeys = function (obj) {
      return Object.keys(obj);
    };

    // scope.getString = function (imgSrc) {
    //   return btoa(String.fromCharCode.apply(null, new Uint8Array(imgSrc)));
    // };

    scope.updateNewContact = function () {
      contactService
        .updateContactToServer(scope.updateContact)
        .then((result) => {
          scope.updatedContactId = result.data["_id"];
          console.log(scope.updatedContactId);
        })
        .catch((err) => console.log("Error"));
    };

    scope.deleteContact = function (contact) {
      contactService
        .deleteContact({ _id: contact._id })
        .then((result) => {
          scope.deleteContactId = result.data["_id"];
        })
        .catch((err) => console.log("Error"));
    };
  },
]);

root.controller("updateCtrl", [
  "$scope",
  "$rootScope",
  "contactService",
  "objectService",
  async (scope, root, contactService, objectService) => {
    scope.states = objectService.states;
    scope.contact = objectService.nullContact;
    scope.updateContact = function () {
      contactService
        .updateContactToServer(scope.contact)
        .then((result) => {
          scope.updatedContactId = result.data["_id"];
          console.log(scope.updatedContactId);
        })
        .catch((err) => console.log("Error"));
    };
  },
]);

root.controller("addCtrl", [
  "$scope",
  "contactService",
  "objectService",
  async (scope, contactService, objectService) => {
    scope.states = objectService.states;
    scope.contact = objectService.dummyContact;
    scope.addContact = function () {
      contactService
        .addContactToServer(scope.contact)
        .then((result) => {
          scope.newContactId = result.data["_id"];
          console.log(scope.newContactId);
        })
        .catch((err) => console.log("Error"));
    };
  },
]);

root.controller("searchCtrl", [
  "$scope",
  "$rootScope",
  "contactService",

  "imageService",
  async (scope, root, contactService, imageService) => {
    scope.getKeys = function (obj) {
      return Object.keys(obj);
    };
    scope.storeContact = function (contact) {
      scope.updateContact = contact;
    };
    scope.searchContactFunction = function () {
      contactService
        .searchContactFromServer(scope.searchContact)
        .then((result) => {
          scope.results = result.data;
          console.log("Search Results ", result.data);
          scope.results.forEach((contact) => {
            contact.imageString = imageService.parseImage(
              contact.profilePicture
            );
          });
        });
    };
    scope.updateNewContact = function () {
      contactService
        .updateContactToServer(scope.updateContact)
        .then((result) => {
          scope.updatedContactId = result.data["_id"];
          console.log(scope.updatedContactId);
        })
        .catch((err) => console.log("Error"));
    };

    scope.deleteContact = function (contact) {
      contactService
        .deleteContact({ _id: contact._id })
        .then((result) => {
          scope.deletedContactId = result.data["_id"];
        })
        .catch((err) => console.log("Error"));
    };
  },
]);

root.controller("testCtrl", [
  "$scope",
  "$rootScope",
  "contactService",

  "fileUpload",
  async (scope, root, contactService, fileUpload) => {
    scope.uploadFile = function () {
      var file = scope.myFile;
      console.log("file is ");
      console.dir(file);
      var uploadUrl = "/image";
      fileUpload.uploadFileToUrl(file, uploadUrl);
    };
  },
]);
