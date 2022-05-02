// function greetPerson(name) {
//     if(name === "Akshay") {
//         var greet = "Hello Akshay !!";
//     } else {
//         var greet = "Hi there..";
//     }
// console.log(greet);
// }
// greetPerson("Akshay");
//Var Hoisting
function greetPerson(name) {
    var greet;
    if (name === "Akshay") {
        greet = "Hello Akshay !!";
    }
    else {
        greet = "Hi there..";
    }
    console.log(greet);
}
greetPerson("Akshay");
