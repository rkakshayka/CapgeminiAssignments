var FibonacciSeries = /** @class */ (function () {
    function FibonacciSeries() {
        this.previousNumber = Symbol();
        this.currentNumber = Symbol();
        this.previousNumber = -1;
        this.currentNumber = 1;
    }
    FibonacciSeries.prototype.next = function () {
        var curNumber = Symbol();
        curNumber = this.previousNumber + this.currentNumber;
        this.previousNumber = this.currentNumber;
        this.currentNumber = curNumber;
        return curNumber;
    };
    return FibonacciSeries;
}());
var fibonacciSeries = new FibonacciSeries();
console.log("-----Question 1-----");
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
console.log(fibonacciSeries.next());
