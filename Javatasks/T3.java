// WAP to take a number as input. Now check given number is positive or negative or zero.

import java.util.*;

class T3 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();

        if (n >= 1) {
            System.out.println(n + " is a positive number.");
        } else if (n == 0) {
            System.out.println(n + " is a zero.");
        } else {
            System.out.println(n + " is a negative number.");
        }
    }

}