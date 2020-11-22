let root = angular.module("root", ["ngRoute"]);

root.config([
  "$routeProvider",
  function (route) {
    route.when("/", {
      templateUrl: "landingPage.html",
    });
    route.when("/productList", {
      templateUrl: "productList.html",
      controller: "productListController",
    });
    route.when("/product", {
      templateUrl: "product.html",
      controller: "productController",
    });
  },
]);

root.factory("productFactory", function () {
  let product = {};
  product.generate = function (
    name = "Product",
    code = "ABC-123",
    available = "Jan 1st, 2005",
    price = 99,
    rating = 3.5,
    img = "https://img-dotcom-media.s3.us-east-2.amazonaws.com/assets/ec050984-7b81-11e6-96e0-8905cd656caf.jpg?v=37",
    description = `Lorem ipsum dolor sit amet, molestias distinctio ullam, rerum consequuntur, molestiae dignissimos. Sit, quasi recusandae quisquam eligendi cumque voluptatum sed? Libero omnis officia ullam illum fugit aliquam cupiditate veritatis nobis est consequuntur dignissimos, ipsum, ad odit!
    `
  ) {
    return {
      name,
      code,
      available,
      price,
      rating,
      img,
      description,
    };
  };

  return product;
});

root.factory("products", function () {
  let products = fetch("./resources/products.jsonx").then((data) => {
    let finalJson = data.json().then((data) => {
      return data;
    });
    return finalJson;
  });
  return products;
});

root.directive("star", function () {
  return {
    restrict: "E",
    templateUrl: "star.html",
  };
});

root.controller("productListController", [
  "$scope",
  "$rootScope",
  "products",
  function (scope, rootScope, product) {
    // scope.products = [
    //   product.generate("Cartoon"),
    //   product.generate("Anime", "Naruto"),
    //   product.generate("Movies", "Ksn-553"),
    // ];

    product.then((data) => {
      scope.products = data;
      return data;
    });
    console.log(scope.products);
    scope.showImages = true;

    scope.buttonMessage = "Hide Images";

    scope.toggleImage = function () {
      scope.showImages = !scope.showImages;
      switch (scope.buttonMessage) {
        case "Hide Images":
          scope.buttonMessage = "Show Images";
          break;
        case "Show Images":
          scope.buttonMessage = "Hide Images";
          break;
        default:
          scope.buttonMessage = "Error";
          break;
      }
      console.log("Images toggled : " + scope.showImages);
    };

    scope.openProduct = function (product) {
      rootScope.product = product;
    };

    scope.getNumber = function (number) {
      return Math.floor(number);
    };
  },
]);

root.controller("productController", [
  "$scope",
  "$rootScope",
  function (scope, rootScope) {
    scope.product = rootScope.product;
    scope.showMe = function () {
      console.log(scope.product);
    };

    scope.getNumber = function (number) {
      return Math.floor(number);
    };
  },
]);
