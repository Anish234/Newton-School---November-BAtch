// 3ple
// easy
// Time Limit: 1 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a positive integer N. Print "Yes" if N is a multiple of 3, otherwise, print "No".
// Input
// The input consists of a single integer N.

// Constraints:
// 1 ≤ N ≤ 1000
// Output
// If N is a multiple of 3, print "Yes". Otherwise, print "No" (without the quotation marks). Note that the output is case-sensitive.
// Example
// Sample Input 1:
// 6

// Sample Output 1:
// Yes

// Sample Input 2:
// 10

// Sample Output 2:
// No

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%3==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}