// Is any element less than k (Contest)
// easy
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array "a" of non-Integers, check if any integer in the array is less than k.
// Input
// The first line contains two Integers n and k, which is the size of the array and k.
// The second line contains n space- separated Integers, that is array elements.

// Constraints
// 1 ≤ n ≤ 100
// 1 ≤ k ≤ 100
// 1 ≤ a[i] ≤ 100
// Output
// Print "true" if any element of array is less than k, otherwise "false".
// Example
// Sample 1:
// Input:
// 4 3
// 1 1 4 8
// Output:
// true
// Explanation:
// Both Integers at Indices 0 and 1 are less than k=3.






//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = false;
        for(int i=0; i<n; i++){
            if(arr[i] < k){
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}