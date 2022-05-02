//let employee = ["Chandler", "Bing", "Female"];
//let [fname, lname, gender="Male"] = employee;
var employee = {
    fname: "Chandler",
    lname: "Bing",
    gender: "Male"
};
var fname = employee.fname, lname = employee.lname, gender = employee.gender;
console.log(fname);
console.log(lname);
console.log(gender);
/* With Alias
let {fname: f, lname: l, gender: g} = employee;
console.log(f);
console.log(l);
console.log(g);
*/ 
