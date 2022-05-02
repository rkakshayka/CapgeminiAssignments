//5. a.
var add = function (val) {
    if (val === void 0) { val = 10; }
    return val;
};
console.log("------Question 5 a--------");
console.log(add());
console.log(add(20));
//5. b.
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("------Question 5 b--------");
    console.log("username: ", username);
    console.log("friends: ", friends);
    for (var i in friends) {
        console.log(friends[i]);
    }
}
userFriends('Akshay', 'Aditya', 'Kaushik');
//5. c.
function printCapitalNames() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    console.log("------Question 5 c--------");
    console.log(names);
    for (var i in names)
        console.log(names[i].toUpperCase());
}
var capitalNames = ['Akshay', 'Aditya', 'Kaushik'];
printCapitalNames.apply(void 0, capitalNames);
