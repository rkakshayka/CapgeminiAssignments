// function greetPerson1(name) {

//     if(name === "Akshay") {
//         var greet = "Hello Akshay !!";
//     } else {
//         var greet = "Hi there..";
//     }
// console.log(greet);
// }
// greetPerson1("Akshay");


//Var Hoisting

function greetPerson1(name) {

    var greet;

    if(name === "Akshay") {
        greet = "Hello Akshay !!";
    } else {
        greet = "Hi there..";
    }
console.log(greet);
}
greetPerson1("Akshay");


