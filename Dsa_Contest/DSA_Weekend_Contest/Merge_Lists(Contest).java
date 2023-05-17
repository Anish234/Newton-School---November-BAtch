// Merge Lists(Contest)
// easy
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Array List In Java

// There are two arraylists arr1 and arr2 are given having n and m integers respectively. There is an integer index ind also given as input. Write a Java program to merge arraylist arr2 in arraylist arr1 at index ind.
// print the elements of modified arraylist arr1.
// Input
// There are two integers n and m, lengths of arraylist arr1 and arr2 are given in first line of input.
// In Second line, n space separated integer of arraylist arr1 are given.
// In third line, m space separated integer of arraylist arr2 are given.
// in fourth line an index ind is given.

// Constraints
// 1 <= n, m <= 105
// 1 <= arr1[i], arr2[j] <= 105
// 0 <= i <= n-1
// 0 <= j <= m-1
// 0 <= ind <= n-1
// Output
// Print the elements of modified arraylist arr1.
// Example
// Sample Input:
// 4 5
// 1 2 3 4
// 6 7 8 9 10
// 1

// Sample Output:
// 1 6 7 8 9 10 2 3 4



//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            arr1.add(sc.nextInt());
        }
        for(int i=0; i<m; i++){
            arr2.add(sc.nextInt());
        }

        int ind = sc.nextInt();
        for(int i=0; i<m; i++){
            arr1.add(ind + i, arr2.get(i));
        }
        for(int i=0; i<arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }
    }
}
