// Rohit and chocolates
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Rohit's uncle gives him D chocolates for up to N days, He already has C chocolates with him if he eats one chocolate a day how many chocolates will he have at the end of N days?
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function Chocolates() that takes integers D, N and C as parameters.

// Constraints:-
// 1 <= D <= 100
// 1 <= N <= 100
// 1 <= C <= 100
// Output
// Return the number of chocolates at the end of N days
// Example
// Sample Input:-
// 5 5 5

// Sample Output:-
// 25

// Explanation:-
// At the end of the First day:- 5 + 5 - 1 = 9
// At the end of the Second day:- 9 + 5 - 1 = 13
// At the end of the Third day:- 13 + 5 - 1 = 17
// At the end of the Fourth day:- 17 + 5 - 1 = 21
// At the end of the Fifth day:- 21 + 5 - 1 = 25

// Sample Input:-
// 1 2 3

// Sample Output:-
// 3

static int Chocolates(int D, int N, int C){
    int total = C;
        for (int i = 1; i <= N; i++) {
            total += D;
            total -= 1;
        }
        return total;
}