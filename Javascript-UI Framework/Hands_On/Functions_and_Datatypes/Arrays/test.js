var myArray = [];

myArray[0] = 25;
myArray[1] = 35;
myArray[2] = true;
myArray[3] = "hello";
myArray[4] = 3;
console.log(myArray);

// to change element
myArray[2] = false;
console.log(myArray);

var myArray2 = new Array();
var myArray3 = new Array(5);

// Methods and properties.
console.log(myArray2.length);
console.log(myArray3.length);

console.log(myArray.sort());
console.log(myArray.reverse())