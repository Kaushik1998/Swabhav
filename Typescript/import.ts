import { Employee } from './inheritance';

class EmployeeTest extends Employee {
  constructor(name: string) {
    super(name);
  }
}

let kaushik: EmployeeTest = new EmployeeTest("Kaushik");
kaushik.displayName();
