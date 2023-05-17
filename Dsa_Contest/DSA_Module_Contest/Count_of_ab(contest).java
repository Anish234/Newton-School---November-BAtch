// Count of ab (Contest)
// easy
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Count the number of substrings in the string s that are equivalent to "ab". The string s contains only the characters "a" and "b".
// Input
// The first line contains string s.

// Constraints
// n==s. length
// 1 ≤ n ≤ 105
// Output
// Print the count of substrings in the string s that are equivalent to "ab".
// Example
// Sample 1:
// Input:
// abababaa
// Output:
// 3








//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == 'a' && s.charAt(i+1) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}