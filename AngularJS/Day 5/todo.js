let todo = angular.module("todoApp", []);
let strikethroughAdd = "strikeThroughAdd";
let strikethroughRemove = "strikeThroughRemove";
todo.controller("todoCtrl", function ($scope) {
  $scope.rows = [new column(null, "Buy Milk", "10:30", "none"),new column(null, "Buy Car", "10:34", "none")];

  $scope.addTask = function () {
    let checkbox = document.createElement("input");
    checkbox.setAttribute("type", "checkbox");
    $scope.rows.push(
      new column(
        checkbox,
        $scope.task,
        new Date().toDateString(),
        strikethroughRemove
      )
    );
  };

  $scope.checkboxClick = function (rowContent) {
    if (rowContent.done) {
      rowContent.done = false;
      rowContent.classStyle = strikethroughRemove;
      console.log("Task Undone" + rowContent.classStyle);
    } else {
      rowContent.done = true;
      rowContent.classStyle = strikethroughAdd;
      console.log("Task done" + rowContent.classStyle);
    }
  };
});

todo.directive("column", function () {
  return {
    templateUrl: "column.html",
  };
});

function column(checkbox, task, time, classStyle) {
  return {
    checkbox,
    done: false,
    task,
    time,
    classStyle,
  };
}
