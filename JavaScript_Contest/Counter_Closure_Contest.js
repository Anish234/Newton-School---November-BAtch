// Counter Closure
// easy
// Problem Statement
// Create a function called createCounter that takes in a number (initialValue) as an argument and returns an object with two methods: increment and decrement.

// The increment method should increment the number by 1 and return the updated value.

// The decrement method should decrement the number by 1 and return the updated value.


// On calling the increment and decrement methods at various times, the operations should be on the initialValue and the initialValue should be updated and stored so that the next time any of these methods is called the operation is on the updated value and that updated value is stored as well. Use closure to complete this task.
// Input
// The createCounter function takes a number as an argument
// Output
// The createCounter function should return an object.
// Inside the object, both increment and decrement methods should return a number.
// Example
// const counter = createCounter(5);

// console.log(counter.increment()); // prints 6
// console.log(counter.increment()); // prints 7
// console.log(counter.decrement()); // prints 6






//your code is here

function createCounter(initialValue) {
    let value = initialValue;
  
    return {
      increment() {
        value += 1;
        return value;
      },
      decrement() {
        value -= 1;
        return value;
      }
    }
  }