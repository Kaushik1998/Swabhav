var tr = document.querySelectorAll("tr");
tr.forEach((element) => {
  element.onclick = () => {
    element.remove();
  };
});

function giveTdString() {
  return `<td colspan="3">Delete This</td>`;
}
