let root = angular.module("root", []);
root.filter("myUppercaseFilter", function () {
  return function (input) {
    return input.toUpperCase();
  };
});

root.controller("rootCtrl", function ($scope) {
  $scope.students = [
    {
      name: "Kaushik",
      rollNumber: 32,
      cgpa: 9,
    },
    {
      name: "Paras",
      rollNumber: 12,
      cgpa: 6,
    },
    {
      name: "Shailesh",
      rollNumber: 2,
      cgpa: 8,
    },
    {
      name: "Jayant",
      rollNumber: 52,
      cgpa: 7,
    },
  ];
});
