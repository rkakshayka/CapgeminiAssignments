class Obj{
    name;
    length;
    constructor(name:string){
        this.name = name;
        this.length = name.length;
    }
}

console.log("-----Question 4------");

let outputArray = (...objects: Array<object>) =>{
    console.log("objects array: ",objects);
}

let names = ['Tom', 'Ivan', 'Jerry'];
let [name1, name2, name3] = names;
const namesObj1 = new Obj(name1);
const namesObj2 = new Obj(name2);
const namesObj3 = new Obj(name3);

outputArray(namesObj1, namesObj2, namesObj3);