//generate symbols
var sym1 = Symbol();
var sym2 = Symbol("my Symbol");
console.log(typeof (sym1));
console.log(typeof (sym2));
console.log(sym2.toString());
//generate unique object keys
var sym3 = Symbol("Abc");
var sym4 = Symbol("Abc");
console.log(sym3 === sym4);
