// var nameOne = "String";
// var number = 234523;
// var booleanType = true;

// let nameTwo = "string";
// let numberTwo = 2345.234523;
// let booleanTypeTwo = true;

// nameOne = 'Julia'
// nameTwo =  'Sara'

//const does not change
// const nameThree =  " "
// nameThree = 'blue'

// console.log("var type", nameOne);
// console.log("let type", nameTwo);
// console.log("const type", nameThree);
// console.log("var type", number);
// console.log("var type", booleanType);

//
// function newMessage(num, msg) {
//   for (let i = 0; i < num; i++) {
//     console.log(i);
//   }
// }

//newMessage(5, "Hello");

// function add(numOne, numTwo) {
//     let result = numOne+numTwo
//     return result
// }

// let result = add(3,5)
// console.log(result)

//defining an object in js
// let person = {
//     first_name:'Luke',
//     last_name:'Skywalker',
//     job:"Jack of all trades"
// }

// //console.log(person.first_name)

// //in looping over an obj  //of looping over an array
// function printSomething(p) {
//     for(let i in p) {
//         console.log(i + ": " +p[i])
//     }
//     console.log('outside of the forloop',  ": " +p[0])
// }

// console.log(printSomething(person))

//glogal scope- outside functions
// var name = "global"

// function check() {
//     let name = "local";
//     return name;
// }
// let result = check();
// console.log(result)
//console.log(name)

//glogal scope- outside functions
// let name = "global"

// function check() {
//     console.log(name)
//     var name = "local";
//     var myScope = "new Scope"
//     return [name, myScope];
// }
// let result = check();
// console.log(myScope)
// console.log(name)
// console.log(result)

//Comparison operator
//== : checks if the value is the same
//=== : datatype and value need to be the same
// console.log(3 == 3)  //true
// console.log(3 == '3')  //true

//=== most used
// console.log(7 === 7)  //true
// console.log(7 === '7')  //false

//logical operators
// console.log(56 < 70)   //true
// console.log(56 <= 70)   //true
// console.log(56 !== 70)  //true

// let score = 85;

// if(score < 90 && score > 80) {
//     console.log("B")
// }

/*

var x = 10;
var y = 4;

let operand = "*";

switch (operand) {
  case "+":
    console.log(x + y);
    break;
  case "-":
    console.log(x + y);
    break;
  case "*":
    console.log(x * y);
    break;
  case "%":
    console.log(x % y);
    break;
  default:
    console.log("I don't know what this is");
    break;
}
*/

// let x = 10;

// while(x < 20) {
//     console.log(x)
//     x++
// }

// do {
//     console.log("print")
// } while(10 < 9)

// let userInput = ""

// userInput = prompt("Enter your name")
// prompt(userInput)
// console.log(userInput)

let myLuckyNumber = 7;

if(myLuckyNumber === 0) {
    console.log("Not my number")
} else if(myLuckyNumber > 0) {
    console.log("yes")
} else if(m  < 0) {
    console.log("no")
} else {
    console.log("try again")
}