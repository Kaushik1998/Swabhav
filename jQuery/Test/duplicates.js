let myArray = [1, 2, 2, 1, 3];
let mySet = new Set();
let duplicates = new Set();
myArray.forEach((element) => {
  if (mySet.has(element)) duplicates.add(element);
  else mySet.add(element);
});

duplicates.forEach((element) => {
  console.log("Duplicate number is : " + element);
});
