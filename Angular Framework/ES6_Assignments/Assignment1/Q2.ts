// Scoping: Declare a variable inside if condition & make sure that it is not accessible outside 
// if condition.

if(true){
    let n = 5;
    console.log(n);
}
console.log(n);
//Error: Cannot find name 'n'. Since, "let" keyword scope is only inside the block (block level scope).