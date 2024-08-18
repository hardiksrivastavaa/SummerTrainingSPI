// P3 : WAP to reverse the digits of given number.

import java.util.*;

public class T8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse its digits : ");
        int n = sc.nextInt();

        int reverseNumber = 0;
        while (n != 0) {
            int digit = n%10;
            reverseNumber = reverseNumber*10 + digit;
            n/= 10;
        }
        System.out.println("Reverse Number : " + reverseNumber);
    }
} 