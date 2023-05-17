// Suzzu's Skills (Contest)
// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Suzzu learned about bitonic arrays in her DSA class. So her friend Yash asks to find the element in the bitonic array A. Suzzu's DSA skills are incredibly strong, she solved the problem in a minute can u solve it?
// You need to print the index of the element (0- based indexing) if it's present in the array otherwise print -1.

// Note: A Bitonic Sequence is a sequence of numbers that is first strictly increasing and then after a point strictly decreasing.
// Input
// The first line of the input contains two space-separated integers N and K, representing the size of an array and the element to be found.
// The second line of the input contains N space-separated integers denoting the bitonic array A.

// Constraints
// 1 ≤ N ≤ 105
// -106 ≤ A[i], target ≤ 106
// Output
// Print in a single line the index of the element (0- based) if present in the array else print -1.
// Example
// Sample Input
// 7 20
// -3 9 18 20 17 5 1
// Sample Output
// 3
// Explanation
// 20 is present at index 3 in array A.







//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = -1;
        for (int i=0; i<n; i++) {
            if (arr[i] == k) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}