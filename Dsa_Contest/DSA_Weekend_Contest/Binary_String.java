// Binary String
// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function binarySubstring() which takes size of string and string S as a parameter.

// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ |S| ≤ 10000
// Output
// For each testcase, in a new line, print the number of substring starting and ending with 1 in a separate line.
// Example
// Input:
// 2
// 4
// 1111
// 5
// 01101

// Output:
// 6
// 3

// Example:
// Testcase 1: There are 6 substrings from the given string. They are 11, 11, 11, 111, 111, 1111.
// Testcase 2: There 3 substrings from the given string. They are 11, 101, 1101.





//your code is here

public static int binarySubstring(int a, String str)
{
     int count = 0;

     for(int i=0; i<a; i++){
          if(str.charAt(i) == '1')
          count++;
     }
     return count*(count-1)/2;
}
