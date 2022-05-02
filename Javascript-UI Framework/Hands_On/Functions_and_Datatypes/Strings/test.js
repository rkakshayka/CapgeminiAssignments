//Single Quotes string
var myString = 'I \'m a "fun" String.' 

//sting properties
console.log(myString.length);

//string methods
console.log(myString.toUpperCase());
console.log(myString.toLowerCase());
console.log(myString.indexOf("string")); //12

// not in string  return -1 in console
console.log(myString.indexOf("akshay"));
// or
if ( myString.indexOf("akshay") === -1){

    console.log("akshay is not in string..");
} else{
    //change -> myString = 'I \'m a "fun akshay" String.'
    console.log("The word akshay start at position: "
    +  myString.indexOf("akshay"));
}

//Others Operations

// var string1 = "Abc";  //"abc"
// var string2 = "Bcd";  //"bcd"

// console.log(string1 === string2);
// console.log(string1.toLowerCase() == string2.toLowerCase());

