// Special Triangle
// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Ralph likes to play with shapes, he chooses a number n of his choice and tries to make a special triangle shape out of it containing n rows.
// Input
// The input contains N as an input.

// Constraint:
// 1 ≤ N ≤ 20
// Output
// Print a special triangle pattern of numbers of height N.
// Example
// Input:
// 5
// Output:

 

// * 

// * * 

// * * * 

// * * * * 

// * * * * * 

// * * * * 

// * * * 

// * * 

// *













//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i=1; i<N; i++){
            for(int j=i; j<N; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}