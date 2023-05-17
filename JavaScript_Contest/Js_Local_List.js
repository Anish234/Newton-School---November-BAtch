// JS Local List
// In this project, we will be a simple todo app, but saving them to local storage.

// So it shows the items we have added even after refreshing the page.

// The HTML markup is already set up for you, and you just need to implement the js part.

// When a user clicks #add-todo button, it adds the todo(which is written in input#todo-input) to ul#todo-holder element.

// Also, upon refreshing, all previously added todos should be displayed in the ul#todo-holder element.

// Note:- Use localstorage. All individual todo items are to be displayed in li tags inside ul







//your JS code is here

// javascript code goes here
//store todo items
let todos = [];

//retrieve todos from local storage
if (window.localStorage.todos !== undefined) {
    todos = JSON.parse(window.localStorage.todos);
}

//save todos to local storage
function saveTodos() {
    window.localStorage.todos = JSON.stringify(todos);
}

//add todo
const addTodoBtn = document.getElementById('add-todo');
addTodoBtn.addEventListener('click', () => {
    let todoInput = document.getElementById('todo-input');
    let todo = todoInput.value;
    todos.push(todo);
    saveTodos();
    todoInput.value = '';
    renderTodos();
});

//render todos
function renderTodos() {
    const todoHolder = document.getElementById('todo-holder');
    todoHolder.innerHTML = '';
    for (let i = 0; i < todos.length; i++) {
        let todo = todos[i];
        let li = document.createElement('li');
        li.innerText = todo;
        todoHolder.appendChild(li);
    }
    saveTodos();
}

//render todos when page is loaded
renderTodos();



