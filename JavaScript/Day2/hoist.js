//iAmNotHoisted();
const iAmNotHoisted = () => {
  console.log("I am not hoisted");
};

iAmNotHoisted();
iAmHoisted();

function iAmHoisted() {
  console.log("I am hoisted");
}
