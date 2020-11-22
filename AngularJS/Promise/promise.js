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

let add = addAsync(2, 2)
  .then((msg) => {
    console.log("Inside first then : " + msg);
    return new addAsync(msg, msg);
  })
  .then((msg) => {
    console.log("Inside second then : " + msg);
    return new addAsync(msg, msg);
  })
  .then((msg) => {
    console.log("Inside third then : " + msg);
  });
console.log(add);
console.log("End of the Program");
