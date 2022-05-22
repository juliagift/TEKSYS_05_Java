//forloop
// let arr = [1, 2, 3];

// for(let i = 0; i < arr.length; i++) {
//     //console.log(i);  //0, 1, 2
//     console.log(arr[i]); //1, 2, 3
// }

//forEach is a function and it takes a param called callBackFunction
// arr.forEach(function(idx) {
//     console.log(idx);  //1, 2, 3
// })

//arr.forEach(idx=>console.log(idx));  //1, 2, 3

//.map()- creates a new array
// let newMap = arr.map(function(val) {
//     return val*2;
// })
// console.log(arr); //[1, 2, 3]
// console.log(newMap); //[2, 4, 6]

// let newMap = arr.map((val) =>{
//     return val*2;
// })
// console.log(arr); //[1, 2, 3]
// console.log(newMap); //[2, 4, 6]

//filter out diff elements of an array
//let filterArray = ['spray', 'can', 'limit', 'apple'];

// let result = filterArray.filter(function(word) {
//     return word.length >= 4;
// })
// console.log(result); //['spray', 'limit', 'apple']

// let result = filterArray.filter((word) => word.length >= 4);
// console.log(result); //['spray', 'limit', 'apple']

// let result = filterArray.map(idx => {
//     return idx
// }).filter(val => {
//     return val.length <=4
// });
// console.log(result); //['can']

// function add() {

// }

//es6
// const add = (a, b) => {
//     return a + b;
// }

// let sum = add(5, 5);
// console.log(sum);  //10

// const add = (a, b) => {
//     let c = '8';
//     return a + b + c;
// }

// let sum = add(5, 5);
// console.log(sum);  //108  concatenated string

// const add = (a, b) => {
//     let c = '8';
//     return a + b + parseInt(c);
// }

// let sum = add(5, 5);
// console.log(sum);  //18

// const add = (a, b) => {
//     let c = '8';
//     return a + b + Number(c);
// }

// let sum = add(5, 5);
// console.log(sum);  //18

// const add = (a, b) => {
//     let c = '8';
//     return a + b + (+c);
// }

// let sum = add(5, 5);
// console.log(sum);  //18

// const add = (a, b) => {
//     let c = '8';
//     let cn = Number(c);
//     return a + b + cn;
// }

// let sum = add(5, 5);
// console.log(sum);  //18


//eval- evaluates js code represented as a string. not recommended
// console.log(eval('5 + 5'));  //10
// console.log(eval('5' + '5'));  //55 doesn't work as intended

//Error
//NaN
// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// let result = nanNumber('5');
// console.log(result); //5

// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// let result = nanNumber(5);
// console.log(result); //5

// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// let result = nanNumber('str');
// console.log(result); //NaN

// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// let result = nanNumber(typeof('5'));
// console.log(result); //NaN
// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// let result = nanNumber(5);
// console.log(result); //5

// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// let result = nanNumber('5');
// console.log(result); //5
// const nanNumber = (x) => {
//     if(isNaN(x)) {
//         return NaN;
//     }
//     return x;
// }
// console.log(typeof '5'); //string

// let arrTwo = [2, 5, NaN, 12, '30'];
// console.log(arr.indexOf(2));  //1 false
// console.log(arr.indexOf(1));  //0 true
// console.log(arr.indexOf(4));  //-1

// const nanNumber = (n) => {
//     for(let i = 0; i < arrTwo.length; i++) {
//         if(isNaN(n)) {
//         return NaN;
//     }
//     return n;
//     }
    
// }
// let result = nanNumber(arrTwo);
// console.log(result); //NaN
// console.log(arrTwo.indexOf(NaN)); //-1



// let arr = [1, 2, 3, 5, 7, 8, 9, 0, 3];
// //slice does not affect the original array
// //returns a new array
// console.log(arr.slice(5)); //[8, 9, 0, 3]
// console.log(arr); // [1, 2, 3, 5, 7, 8, 9, 0, 3]

// //does not return a new array
// //modifies the original array
// console.log(arr.splice(5)); //[8, 9, 0, 3]
// console.log(arr); // [1, 2, 3, 5, 7]

// let spArr = [];
// let a = arr.splice(5);

// console.log(a);  //[8, 9, 0, 3]


// let arr = [1, 2, 3];

// for(let i = 0; i < arr.length; i++) {
//     try {
//         console.log(arr[i] !== 5);
       
//     } catch {
//         console.log("Error on line 5");
//     }
// }

//closure
// function outerFunction() {
//     let str = 'This string';

//     function innerFunction() {
//         console.log(str);
        
//     }
//     innerFunction();
// }
// let innerFunctionRes = innerFunction();
// let newResult = outerFunction();

// //console.log(innerFunctionRes); //uncaught referenceerror
// console.log(newResult);

// function outerFunction(x) {
//     let str = 'This string';

//     function innerFunction(y) {
//         console.log(str);
        
//     }
//     innerFunction();
// }
// let outerFunctionRes = outerFunction(5);

// console.log(outerFunctionRes); //this string this string undefined

//js closures
function outerFunction(x) {
    //returning outer function
    return function(y) {  //anonymous function
        //returning the innerfunction
        return x + y;
    }
}
let addFive = outerFunction(5);  //addfive is the closure

console.log(addFive(2)); //7
