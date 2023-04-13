// Find the missing number in O(n) time
// easy
// Problem Statement
// Being told that an unsorted array contains (n - 1) of n consecutive numbers (where the bounds are defined), find the missing number in O(n) time.

// The bounds tell that all the numbers between the lower bound and the upper bound are present in the array except one number which is missing. You have to find that missing number.
// Input
// The function takes three arguments , the first argument is the array of integers, the second argument is the upper bound and the third argument is the lower bound.
// All the numbers between the lower and the upper bounds are present in the array (inclusive of both upper and lower bound) except one number which is missing.

// Input is provided in the form of an array which would have 3 elements. The first element is the array of integers, the second element is the upper bound and the third element is the lower bound. All three elements are used internally to call the function.
// Example: [[1, 4, 3] ,4, 1]
// Here, [1,4,3] is the array of integers
// 4 is the upper bound
// 1 is the lower bound
// Output
// The function should print the missing number in the console.




// your code is here

function findMissingNumber(arrayOfIntegers, upperBound, lowerBound) {
    let total_sum = 0;
  
    // Calculate the sum of all the numbers from lower_bound to upper_bound
    for (let i = lowerBound; i <= upperBound; i++) {
      total_sum += i;
    }
  
    // Subtract the sum of all numbers in the array from the total sum
    for (let i = 0; i < arrayOfIntegers.length; i++) {
      total_sum -= arrayOfIntegers[i];
    }
  
    // The difference is the missing number
    console.log(total_sum);
  }