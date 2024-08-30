// P3 : Write a Java Program to check given number is prime or not.

import java.util.*;

class MT3 {

    public static void main(String[] args) {

        int n, i, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = sc.nextInt();

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 1) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }

    }
}