var myDate = new Date();
console.log(myDate);

// Date(year, month, day, hour, minute)
var myPastDate = new Date(1545, 10, 26, 09, 36);
var myFutureDate = new Date(2545, 10, 26, 09, 36);

console.log(myPastDate);
console.log(myFutureDate);

// 0 -> January , Sunday

var birthday = new Date(1985, 0, 15, 11, 15, 25);
var birthday2 = new Date(1985, 0, 15, 11, 15, 25);

//get the monthof the date (0 - 11)
console.log(birthday.getMonth());

//get the full year (YYYY)
console.log(birthday.getFullYear());

//get the date of the month (1 -31)
console.log(birthday.getDate());

//get the day of the week (0 -6)
console.log(birthday.getDay());

//get the hour of the date (0 - 23)
console.log(birthday.getHours());

//get the number of milliseconds since 1st jan 1970
console.log(birthday.getTime()); 


if(birthday == birthday2){

    console.log("Birthdays are equals");
} else {

    console.log("Birthdays are not equals");
}


if(birthday.getTime() == birthday2.getTime()){

    console.log("Birthdays are equals");
} else {

    console.log("Birthdays are not equals");
}