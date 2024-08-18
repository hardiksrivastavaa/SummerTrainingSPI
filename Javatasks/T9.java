// WAP to find factorial of given number.

import java.util.*;

class T9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the factorial : ");
        int n = sc.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial is : " + factorial);

    }

}
