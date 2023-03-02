// Calculate BMI(Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Maruti is a software engineer at Newton School. He is very passionate regarding his Job due to that he always remains very conscious regarding his health. So he checks his BMI(Body mask Index) regularly and shows that to the doctor. You are given the weight and height of Maruti in pounds and inches respectively.
// Calculate Maruti's BMI and return it.
// Note:Return BMI value of two decimal places.
// BMI=Weight(in kg)/Height(in meters)2
// 1 Pound = 0.453592 kg
// 1 Inch = 0.0254 metres
// Input
// There are two decimal values w, h (weight and height of maruti) are given as input.

// Constraints
// 1 ≤ w, h ≤ 102
// Output
// Return BMI Value of maruti.
// Example
// Sample Input:
// 72 45

// Sample Output:
// 25.00


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        final double kgperpound = 0.45359237;
        final double metersperpound = 0.0254;

        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        weight = weight * kgperpound;
        height = height * metersperpound;
        double BMI = weight / Math.pow(height, 2);
        System.out.printf("%.2f", BMI);
    }
}