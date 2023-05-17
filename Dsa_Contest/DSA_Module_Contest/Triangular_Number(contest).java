// Triangular Number (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a number N. Check whether it is a triangular number or not.

// Note: A number is termed as a triangular number if we can represent it in the form of a triangular grid of points such that the points form an equilateral triangle and each row contains as many points as the row number, i. e., the first row has one point, the second row has two points, the third row has three points and so on.
// The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), and 10 (1+2+3+4).
// Input
// The first line of the input contains an integer N, representing the number to be tested.

// Constraints
// 1 ≤ N ≤ 106
// Output
// Output 1 if the integer is a triangular number, else output 0.
// Example
// Sample Input
// 55
// Sample Output
// 1
// Explanation
// 55 is a triangular number. It can be represented in 10 rows.










//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int sum = 0;
    int i = 1;
    while (sum < n) {
      sum += i;
      i++;
    }
    if (sum == n)
      System.out.println(1);
    else
      System.out.println(0);
  }
}