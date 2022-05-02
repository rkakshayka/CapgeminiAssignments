//difference between Symbol() and Symbol.for()
const userId = Symbol.for('userId');
const user_Id = Symbol.for('userId');
console.log(userId == user_Id);  

const studentId = Symbol("studentID");
const student_Id = Symbol.for("studentID");
console.log(studentId == student_Id);

//Symbol.keyFor()
const emp_Id = Symbol.for('empId'); 
console.log(Symbol.keyFor(emp_Id)); 
const empId = Symbol("empId");
console.log(Symbol.keyFor(empId)); 