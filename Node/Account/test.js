let Calc = require("./Calc");
let c = new Calc();
c.on("Add", (result) => {
  console.log(result);
});

c.add(2, 5);
c.add(6, 5);
