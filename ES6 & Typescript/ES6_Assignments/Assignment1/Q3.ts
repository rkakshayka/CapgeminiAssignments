var Order = {
    id: 1001, 
    title: "Chocolate", 
    price: 100,
    printOrder(){
        return this.id+" "+this.title;
    },
    getPrice(){
        return this.price;
    }
};

let copyOrder = Object.assign({}, Order);
console.log("-----Question 3------");
console.log(copyOrder);