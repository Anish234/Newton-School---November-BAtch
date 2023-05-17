// Alternative Sum (contest)
// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a sequence A of N integers. Find its alternative sum. For example, suppose N = 5 and the sequence is 1, 2, 3, 4, 5. Its alternative sum would be +1-2+3-4+5 = 3. The first term is added with a positive sign, the second one with a negative and so on.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function solve() that takes an integer N and an array A as parameter.

// Constraints
// 2<=N<=100
// 1<=Ai<=100
// Output
// Return the given sum.
// Example
// Sample Input:
// 3
// 1 2 3

// Sample Output:
// 2

// The alternate sum will be:
// // +1-2+3 = 2a







// your code is here

class Solution {
    public long solve(int N, int[] A) {
       long res = 0;
       for(int i=0; i<N; i++){
           if(i%2==0){
               res+=A[i];
           }
           else{
               res-=A[i];
           }
       }
       return res;
    }
}