// Triple Even.
// easy
// Problem Statement
// Given an array of integers, you need to find out if the sum of all the even numbers in the array is divisible by 3 or not. If the sum is divisible by 3, then return 1, otherwise, return 0.
// Input
// Since this will be a functional problem, you don't have to take input. You just have to complete the function sumOfEvenDivisibleByThree that takes arr as a parameter.

// constraints
// 1<=array_size<=103
// 1 <= number <= 103
// Output
// You have to return 1 if the sum is divisible by 3, otherwise, return 0.
// Example
// Input:
// 7
// 1 2 3 4 5 8 7
// Output:
// 0
// Explanation:
// Even numbers in the given array are ( 2, 4, 8) which sum up to 14 which is not divisible by 3. So, we return 0.








//your code is here

public static int sumOfEvenDivisibleByThree(int[] arr) {
    int sum = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] % 2 == 0){
            sum += arr[i];
        }
    } 
    if(sum % 3 == 0){
        return 1;
    }
    return 0;
}