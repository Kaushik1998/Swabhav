let mainApp = angular.module('mainApp', [])
.controller('mainCtrl', function($scope, $rootScope) {
$scope.name = "Main Controller";
$rootScope.id = 101;
});

let secondApp = angular.module('secondApp', ['thirdApp'])
.controller('secondCtrl', function($scope) {
$scope.name = 'Second Controller';
});

let thirdApp = angular.module('thirdApp', [])
.controller('thirdCtrl', function($scope) {
$scope.name = 'Third Controller';
});