let myFunction = () => {
  let myVariable = 0;
  return {
    increment: () => {
      myVariable++;
    },
    decrement: () => {
      myVariable--;
    },
    display: () => {
      console.log(myVariable);
    },
  };
};

let testClosure = myFunction();
testClosure.increment();
testClosure.increment();
testClosure.decrement();
testClosure.display();
