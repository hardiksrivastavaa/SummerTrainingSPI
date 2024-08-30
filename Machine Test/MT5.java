// P5 : Write a Java Program to find given number is palindrome or not.

import java.util.*;

class MT5 {

    public static void main(String[] args) {
        int n;
        int rv = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n = sc.nextInt();

        while (n != 0) {
            int digit = n % 10;
            rv += rv * 10 + digit;
            n /= 10;
        }

        if (n == rv) {
            System.out.print("Entered String is Palindrome.");
        } else {
            System.out.print("Entered String is not Palindrome.");
        }

    }
}