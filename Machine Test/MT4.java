// P4 : Write a Java Program to create an array of 10 numbers by user input. now search a number in array.

import java.util.*;

class MT4 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int i, n;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Numbers : ");

        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Here is the array of 10 numbers : ");

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.print("Enter a number to search in array : ");
        n = sc.nextInt();

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(n + " is stored in array at the index of " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Given Number is not stored in array!!");
        }

    }
}