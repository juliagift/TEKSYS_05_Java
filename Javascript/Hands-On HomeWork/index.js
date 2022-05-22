// let body = document.querySelector('body');
//let script = document.querySelector('script');
let div = document.createElement('div');
div.className = 'chatwindow';
div.textContent = 'Chat Window';
document.body.appendChild(div);


let form = document.createElement('form');
form.name = 'message';
document.body.appendChild(form);

let input = document.createElement('input');
input.type = 'text';
input.name = 'username';
input.id = 'username';
input.placeholder = 'name';
document.body.form.appendChild(input);
