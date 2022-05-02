//generate symbols
let sym1 =Symbol();
let sym2 =Symbol("my Symbol");

console.log(typeof(sym1));
console.log(typeof(sym2));
console.log(sym2.toString());


//generate unique object keys
let sym3 = Symbol("Abc");
let sym4 =Symbol("Abc");
console.log(sym3===sym4);





