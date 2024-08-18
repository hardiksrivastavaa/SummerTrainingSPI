// WAP to make temprature converter based on user choice

import java.util.*;

public class T7 {
    public static void main(String[] args) {

        int n;
        double c, f;

        Scanner sc = new Scanner(System.in);
        System.out.print(
                "Enter 1 for centigrade to fahrenhite Conversion and 2 for Fahrenhite to Centigrade Conversion : ");
        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Enter value in Centigrade : ");
                c = sc.nextDouble();
                f = (9 * c) / 5 + 32;
                System.out.println(f + " is the temprature in fahrenhite.");
                break;

            case 2:
                System.out.println("Enter value in Fahrenhite : ");
                f = sc.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println(c + " is the temprature in centigrade.");
                break;

            default:
                System.out.println("Enter choice in 1 or 2!!");
                break;
        }
    }
}
