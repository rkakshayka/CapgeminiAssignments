var person = {
    fname: "Chandler",
    lname: "Bing"
};
person[Symbol.iterator] = function () {
    var _this = this;
    var properties = Object.keys(person);
    var count = 0;
    var isDone = false;
    var next = function () {
        if (count >= properties.length) {
            isDone = true;
        }
        return { done: isDone, value: _this[properties[count++]] };
    };
    return { next: next };
};
for (var _i = 0, person_1 = person; _i < person_1.length; _i++) {
    var p = person_1[_i];
    console.log(p);
}
