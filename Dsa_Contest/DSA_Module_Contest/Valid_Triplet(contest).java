// Valid Triplet (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a sequence of three characters, check if the sequence is a valid triplet or not.

// Valid triplet is the triplet of characters where the next element of the sequence is strictly greater than the previous one.
// Input
// The input contains three lines.
// The first line contains a single character, the first character of the sequence.
// The second line contains a single character, the second character of the sequence.
// The third line contains a single character, the third character of the sequence.

// Constraints
// all three characters are lower- case English alphabets.
// Output
// Print true if the sequence is a valid triplet, otherwise print false.
// Example
// Sample Input 1:
// i
// f
// d

// Sample Output 1:
// false

// Sample Input 2:
// f
// t
// x

// Sample Output 2:
// true









//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        char c3 = sc.next().charAt(0);

        if((c2 > c1 ) && (c3 > c2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
