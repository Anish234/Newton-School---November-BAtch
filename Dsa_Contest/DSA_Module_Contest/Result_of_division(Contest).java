// Result of division ( Contest )
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given two integers a and b. Find out which datatype is more suitable - "integer" or "double" - for storing the result of division of a and b i.e. b/a.

// Integer datatype is preferred if the result can be stored without any error.
// Input
// Only line contains two integers a and b.

// Constraints
// 1 ≤ a, b ≤ 1018
// Output
// Print a single string either "integer" or "double" denoting which data type is suitable.
// Example
// Input:
// 2 18

// Output:
// integer

// Input:
// 3 8

// Output:
// double


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(b % a == 0)
            System.out.println("integer");
        else
            System.out.println("double");
    }
}