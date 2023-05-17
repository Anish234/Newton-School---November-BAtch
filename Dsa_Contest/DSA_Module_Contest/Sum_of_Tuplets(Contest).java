// Sum of tuplets (contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a sequence A of length N. Find the sum of the products of all the tuples of three indices (disregarding order) present in the sequence.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function solve() that takes an integer N and an array A as parameter.

// Constraints
// 3<=N<=50
// 1<=Ai<=50
// Output
// Return one integer - the sum of products of all the tuples of three indices (disregarding order) present in the array.
// Example
// Sample Input:
// 4
// 1 2 4 5

// Sample Output:
// 78

// The different tuples of the three indices are (1, 2, 3), (1, 2, 4) and (2, 3, 4). The product of values (present)at these indices are 1*2*4 = 8, 1*4*5 = 20, 2*4*5 = 40 and their sum is 78.









class Solution {
    long solve(int[] A, int N) {
        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    sum += A[i] * A [j] * A[k];
                }
            }
        }
        return sum;
    }
}