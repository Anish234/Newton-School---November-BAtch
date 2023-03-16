// Checking a Number
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Write a program to check whether a number is positive, negative or zero using switch case.
// Input
// The first line of the input contains the number

// Constraints
// -109 ≤ n ≤ 109
// Output
// Print the single line wether it's "Positive", "Negative" or "Zero"
// Example
// Sample Input :
// 13

// Sample Output :
// Positive

// Sample Input :
// -13

// Sample Output :
// Negative

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int num=scan.nextInt();//get input from the user for num
        if(num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}