const ARGUMENTS = process.argv;
const ARGUMENTS_LENGTH = ARGUMENTS.length;
const DEFAULT_LENGTH = 2;
if (ARGUMENTS_LENGTH == DEFAULT_LENGTH) {
  console.log("Hello Swabhav Techlabs");
} else {
  for (let i = 2; i < ARGUMENTS_LENGTH; i++) {
    console.log(`Hello ${ARGUMENTS[i]}`);
    console.log("---------------------");
  }
}
