var mySet = Object.create(null);
mySet.id = 0;
if (mySet.id) {
    console.log("id exists");
}
var myMap = Object.create(null);
myMap.name = "Chandler";
var val = myMap.name;
console.log(val);
myMap[100] = "Hello";
console.log(myMap["100"]);
var ob1 = {};
var ob2 = {};
myMap[ob1] = "World";
console.log(myMap[ob2]);
console.log(ob1.toString());
console.log(ob2.toString());
