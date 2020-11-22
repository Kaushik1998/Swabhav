function add(a, b) {
  return a + b;
}

let addAsync = function (x, y) {
  return new Promise((resolve, reject) => {
    var sum = x + y;
    if (sum) {
      resolve(sum);
    } else {
      reject(Error("Could not add the two values!"));
    }
  });
};

console.log(add(5,5));
console.log(addAsync(2,2));
console.log("End of the Program");
