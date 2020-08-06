const task = document.getElementById("task");
const list = document.getElementById("list");
const done = document.getElementById("done");
const myButton = document.getElementById("myButton");
//myButton.innerText='<i class="fa fa-plus" aria-hidden="true"></i>'
function removeMe(tag) {
  let doneTask = `<li><input type="checkbox" checked><s>${tag.innerText}</s></li>`;
  done.innerHTML += doneTask;
  tag.remove();
}

const addTask = () => {
  if (task.value != "") {
    let newtask = `<li onclick="removeMe(this);"><input type="checkbox">${task.value}</li>`;
    list.innerHTML += newtask;
  }
};
