// Minimum no. of steps (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Aarav is standing at location X and Reena is standing at location Y. In one step Aarav can increase or decrease his location by at most A. What is the minimum no. of steps required by Aarav to reach Reena?
// Input
// The first line of input will contain a single integer T, denoting the number of test cases. Each test case consists of three integers X, Y, and A, the initial coordinate of Aarav, the initial coordinate of Reena and the maximum number of coordinates Aarav can move in one step.

// Constraints
// 1 ≤ T ≤1000
// 1 ≤ X, Y ≤ 100
// 1 ≤ A ≤ 100
// Output
// For each test case, output the minimum number of steps required by Aarav to reach Reena.
// Example
// Sample Input
// 4
// 10 20 3
// 36 36 5
// 50 4 100
// 30 4 2
// Sample Output
// 4
// 0
// 1
// 13
// Explanation
// Test case 1: Here Aarav is at point 10 and Reena at psoint 20 so after waling one step Aarav will reach coordinate 13 similarly after 3 steps Aarav location will be 18. Now 3 steps Aarav have walked and only 2 steps way he is from Reena so one more step is needed of length 2. i.e. making a total of 4 steps.
// Test case 2: Aarav and Reena are already at the same point.








//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			int steps = Math.abs(y-x)/a;
			if(Math.abs(y-x)%a != 0) {
				steps++;
			}
			System.out.println(steps);
		}
		sc.close();
	}
}