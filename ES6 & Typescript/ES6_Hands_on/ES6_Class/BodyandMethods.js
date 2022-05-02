console.log("-------Class Body and Methods-------");
var Person = /** @class */ (function () {
    function Person(name) {
        this.name = name;
        console.log(this.name + " Constructor");
    }
    Person.staticMethod = function () {
        console.log("Static Method");
    };
    Person.prototype.greetPerson = function () {
        console.log("Hello " + this.name);
    };
    return Person;
}());
var p = new Person("Chandler");
Person.staticMethod();
p.greetPerson();
