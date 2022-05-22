// //Task A: Box
// let string = "";  
// let width = prompt("Enter the width") //column
// let height = prompt("Enter the height") //row

// for(let i = 0; i < height; i++) {
//     for(let j = 0; j < width; j++) {
//         string += "*";
//     }
//     string += "\n";
// }
// alert(`Input width: ${width}\nInput height: ${height}\n\nShape:\n${string}`)

//Task B: Checkerboard
// var string = "";  
// var width = prompt("Enter the width") //column
// var height = prompt("Enter the height") //row

// for (var row = 0; row < height; row++) {
//     for (var col = 0; col < width; col++) {
//         if((row + col) % 2 == 0) {
//             string += "* ";
//         } else {
//             string += " ";
//         }
//     }
//      string += "\n"; 
// }
// alert(`Input width: ${width}\nInput height: ${height}\n\nShape:\n${string}`)

//Task C: Cross
// let string = ""; 
// let input = prompt("Enter the shape size") 

// for(let i = 0; i < input; i++) {
//     for(let j = 0; j < input; j++) {
//         if(i == j || i+j+1 == input) {
//             string += "*";
//         } else {
//             string += " ";
//         }
        
//     }
//     string += "\n";
// }
//  alert(`Input size: ${input}\n\nShape:\n${string}`)

//  Task D: Lower Triangle
// let string = ""; 
// let input = prompt("Enter the side length") 

// for(let i = 0; i < input; i++) {
//     for(let j = 0; j <= i; j++) {
//         string += "*";
//     }
//     string += "\n";
// }
//  alert(`Input side length: ${input}\n\nShape:\n${string}`)

 //Task E: Upper Triangle
// let string = ""; 
// let input = prompt("Enter the side length") 

// for(let i = input; i > 0; i--) {
//     for(let j = input; j > i; j--) {
//         string += " ";
//     }
//     for(let k = 0; k < i; k++) {
//         string += "*";
//     }
//     string += "\n";
// }
//  alert(`Input side length: ${input}\n\nShape:\n${string}`)

 //Task F: Upside-down trapezoid
 let string = "";  
 let spaces = 0;
 let stars = 0;
 
 let width = prompt("Enter the width");
 let height = prompt("Enter the height");
 
 for(let row = 0; row < height; ++row) {
     for(let col = height + row; col > 0; --col) {
         if(height % 6 == 1) {
             alert(`Input width: ${width}\nInput height: ${height}\n\nImpossible Shape!`);
         }
         string += " ";
     }
     for(let col = 0; col < (width - 2 * row); ++col) {
         string += "*";
 
         spaces += 1;
         stars -= 2;
     }
     string += "\n";
 }
 alert(`Input width: ${width}\nInput height: ${height}\n\nShape:\n${string}`)  
 