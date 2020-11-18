import { IStudent } from './IStudent';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css'],
})
export class StudentComponent implements OnInit {
  kaushik: IStudent = { name: 'Kaushik', rollno: 91, cgpa: 62 };
  paras: IStudent = { name: 'Paras', rollno: 23, cgpa: 56 };
  jayant: IStudent = { name: 'Jayant', rollno: 13, cgpa: 48 };
  studentList: IStudent[] = [];

  loadStudents() {
    this.studentList.push(this.kaushik);
    this.studentList.push(this.paras);
    this.studentList.push(this.jayant);
  }
  constructor() {}

  ngOnInit(): void {}
}
