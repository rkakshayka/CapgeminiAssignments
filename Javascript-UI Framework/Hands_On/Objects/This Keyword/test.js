var mycar2 = {

    maxSpeed: 70,
    driver: "Kaushik",
    drive: function(speed, time) {
        console.log(speed * time);
        },
    test: function() {
        console.log(this);
    }    
}; 

mycar2.test();
console.log(mycar2.maxSpeed);
mycar2.drive(50, 3);

var mycar3 = {

    maxSpeed: 70,
    driver: "Kaushik",
    drive: function(speed, time) {
        console.log(speed * time);
        },
    logDriver: function() {
        console.log("Driver name is: "+this.driver);
    }    
};
mycar3.logDriver();
