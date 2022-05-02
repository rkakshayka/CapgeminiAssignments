var Order = {
    id: 1001,
    title: "Chocolate",
    price: 100,
    printOrder: function () {
        return this.id + " " + this.title;
    },
    getPrice: function () {
        return this.price;
    }
};
var copyOrder = Object.assign({}, Order);
console.log("-----Question 3------");
console.log(copyOrder);
