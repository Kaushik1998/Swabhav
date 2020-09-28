let counterApp = angular.module("counterApp", []);

counterApp.factory("counter", function () {
  let obj = {};
  obj.count = 0;
  obj.getCount = function () {
    return this.count;
  };
  obj.incrementCount = function () {
    this.count++;
    return this.count;
  };

  obj.decrementCount = function () {
    this.count--;
    return this.count;
  };
  return obj;
});

counterApp.controller("mainCtrl", function ($scope, $rootScope, counter) {
  $rootScope.count = counter.getCount();
});

counterApp.controller("incrementCtrl", function ($scope, $rootScope, counter) {
  $scope.increment = function () {
    $rootScope.count = counter.incrementCount();
  };
});

counterApp.controller("decrementCtrl", function ($scope, $rootScope, counter) {
  $scope.decrement = function () {
    $rootScope.count = counter.decrementCount();
  };
});
