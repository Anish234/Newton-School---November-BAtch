// The Classical Chase (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// In medieval times, a knight is chasing a thief who has stolen a precious gem from the royal treasury. The knight is riding his trusted horse at a speed of Y meters per second, while the thief is running on foot at a speed of X meters per second. The chase begins in an open field where the knight can gallop at full speed. Determine whether the knight will be able to catch the thief.
// Note: Knight and Thief were not at the same position initially.
// Input
// The first line of the input contains a single integer T, denoting the number of test cases.
// The next line of each test case contains two integers X and Y - the speeds of Thief and Knight respectively.

// Constraints
// 1 ≤ T ≤ 104
// 1 ≤ X, Y ≤ 100
// Output
// For each test case, output on a new line, Yes, if Knight will be able to catch Thief. Otherwise, output No.
// Example
// Sample Input
// 2
// 1 2
// 4 1
// Sample Output
// Yes
// No
// Explanation
// Test case 1: Thief is running at a speed of 1 meter per second and Knight is running at a speed of 2 meter per second. Since Thief speed is less than Knight, eventually Knight will catch the thief.








//your code is here

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
            int Y = sc.nextInt();
            if(X < Y){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}