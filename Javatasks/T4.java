// WAP to take a number as input. Now check given number is even or odd.

import java.util.*;

public class T4 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find odd or even : ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is a even number.");
        } else {
            System.out.println(n + " is a odd number.");
        }
    }
}
