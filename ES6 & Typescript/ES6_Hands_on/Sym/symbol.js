var _a;
var s = Symbol("First Symbol");
console.log(typeof s);
console.log(s.toString());
var s2 = Symbol("Test");
var s3 = Symbol("Test");
console.log(s2 === s3);
var s4 = Symbol["for"]('RegSymbol');
var s5 = Symbol["for"]('RegSymbol');
console.log(s4 === s5);
console.log(Symbol.keyFor(s4));
var fname = Symbol("FirstName");
var person = (_a = {},
    _a[fname] = "Chandler",
    _a);
console.log(Object.getOwnPropertySymbols(person));
var COLOR = Symbol();
var MODEL = Symbol();
var MAKE = Symbol();
var Bike = /** @class */ (function () {
    function Bike(color, make, model) {
        this[COLOR] = color;
        this[MAKE] = make;
        this[MODEL] = model;
    }
    return Bike;
}());
var bike = new Bike('red', 'honda', 'cbr');
console.log(bike);
//property can be accessed ony if symbol name is known
console.log(bike[COLOR]);
