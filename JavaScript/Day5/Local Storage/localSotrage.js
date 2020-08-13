const key = document.getElementById("keyData");
const valueData = document.getElementById("valueData");
const insert = document.getElementById("insert");
const localData = document.getElementById("localData");
const clear = document.getElementById("clear");

clear.onclick = () => {
  localStorage.clear();
  location.reload();
};

insert.onclick = () => {
  if (key.value && valueData.value) {
    localStorage.setItem(key.value, valueData.value);
    location.reload();
    console.log(key.value);
    console.log(valueData.value);
  }
};

for (let i = 0; i < localStorage.length; i++) {
  const lsKey = localStorage.key(i);
  const lsValue = localStorage.getItem(lsKey);
  if (lsKey != "randid") {
    localData.innerHTML += `<li><i class="fa fa-key"></i> Key : ${lsKey} <br> <i class="fa fa-book"></i> Value : ${lsValue}</li>`;
  }
}
