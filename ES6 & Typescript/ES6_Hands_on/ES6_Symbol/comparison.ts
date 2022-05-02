//Code 1: The code shows the scenario when symbol is not used.
var marks = {}
marks["Joe"] = 100
marks["Ana"] = 90
marks["Chloe"] = 95
marks["Marie"] = 75
console.log(marks)
console.log('Another student with' + ' name Chloe appears')
marks['Chloe'] = 60
console.log('After the marks of the' + ' fifth student is entered')
console.log(marks)

//Code 2: The code shows the scenario when symbol is used
var marks={}

var sym1=Symbol("Joe")
marks[sym1]=100
var sym2=Symbol("Ana")
marks[sym2]=90
var sym3=Symbol("Chloe")
marks[sym3]=95
var sym4=Symbol("Marie")
marks[sym4]=75
console.log(marks)
console.log('Another student ' + 'with name Chloe appears')
var sym5=Symbol("Chloe")
marks[sym5]=60
console.log('After the marks of ' + 'the fifth student is entered')
console.log(marks)