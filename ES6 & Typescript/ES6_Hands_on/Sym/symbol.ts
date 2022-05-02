//In this example, we are going to generate symbols.
let sym1 = Symbol();
let sym2 = Symbol('mysymbol');
console.log('Type of sym1: ', typeof(sym1));
console.log('Type of sym2: ', typeof(sym2));
console.log(sym2.toString()); //to get description


//In this example we will see Symbol() function generates unique object keys .
let sym3 = Symbol('mysymbol');
let sym4 = Symbol('mysymbol');
console.log('sym3===sym4: ', sym3===sym4)

