// WAP to print table of given number.

import java.util.*;

class T10 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the table of that number  : ");
        n = sc.nextInt();

        System.out.println("Table of " + n + " is here : ");
        for (int i = 1; i <= 10; i++) {
            int t = n * i;
            System.out.println(n + "*" + i + " = " + t);
        }

    }
}
