// As or Bs (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a string S consisting of characters 'A' or 'B' only, you need to find the maximum length of substring consisting of character 'A' only.
// Input
// The first and the only line of input contains the string S.

// Constraints
// 1 <= |S| <= 100000
// S consists of characters 'A' or 'B' only.
// Output
// Output a single integer, the answer to the problem.
// Example
// Sample Input
// ABAAABBBAA

// Sample Output
// 3

// Explanation: Substring from character 3-5 is the longest consisting of As only.

// Sample Input
// AAAA


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int maxLength = 0;
        int currentLength = 0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == 'A'){
                currentLength++;
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
            }
            else{
                currentLength = 0;
            }
        }System.out.println(maxLength);
    }
}