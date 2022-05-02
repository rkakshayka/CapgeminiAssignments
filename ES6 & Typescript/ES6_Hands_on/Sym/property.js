var userId = Symbol["for"]('userId'); // creates a new Symbol in registry
var user_Id = Symbol["for"]('userId'); // reuses already created Symbol
console.log(userId == user_Id);
var studentId = Symbol("studentID"); // creates symbol but not in registry
var student_Id = Symbol["for"]("studentID"); // creates a new Symbol in registry
console.log(studentId == student_Id);
