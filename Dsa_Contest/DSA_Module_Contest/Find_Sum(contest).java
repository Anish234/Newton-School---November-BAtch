// Find Sum (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a sequence of 10 non- negative Integers, and print the sum of all these 10 integers.
// Input
// The first line contains 10 space- separated integers.

// Constraints
// 0 ≤ every integer ≤ 100
// Output
// Print the sum of all these numbers.
// Example
// Sample Input 1 :
// 1 2 3 4 5 6 7 8 9 0

// Sample Output 1 :
// 45







//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<10; i++){
            sum += sc.nextInt();
        }
        System.out.print(sum);
    }
}