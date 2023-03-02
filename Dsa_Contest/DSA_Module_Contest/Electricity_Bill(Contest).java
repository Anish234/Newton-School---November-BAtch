// Electricity Bill(Contest)
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Maruti is a Bill manager in the Electricity department in his municipality. Being a newbie, he is not that good at calculation. So as a good friend of Maruti, calculate the bill amount for given electricity unit counts.

// Note:Per unit electricity rate is given below.
// For the first 50 units, Rs. 0.50/unit
// For the next 100 units, Rs. 0.75/unit
// For the next 100 units, Rs. 1.25/unit
// For units above 250, Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill.

// You are given an integer n (count of electricity units), then return the total amount Maruti has to pay.
// Print answers up to 2 decimal places.
// Input
// An integer n (count of electricity units) is given as input.

// Constraints
// 1 ≤ n ≤ 105
// Output
// A single number that represents the total amount that Maruti has to pay.
// Example
// Sample Input:
// 100
// Sample Output:
// 75.00


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double billpay = 0;
        if(n<=50){
            billpay = 0.5*n;
            billpay = billpay + 0.2*billpay;
        }
        else if(n>50 && n<=150){
            billpay = 0.5*50 + (n-50)*0.75;
            billpay = billpay + 0.2*billpay;
        }
        else if(n<150 && n<=250){
            billpay = 0.5*50 + 100*0.75 + (n-150)*1.25;
            billpay = billpay + 0.2*billpay;
        }
        else {
            billpay = 0.5*50+100*0.75+100*1.25+(n-250)*1.5;
            billpay = billpay + 0.2*billpay;
        }
        System.out.printf("%.2f" ,billpay);
    }
}