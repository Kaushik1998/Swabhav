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
    productName = "Product",
    productCode = "ABC-123",
    releaseDate = "Jan 1st, 2005",
    price = 99,
    starRating = 3.5,
    img = "https://img-dotcom-media.s3.us-east-2.amazonaws.com/assets/ec050984-7b81-11e6-96e0-8905cd656caf.jpg?v=37",
    description = `Lorem ipsum dolor sit amet, molestias distinctio ullam, rerum consequuntur, molestiae dignissimos. Sit, quasi recusandae quisquam eligendi cumque voluptatum sed? Libero omnis officia ullam illum fugit aliquam cupiditate veritatis nobis est consequuntur dignissimos, ipsum, ad odit!
    `
  ) {
    return {
      productName,
      productCode,
      releaseDate,
      price,
      starRating,
      img,
      description,
    };
  };

  return product;
});

root.service("products", function () {
  let products = {};
  products.getProducts = async function () {
    let finalProduct = await fetch("./resources/products.jsonx").then(
      (data) => {
        let finalJson = data.json().then((data) => {
          return data;
        });
        return finalJson;
      }
    );
    return finalProduct;
  };
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
  "productFactory",
  function (scope, rootScope, product) {
    // scope.loadProducts = function () {
    //   let test = product.getProducts();
    //   test.then((data) => {
    //     scope.products = data;
    //   });
    // };
    // scope.loadProducts();
    //console.log(scope.products);

    scope.products = [
      new product.generate(),
      new product.generate(),
      new product.generate(),
      new product.generate(),
    ];

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
