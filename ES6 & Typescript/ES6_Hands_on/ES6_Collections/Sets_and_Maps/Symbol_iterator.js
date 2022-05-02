/*
for..of --> iterator metthod --> symbol.iterator*/
var str = "Hello";
var arr = [1, 2, 3];
var num = 5;
var obj = { name: "Chandler" };
console.log("For string -" + typeof str[Symbol.iterator]);
console.log("For array -" + typeof arr[Symbol.iterator]);
console.log("For number -" + typeof num[Symbol.iterator]);
console.log("For object -" + typeof obj[Symbol.iterator]);
