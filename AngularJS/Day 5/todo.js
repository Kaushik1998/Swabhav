let todo = angular.module("todoApp", []);

let strikethroughStyle = `{
    text-decoration:"strikethorugh"
}`;

let strikethroughStyleNone = `{
    text-decoration:"none"
}`;

todo.controller("todoCtrl", function ($scope) {
  $scope.rows = [];

  $scope.addTask = function () {
    let checkbox = document.createElement("input");
    checkbox.setAttribute("type", "checkbox");
    $scope.rows.push(
      new column(
        checkbox,
        $scope.task,
        new Date().toDateString(),
        strikethroughStyleNone
      )
    );
  };

  $scope.checkboxClick = function (rowContent) {
    if (rowContent.done) {
      rowContent.done = false;
      console.log("Task Undone" + rowContent.task);
      rowContent.style = strikethroughStyle;
    } else {
      rowContent.done = true;
      console.log("Task done" + rowContent.task);
      rowContent.style = strikethroughStyleNone;
    }
  };
});

todo.directive("column", function () {
  return {
    templateUrl: "column.html",
  };
});

function column(checkbox, task, time, style) {
  return {
    checkbox,
    done: false,
    task,
    time,
    style,
  };
}
