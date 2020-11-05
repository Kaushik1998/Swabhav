var app = angular.module("myapp", []);

app.directive("nexsalesHeader", function () {
  return {
    templateUrl: "NexSalesHeader.html",
    restrict: "E",
  };
});

app.directive("nexsalesFooter", function () {
  function footerFunc($scope, $attr) {
    $scope.year = $attr.year;
  }

  return {
    link: footerFunc,
    scope: true,
    templateUrl: "NexSalesFooter.html",
  };
});


