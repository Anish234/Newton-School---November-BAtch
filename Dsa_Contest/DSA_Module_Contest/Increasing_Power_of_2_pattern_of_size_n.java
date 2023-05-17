// Increasing power of 2 (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an integer n, you have to print a Increasing power of 2 pattern of size n.
// Input
// The first line contains a single Integer n.

// Constraints
// 1 ≤ n ≤ 15
// Output
// Print Increasing power of 2 pattern of size n.
// Example
// Sample Input:
// 4

// Sample Output:
// *
// **
// ****
// ********

// Explanation
// 2^0 = 1
// 2^1 = 2
// 2^2 = 4
// 2^3 = 8









//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<(1<<i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}