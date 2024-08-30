// P10 : Write a Java Program to print table of given number.

import java.util.*;

class MT10 {

    public static void main(String[] args) {

        int n, i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to get the number : ");
        n = sc.nextInt();

        System.out.println("Here's the table of " + n + " : ");

        for (i = 1; i <= 10; i++) {
            int t = i * n;
            System.out.println(n + " * " + i + " = " + t);
        }
    }
}