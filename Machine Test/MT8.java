/* P8: Write a Java program to handle `InputMismatchException` and `ArithmeticException` 
during the division of two numbers using exception handling. */

import java.util.*;

class MT8 {
    public static void main(String[] args) {

        int x, y, z;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x : ");
            x = sc.nextInt();

            System.out.print("Enter the value of y : ");
            y = sc.nextInt();

            z = x / y;

            System.out.println("Division is : " + z);
        }

        catch (ArithmeticException ex1) {
            System.out.println("You are trying to divide by 0. That is not fair");
        }

        catch (InputMismatchException ex1) {
            System.out.println("You are trying to divide by a alphabet");
        }

        finally {
            System.out.println("This is finally block!");
        }

    }
}