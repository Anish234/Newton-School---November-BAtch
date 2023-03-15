// Max Profit
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// The cost of stock on each day is given in an array A[] of size N. If you can only perform at most two transactions what is the maximum profit you can gain.

// Note:- The second transaction can only start after the first one is complete (Sell- >buy- >sell- >buy).
// Input
// The first line of input contains a single integer N. The next line of input contains N space-separated integers depicting the values of A[].

// Constraints:-
// 2 <= N <= 10000
// 1 <= A[i] <= 1000000000
// Output
// Print the maximum profit gain in at most two transactions.
// Example
// Sample Input:-
// 5
// 3 5 2 8 3

// Sample Output:-
// 8

// Explanation:-
// Buy at index 1, sell at index 2, Buy at index 3, sell at index 8.

// Sample Input:-
// 4
// 1 2 4 5

// Sample Output:-
// 4


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        long[] left = new long[n];
        long[] right = new long[n+1];
        long m;

        m = a[0];
        for(int i=1; i<n; i++){
            m= Math.min(m, a[i]);
            left[i] = Math.max(a[i]-m, left[i-1]);
        }
        m = a[n-1];
        for(int i=n-2; i>=0; i--){
            m = Math.max(m, a[i]);
            right[i] = Math.max(m-a[i], right[i+1]);
        }
        long ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(ans, left[i] + right[i+1]);
        }
        System.out.println(ans);
    }
}