const key = document.getElementById("keyData");
const valueData = document.getElementById("valueData");
const insert = document.getElementById("insert");
const localData = document.getElementById("localData");
const clear = document.getElementById("clear");

clear.onclick = () => {
  sessionStorage.clear();
  location.reload();
};

insert.onclick = () => {
  if (key.value && valueData.value) {
    sessionStorage.setItem(key.value, valueData.value);
    location.reload();
    console.log(key.value);
    console.log(valueData.value);
  }
};

for (let i = 0; i < sessionStorage.length; i++) {
  const lsKey = sessionStorage.key(i);
  const lsValue = sessionStorage.getItem(lsKey);
  if (lsKey != "randid") {
    localData.innerHTML += `<li><i class="fa fa-key"></i> Key : ${lsKey} <br> <i class="fa fa-book"></i> Value : ${lsValue}</li>`;
  }
}
