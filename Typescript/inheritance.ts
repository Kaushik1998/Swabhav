export class Employee {
  public name: string;
  constructor(name: string) {
    this.name = name;
  }
  public displayName() {
    console.log(`My name is ${this.name}`);
  }
}

// class EmployeeTest extends Employee {
//   public id: number;
//   constructor(name: string, id: number) {
//     super(name);
//     this.id = id;
//   }
// }

// let kaushik: EmployeeTest = new EmployeeTest("Kaushik", 93);
// kaushik.displayName();
// console.log(kaushik.id);
