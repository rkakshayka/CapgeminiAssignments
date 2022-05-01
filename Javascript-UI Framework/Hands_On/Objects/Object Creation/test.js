// creating new objects

var myCar = new Object();
myCar.maxSpeed = 50; //miles
myCar.driver = "Akshay";
myCar.drive = function() {

    console.log("now driving..");
    };

var mycar2 = {

    maxSpeed: 70,
    driver: "Kaushik",
    drive: function(speed, time) {
        console.log(speed * time);
        }
}; 

console.log(mycar2.maxSpeed);
mycar2.drive(50, 3);