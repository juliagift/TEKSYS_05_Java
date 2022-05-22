function Person(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
  }
  var myFather = new Person("John", "Doe", 50, "blue");
  var myMother = new Person("Sally", "Rally", 48, "green");
  // Adding a Property to an Object
  myFather.birthday = "15th june";
  myMother.birthday = "16th june"; 
  console.log(myFather);
  console.log(myMother);

  
  var simObj = function(c){
    this.city = c;
    }
    var live1 = new simObj("Brooklyn");
    var live2 = new simObj("Bronx");
    console.log(live1)
    console.log(live2)
    
   simObj.state = "New York"
   console.log(simObj.state)
 console.log(live2.city)    //Result → New York
 console.log(live2.state)   //  undefined

 var d = new Date() //  e.g of new Date()
console.log( d )

var d = new Date(2021,11,24,10,33,30,0); // e.g of new Date(year, month, ...)
console.log(d)

var d = new Date(2021, 11, 24); // e.g of new Date(year, month, ...)
console.log(d)

var d = new Date("October 13, 2021 11:13:00"); // e.g of new Date(dateString)
console.log(d)

var d = new Date(86400000);  //  new Date(milliseconds)
console.log(d)

let x = Math.random() * (12 - 6) + 6;
console.log(x)
console.log(3>2 && 5>3)//t
console.log(3==3)  //t
console.log(3===3)  //t
console.log("3"==3)  //t
console.log("3"===3)  //f
console.log("3"=="3")  //t
console.log("3"==="3") //t

var myNumber = 9;
console.log(myNumber++); //9

var newmyNumber = 9;
console.log(newmyNumber--); //9

var newNumber1 = 7;
var currentNumber1 = newNumber1++;
console.log(currentNumber1); //7, but why?
 
var newNumber = 7;
var currentNumber = ++newNumber;
console.log(currentNumber) //8

for(var i = 0; i <= 10; i++);
{
  console.log(i); //11
}

var j = 1;
do {
  let value = j * 2;
  j++;
  console.log(value);
} while (j <= 5);  //2 4 6 8 10

var a = [1,2,3,4,5,6,7,8];
a.splice(4); // Returns [5,6,7,8]; a is [1,2,3,4]
console.log(a);
a.splice(1,2); // Returns [2,3]; a is [1,4]
console.log(a);
a.splice(1,1); // Returns [4]; a is [1]
console.log(a);
