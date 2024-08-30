// P1 : Write a Java Program to find greatest number in three unequal numbers.

import java.util.*;

class MT1 {

    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n1 : ");
        n1 = sc.nextInt();

        System.out.print("Enter the value of n2 : ");
        n2 = sc.nextInt();

        System.out.print("Enter the value of n3 : ");
        n3 = sc.nextInt();

        if (n2 < n1 && n3 < n1) {
            System.out.print(n1 + ", n1 is the greatest Number!!");
        } else if (n1 < n2 && n3 < n2) {
            System.out.print(n2 + ", n2 is the greatest Number!!");
        } else {
            System.out.print(n3 + ", n3 is the greatest Number!!");
        }

    }
}