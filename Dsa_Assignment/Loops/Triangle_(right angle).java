// Triangle (right angle)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Write a program to print the pattern of "*" in the form of the Right Angle Triangle.
// See the below example for clarity.
// Input
// Since this is a functional problem, you don't have to worry about the input. It will be handled by driver code. You just have to complete printTriangle().

// In the custom input area, you can provide any positive integer and check whether your code is working or not.
// Output
// Print the right angle triangle of height 5 as shown.
// Example
// Sample Input:
// No Input

// Sample Output:-
// *
// * *
// * * *
// * * * *
// * * * * *

static void printTriangle(){
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++)
            System.out.print("* ");
            System.out.println();
    }

}