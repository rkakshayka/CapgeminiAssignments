function greetPerso(name) {

    let greet;

    if(name === "Akshay") {
        greet = "Hello Akshay !!";
    } else {
        greet = "Hi there..";
    }
    console.log(greet);
}
greetPerso("Akshay");

//--------------------------------
var a = 1;
var b = 2;
if(a === 1){
    var a = 10;
    let b = 20;

    console.log(a);
    console.log(b);
}
console.log(a);
console.log(b);

//---------------------------------------
//let in for loop
console.log("Numbers will starts after 2 seconds.")
for(let i=1; i<=5; i++){
    setTimeout(function(){
        console.log(i);}, 2000);
}
