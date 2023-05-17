// Element position
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// An array of unique elements is given to you. Find the index of an element k if present in the array. If the element is not present in the array print -1.

// Example
// An input array is given: 2 3 4 5
// k = 6
// 6 is not present in the given array hence the output will be -1.
// Input
// The first line contains an integer n (size of array nums).
// In the second line, n space- separated integers are given.
// In the third line, an integer k is given.

// Constarints
// 1 ≤ n ≤ 105
// 0 ≤ nums[i] ≤ 106
// 0 ≤ i ≤ n-1
// Output
// Find the index of an element k if present in the array, else -1.
// Example
// Sample Input:
// 5
// 1 4 3 2 5
// 3

// Sample Output:
// 2

// Explanation: Index of element 3 is 2. So the answer will be 2.







// your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index = -1;
        for(int i=0; i<n; i++){
            if(nums[i] == k){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}