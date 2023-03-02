// Problem Statement
// There is an integer N given as input. Count all Strong numbers between 1 and n.
// Note: Strong numbers are the number which are divisible by either 5 or 7.
// Input
// There is an integer n is given as input.

// Constraints
// 1 ≤ N ≤ 105
// Output
// Return count of all string numbers in range of 1 to n.
// Example
// Sample Input:
// 10

// Sample Output:
// 3

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if((i%5==0) || (i%7==0)){
                count++;
            }
        }
        System.out.println(count);
    }
}