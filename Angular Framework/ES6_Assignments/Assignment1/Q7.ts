//7. a.
let inputArray = [4, 2, 6, 36, 16];
let [a0, a1, a2, a3, a4] = inputArray;
console.log("------Question 7 a------");
console.log("Array element at position 3 (inputArray[2]): ",a2);

//7. b.
var organization = {
    orgName: "XYZ",
    myaddress: {country: "India", city: "Hapur", pincode: 245101}
}

let {orgName, myaddress: address} = organization;
console.log("------Question 7 b-----");
console.log("Pincode: ",address.pincode);