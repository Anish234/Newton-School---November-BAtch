// Inverted half pyramid (Contest)
// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an integer n, you have to print a Inverted half pyramid of size n.
// Input
// The first line contains a single Integer n.

// Constraints
// 1 ≤ n ≤ 100
// Output
// Print inverted half pyramid of size n.
// Example
// Sample 1:
// Input:
// 3
// Output:
// 1 2 3
// 1 2
// 1
// Explanation:
// Inverted half pyramid of size 3.










//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}