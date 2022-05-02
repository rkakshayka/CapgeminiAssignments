//5. a.
var add = (val=10) => val; 
console.log("------Question 5 a--------");

console.log(add());
console.log(add(20));

//5. b.
function userFriends(username: string, ...friends: string[]){
    console.log("------Question 5 b--------");
    console.log("username: ",username);
    console.log("friends: ",friends);

    for(let i in friends){
        console.log(friends[i]);
    }
}

userFriends('Akshay','Aditya','Kaushik');

//5. c.
function printCapitalNames(...names: string[]){
    console.log("------Question 5 c--------");
    console.log(names);
    
    for(let i in names)
        console.log(names[i].toUpperCase());
}

let capitalNames = ['Akshay','Aditya','Kaushik'];
printCapitalNames(...capitalNames);