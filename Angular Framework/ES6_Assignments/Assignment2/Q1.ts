class FibonacciSeries{

    private previousNumber = Symbol();
    private currentNumber = Symbol();

    constructor(){
        this.previousNumber = -1;
        this.currentNumber = 1;
    }

    next(){
        let curNumber = Symbol();

        curNumber = this.previousNumber + this.currentNumber;
        this.previousNumber = this.currentNumber;
        this.currentNumber = curNumber;

        return curNumber;

    }
}

let fibonacciSeries = new FibonacciSeries();
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