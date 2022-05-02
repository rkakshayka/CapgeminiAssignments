
var average = 0; //Now global variable

function getAverage(a,b){

    //var average = (a + b) / 2; //local variable
    average = (a + b) / 2;

    console.log(average);
    return average;

}
var myResult = getAverage(7,11);  //Global Variable

function logResult(){

    console.log("The Average is: " + myResult + " inside the function");
}
logResult();
