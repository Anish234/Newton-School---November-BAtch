// Ice cream
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Sara is fond of ice cream initially she had N ice creams with her. If Sara eats exactly half of the ice cream she has in a day and the remaining icecreams get tripled each night. How many ice creams does Sara have at the end of D-days?
// Note:-
// Take the floor value while dividing by 2.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function Icecreams() that takes integers N and D as parameters.

// Constraints:-
// 1 <= N <= 100
// 1 <= D <= 20
// Output
// Print a single integer denoting the number of ice creams at the end of D days.
// Example
// Sample Input 1:-
// 5 1

// Sample Output 1:-
// 9

// Explanation:-
// Sara will eat 2 ice creams and the remaining 3 will be tripled i. e 9.

// Sample Input 2:-
// 5 3

// Sample Output 2:-
// 24


static void Icecreams (int N, int D){
    //Enter your code here
        for(int i=0; i<D; i++)
        N = ((N-N/2)*3);
        System.out.print(N);
    }