function student() {
  let students = [1, 2, 3, 4, 5, 6];
  this.getStudents = function () {
    return students;
  };
}

console.log(student.getStudents());
