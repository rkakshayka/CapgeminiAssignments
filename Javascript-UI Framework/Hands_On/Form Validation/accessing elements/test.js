document.forms,myForm;

var myForm =document.forms,myForm;
myForm;

myForm.name;
myForm.name.value;
// fill vale in name box
myForm.name.value;

myForm.colour.value;

//to change name box border color while entering text
myForm.name.onfocus =function() {
    myForm.name.style.border ="4px solid pink";
};

myForm.name.onblur =function() {
    myForm.name.style.border ="none";
};



