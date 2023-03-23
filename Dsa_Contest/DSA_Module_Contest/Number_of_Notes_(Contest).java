// Number of Notes (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Smitha goes to a shop. She has notes of six denominations, i.e., $1, $2, $5, $10, $50, and $100. The total bill will be $X. Write a program to compute the smallest number of notes that will combine to give $X.
// Input
// The first line contains an integer T, the total number of test cases.
// Then follow T lines, each line contains an integer X.

// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ X ≤ 1000000
// Output
// For each test case, display the smallest number of notes that will combine to give X, in a new line.
// Example
// Sample Input :
// 3
// 1200
// 500
// 242
// Sample Output :
// 12
// 5
// 7


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int X = sc.nextInt();
            int numberofNotes = 0;

            if(X>=100){
                numberofNotes = numberofNotes + (X/100);
                X = X%100;
            }
            if(X>=50){
                numberofNotes = numberofNotes +(X/50);
                X = X%50;
            }
            if(X>=10){
                numberofNotes = numberofNotes +(X/10);
                X = X%10;
            }
        
            if(X>=5){
                numberofNotes = numberofNotes + (X/5);
                X = X%5;
            }
            if(X>=2){
                numberofNotes = numberofNotes + (X/2);
                X = X%2;
            }
            if(X>=1){
                numberofNotes = numberofNotes + (X/1);
                X = X%1;
            }
            System.out.println(numberofNotes);
        }
    }

}