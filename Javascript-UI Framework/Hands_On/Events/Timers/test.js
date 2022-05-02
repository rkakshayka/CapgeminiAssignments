
var colourChanger =document.getElementById("colour-changer");
var colours = ["red", "blue" ,"green", "pink"];
var counter = 0;

function changeColour() {
    if(counter >= colours.length){
        counter = 0;
    }
    
    colourChanger.style.background = colours[counter];
    counter++;
}

//calls the function repeatedly
var myTimer = setInterval(changeColour, 3000);
colourChanger.onclick = function() {

    clearInterval(myTimer);
    colourChanger.innerHTML = "Timer stopped";
}

// var myMessage = document.getElementById("message");

// function showMessage() {

//     myMessage.className = "show";
// }

// //calls the function once
// setTimeout(showMessage, 3000);
