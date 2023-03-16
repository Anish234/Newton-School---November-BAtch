// Week Name
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Write a program to print day of week name using switch case.
// Input
// The first line of the input contains week number

// Constraints
// 1 <= weekNumber <= 7
// Output
// Print Week day Name.

// Note Intitals must be capitals
// Example
// Sample Input :
// 3

// Sample Output :
// Wednesday


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        int weekNum;
        Scanner sc = new Scanner(System.in);
        weekNum = sc.nextInt();

        switch(weekNum){
            case 1:System.out.print("Monday"); break;
            case 2:System.out.print("Tuesday"); break;
            case 3:System.out.print("Wednesday"); break;
            case 4:System.out.print("Thursday"); break;
            case 5:System.out.print("Friday"); break;
            case 6:System.out.print("Saturday"); break;
            case 7:System.out.print("Sunday");
    
        }
    }
}