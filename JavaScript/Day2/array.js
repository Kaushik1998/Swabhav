let myArray = [];

const addElement = (element) => {
  if (typeof element === typeof 1) {
    myArray.push(element);
  }
};

const removeElement = () => {
  myArray.pop();
};

const removeElementByIndex = (element) => {
  myArray.splice(myArray.indexOf(element), 1);
};

const updateArray = (element, index) => {
  myArray[index] = element;
};

addElement(10);
addElement(11);
addElement(12);
addElement(13);
addElement(14);
addElement("kaushik");
addElement("Nippanikar");
removeElementByIndex(15);
updateArray(9999, 0);

myArray.forEach((element) => {
  console.log(element);
});
