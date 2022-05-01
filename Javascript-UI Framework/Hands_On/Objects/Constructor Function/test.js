var Car = function(maxSpeed, driver){

    this.maxSpeed = maxSpeed;
    this.driver = driver;
    this.drive = function(speed, time) {
        console.log(speed * time);
        };

    this.logDriver = function() {
        console.log("Driver name is: "+this.driver);
        };      
}

var mycar = new Car(70, "Akshay");
var mycar2 = new Car(60, "Kaushik");
var mycar3 = new Car(50, "Aditya");
var mycar4 = new Car(90, "Kaushik");

mycar.drive(30,5);
mycar3.logDriver();
