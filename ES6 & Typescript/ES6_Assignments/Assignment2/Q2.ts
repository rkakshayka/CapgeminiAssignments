const armstrongNumbers = [1,153,370,371,407];
const iterator = armstrongNumbers[Symbol.iterator]();

function getNextArmstrong(){

    return iterator.next().value;

}
console.log("-----Question 2-----");

console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());