function greetPerso(name) {
    var greet;
    if (name === "Akshay") {
        greet = "Hello Akshay !!";
    }
    else {
        greet = "Hi there..";
    }
    console.log(greet);
}
greetPerso("Akshay");
var a = 1;
var b = 2;
if (a === 1) {
    var a = 10;
    var b_1 = 20;
    console.log(a);
    console.log(b_1);
}
console.log(a);
console.log(b);
//let in for loop
console.log("Numbers will starts after 2 seconds.");
var _loop_1 = function (i) {
    setTimeout(function () {
        console.log(i);
    }, 2000);
};
for (var i = 1; i <= 5; i++) {
    _loop_1(i);
}
