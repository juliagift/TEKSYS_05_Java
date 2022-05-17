// let name = "Bob";
// let hasJob = true;
// let age = 22;

//objects has a key/value pair
// let person = {
//   first_name: "Julia",
//   last_name: "Gift",
//   isWorking: false,
//   hasJob: true,
//   jobTitle: "Software Developer",
//   fullName: function() {
//       return this.first_name + " " + this.last_name
//   }
// };

//let obj={}
//to call functions- functionName()
//console.log(person.fullName()) //Julia Gift

// console.log(person);
// console.log(person[2])  //undefined
// console.log(person.first_name)  //Julia

//let names = ["Sara", "Erik", "Avani", "Adow", 234, true, 1234.45];
// console.log(names);  //["Sara", "Erik", "Avani", "Adow", 234, true, 1234.45]
// console.log(names[2])  //Avani
// console.log(names[5])  //true

//let car = {};

//attached to one class slide 12
// var obj1 = new Object();
// var str = new String();
// var num = new Number()
// var bool = new Boolean()
// var arr = new Array();
// var date = new Date()

//math obj are global
// Math.random();
// Math.floor();

// function Person(firstName, lastName, age, hasHair) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.age = age;
//     this.hasHair = hasHair;
//     this.changeName = function(name) {
//     this.lastName = name;
// }
// }

//slide 23 prototypes
// var newPerson = new Person("John", "Doe", 68, true);
// console.log(newPerson);
// let nameChange = newPerson.changeName("Jones");
// let result = newPerson;
// console.log(result);

// Person.prototype.age = 54;
// Person.prototype.firstName = "Jim";

// let nameChange = newPerson.changeName("Jones")
// console.log(nameChange);

// let names = ["Sara", "Erik", "Avani", "Adow", 234, true, 1234.45];

// let arr = [{ firstName: "me" }, { jobTitle: "dev" }, { laptop: "MSI" }];

// console.log(names.length); //7

// //removes the last item
// let lastItem = names.pop();
// console.log(lastItem); //1234.45

// console.log(names); //6 ["Sara", "Erik", "Avani", "Adow", 234, true];

// //removes the first item
// let firstItem = names.shift();
// console.log(firstItem); //Sara

// console.log(names); //5 ["Erik", "Avani", "Adow", 234, true];

// //push adds item to the end of the array
// let addItemEnd = names.push("Jane");
// console.log(addItemEnd); //Jane

// console.log(names); //6 ["Erik", "Avani", "Adow", 234, true, "Jane"];

// //adds items to the start of the array
// let addItemStart = names.unshift("Bob");
// console.log(addItemStart); //Bob

// console.log(names); //7 ["Bob", Erik", "Avani", "Adow", 234, true];

// function revWord(word) {
//   return word.split("").reverse().join("");
// }

// console.log(revWord("hello"));

// let str = "anything";
// //console.log(str.split(''))  //['a', 'n', 'y', 't', 'h', 'i', 'n', 'g'] split turns a string into an array

// //console.log(str.split(' '))   //['anything']

// console.log(str.slice(0, 3));

// console.log(str); //anything  not modifying original string

// console.log(names); //['Bob', 'Erik', 'Avani', 'Adow', 234, true, 'Jane']
// console.log(names.splice(0, 2, "Apple", "Kiwi")); //['Bob', 'Erik']
// console.log(names); //['Apple', 'Kiwi', 'Avani', 'Adow', 234, true, 'Jane']

// var date = new Date();
// console.log(date);
// console.log(date.getDay());
// console.log(date.getMonth());

// class Person {
//   constructor(firstName, lastName, age, hasHair) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.age = age;
//     this.hasHair = hasHair;
//     this.changeName = function (name) {
//       this.lastName = name;
//     };
//   }
// }

let arr1 = [22, 11, 667, 30, 33]


//call back function calls another function
let newLoop = arr1.forEach(function(n){
    console.log(n)
})

let newLoop2=[]
arr1.forEach((n)=> newLoop2.push(n))
console.log(newLoop2)


let newArr1 = [];

// for(let i = 0; i < arr1.length; i++) {
   
//    newArr1+=arr1[i]
//    newArr1.push(arr1[i])
// } 

// console.log(arr1[i]) //22, 11, 667, 30, 33
// console.log(newArr1)


//loop through an arr for of
// for(let i of arr1) {
//     newArr1.push(i**2)
// }

// console.log(newArr1)  //(5) [484, 121, 444889, 900, 1089]


// for(let i of arr1) {
//     if(i >= 40) {
//          newArr1.push(i)
//     }
// }

// console.log(newArr1)  //[667]

// function addOneMore() {

//}

//arrow functions
const addOne = a => {
    return a+1
}


console.log(addOne(2))

//slide 58
var input = prompt("Enter a range (in the form 23 34):")
var range = input.split(" ")
let guess = (Math.floor(Math.random() * (Number(range[1]) - Number(range[0])) + Number(range[0])))
var stopper = 0;
var userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}`)
while(stopper <= 10) {
    if(guess == userGuess) {
        alert("You got it: " +userGuess);
        break;
    }
    stop++;
    userGuess = prompt(`Keep guessing a number between ${range[0]} and ${range[1]}`)
}

if(guess != userGuess) {
    alert(`sorry, the answer was ${guess}`)
}