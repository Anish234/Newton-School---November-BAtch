// Semi-finals (Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Jane's football team has earned A points so far in her school's sports fest. To qualify for the semi-finals they have to earn at least B points. They have X more games left. For each game, they will earn 2 points for a win and 1 point for a draw and they don't earn any points if they lose. Can Jane's team qualify for the semi-finals?
// Input
// The first line will contain T, the number of test cases. Then the test cases follow. Each test case contains of a single line of input, three integers A, B, X.

// Constraints
// 1 ≤ T ≤ 5000
// 0 ≤ A, B, X ≤ 1000
// Output
// For each test case, output in one line "Yes" if it is possible for their team to qualify for semi-finals, or "No" if it is not possible to do so.
// Example
// Sample Input
// 3
// 4 10 8
// 3 6 1
// 4 8 2
// Sample Output
// Yes
// No
// Yes
// Explanation
// Test case 1: The team has scored 4 points and they need 6 more points to qualify, there are 8 games remaining, so if they draw all their 8 games they can qualify hence the answer is yes.
// Test case 2: The team has scored 3 points and they need 3 more points to qualify, there is 1 game left if they even win in that game still they can't qualify thereby the answer is no.








//your code is here

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            if (A + (2 * X) >= B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
        sc.close();
    }
}