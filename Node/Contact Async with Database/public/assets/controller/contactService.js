const root = angular.module("root", ["ngRoute"]);
exports = root.service("contactService", [
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
