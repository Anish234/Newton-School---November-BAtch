// Ram's Pride (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Ram has reached the finals of the Newton Coding Contest. For finals contestants were asked to prepare 8 difficult topics. However, Ram was only able to prepare 3 of them (A, B, and C topics) and was totally unaware of the remaining topics.
// The contest will contain questions from only one topic say, X. Ram's pride is at risk, It's sure if he knows the topic then he will win the contest, Now you need to tell whether Ram will win the contest or not.
// Input
// The first line of the input contains a single space-separated integer T denoting the number of test cases.
// The second line of the input contains four space-separated integers A, B, C, and X as described in the question.

// Constraints
// 1 le; T ≤ 1000
// 1 ≤ A, B, C, X ≤ 10
// A, B, and C are distinct.
// Output
// Output a single line "Yes" if Ram is able to save his pride by winning the contest, otherwise "No".
// Example
// Sample Input
// 2
// 2 3 7 1
// 1 5 3 5
// Sample Output
// No
// Yes







//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int X = sc.nextInt();
            if(A == X || B == X || C == X){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}