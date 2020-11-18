import { IStudent } from './IStudent';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css'],
})
export class StudentComponent implements OnInit {
  studentList: IStudent[] = [];
  showStudents: boolean = false;

  loadStudents() {
    this.showStudents = !this.showStudents;
  }
  constructor() {}

  ngOnInit(): void {
    this.studentList.push({ name: 'Kaushik', rollno: 91, cgpa: 62 });
    this.studentList.push({ name: 'Paras', rollno: 23, cgpa: 56 });
    this.studentList.push({ name: 'Jayant', rollno: 13, cgpa: 48 });
  }
}
