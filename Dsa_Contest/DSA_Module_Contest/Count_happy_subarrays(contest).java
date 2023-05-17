// Count happy subarrays (Contest)
// easy
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array "a" of non-negative Integers, count the number of happy subarrays of the array.
// Happy subarrays are those whose sum of elements is divisible by the length of the subarray.

// Note: The size of the subarray should be at least 1.
// Input
// The first line contains a single Integer n, which is the size of the array.
// The second line contains n space-separated Integers, that is array elements.

// Constraints
// 1 ≤ n ≤ 100
// 1 ≤ a[i] ≤ 100
// Output
// Print the count of Happy Subarrays.
// Example
// Sample Input:
// 4
// 1 1 4 8

// Sample Output:
// 7

// Explanation:
// subarrays [1], [1], [4], [8], [1,1], [4,8], [1,1,4] are happy subarrays.








//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int [N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=i; j<N; j++){
                sum += arr[j];
                if(sum % (j-i+1) == 0)
                count++;
            }
        }
        System.out.print(count);
    }
}