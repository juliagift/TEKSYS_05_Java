//select the elements
let input = document.querySelector("#email");
let btn = document.querySelector("#btn");
let message = document.querySelector("#successMsg");
let tag = document.querySelector("#text");
let remove = document.getElementsByClassName("remove");   //querySelectorAll(".remove");

console.log("input", input);
console.log("button", btn);


//take the event you want to have then add a callback function

let arrList = [];

//appending a close button to each element
let myList = document.querySelectorAll("li");
console.log(myList)

for(let i = 0; i < myList.length; i++) {
    //if(myList[i] === null) {
        //create span tag on li tag
        let sp = document.createElement("span");
        let txt = document.createTextNode("\u00d7");
        sp.className = "remove";
        sp.appendChild(txt);
        myList[i].appendChild(sp);
    //}
    
}

//remove
for(let i = 0; i < remove.length; i++) {
    remove[i].onclick = function() {
        let div = this.parentElement;
        div.style.display = "none";
        console.log(remove, "remove function");
    }
}



//events- click, load, mouseOver
//add function
//later on add a class or id selector to the li tag
//btn.addEventListener("click", function(event) {
function add(event) {    
    //event.preventDefault();   //prevents the page from reloading unnecessarily//want reload what u apppended
    let li = document.createElement("li");
    let inputVal = document.getElementById("email").value;
    let tex = document.createTextNode(inputVal);
    //let text = input.textContent
    li.appendChild(tex);

    if(inputVal === "") {
        alert("Must add an email");
    } else {
        document.getElementById("text").appendChild(li);
        input.value = "";  //erase input when finished
        message.innerHTML = "success";
    }

    //document.querySelector("inputVal").value = "";

    let sp = document.createElement("span");
    let txt = document.createTextNode("\u00d7");
    sp.className = "remove";
    sp.appendChild(txt);
    li.appendChild(sp);
    
    for(let i = 0; i < remove.length; i++) {
        remove[i].onclick = function() {
            let div = this.parentElement;
            div.style.display = "none";
        }
    }
    console.log(event);  //click event
}

console.log("Array list", arrList);

