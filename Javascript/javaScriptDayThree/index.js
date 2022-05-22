let header = document.getElementById('header_title')
//let container = document.getElementsByClassName('container')
console.log(header)
//console.log(container)

// let items = document.getElementsByName('list-group-item')
// for(item of items) {
//     console.log(item)
// }

//let li = document.getElementsByTagName('li')
// for(item of li) {
//     console.log(item)
// }


// let arr = Array.prototype.slice.call(li, 1, 3)

// for(item of arr) {
//     console.log(item)
// }

// let selectId = document.querySelector('#header_title')
// console.log(selectId)

// let selectClass = document.querySelector('.selectClass')
// console.log(selectClass)

// let selectClass1 = document.querySelector('p.test')
// console.log(selectClass1)

// function showChange() {
//     let change = "change the text"
//     document.getElementById('myChange').value=change
// }


//check
// let menu = document.getElementById('menu')

// let li = document.createElement('li')

// li.textContent = "my new item 6"

// menu.appendChild(li)
// console.log(menu.innerHTML)


// let divOne = document.createElement('div')
// divOne.id = 'content';
// divOne.className = 'notes'
// divOne.innerHTML = '<p> create new element </p>'
// document.body.appendChild(divOne)

// let hTwo = document.createElement('h2')
// h2.textContent = 'Added a h2 element to div'
// divOne.appendChild(hTwo)


// function menuItemCreate(name) {
//     let li = document.createElement('li')
//     li.textContent = name
//     return li
// }
// const menu = document.querySelector('#menu')
// menu.appendChild(menuItemCreate('Home'))
// menu.appendChild(menuItemCreate('About'))
// menu.appendChild(menuItemCreate('Blog'))

let btnOne = document.getElementsByClassName('btnOne')

function btnClick() {
    console.log("is clicked")
    const s = document.querySelector("span")

    s.textContent = "I have been changed"
    btnOne.textContent = "I was clicked..."
}

btnOne[0].addEventListener('click', btnClick)

document.addEventListener("keypress", function() {
    console.log("you pressed any key")
    console.log("key", e.code)
    console.log("key", e.key)
})

const message = document.querySelector("#message");
const result = document.querySelector("#result")

message.addEventListener("input", function() {
    result.textContent = this.value;
})

