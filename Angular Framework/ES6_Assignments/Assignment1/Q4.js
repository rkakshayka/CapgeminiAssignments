var Obj = /** @class */ (function () {
    function Obj(name) {
        this.name = name;
        this.length = name.length;
    }
    return Obj;
}());
console.log("-----Question 4------");
var outputArray = function () {
    var objects = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        objects[_i] = arguments[_i];
    }
    console.log("objects array: ", objects);
};
var names = ['Tom', 'Ivan', 'Jerry'];
var name1 = names[0], name2 = names[1], name3 = names[2];
var namesObj1 = new Obj(name1);
var namesObj2 = new Obj(name2);
var namesObj3 = new Obj(name3);
outputArray(namesObj1, namesObj2, namesObj3);
