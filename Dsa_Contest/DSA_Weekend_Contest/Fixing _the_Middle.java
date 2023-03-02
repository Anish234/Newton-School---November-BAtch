// Fixing the Middle
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a number N. You need to Fix the middle bit of N in binary form and print the result in decimal form.

// If number of bits in binary form of N are odd then Fix the middle bit (Like 111 to 101).
// If number of bits in binary form of N are even then Fix both the middle bits (Like 1111 to 1001)

// Note: Fixing a bit means converting a 0 to 1 and vice versa.
// Input
// The first line of input contains T denoting the number of test cases. T test cases follow. Each test case contains a single number N.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 1000000
// Output
// For each test case, in a new line, print the decimal form after toggling the middle bit of N.
// Example
// Input:
// 5
// 1
// 2
// 3
// 4
// 5

// Output:
// 0
// 1
// 0
// 6
// 7


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(read.readLine().trim());

            int numberOfBits = 1 + (int) Math.floor(Math.log(n) / Math.log(2)); //finding number of bits

            if (numberOfBits % 2 != 0) //if bits are odd
            {
                n = n ^ (1 << (numberOfBits / 2));
            } else //else if bits are even
            {
                n = n ^ (1 << (numberOfBits / 2));
                n = n ^ (1 << ((numberOfBits / 2) - 1));
            }
            System.out.println(n);
        }
    }
}