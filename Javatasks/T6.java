// WAP to take coordinates of a point as input and find its quadrant.

import java.util.*;

class T6 {
    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x : ");
        x = sc.nextInt();

        System.out.print("Enter the value of y : ");
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("You are in First Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("You are in Third Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("You are in Second Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("You are in Fourth Quadrant.");
        } else {
            System.out.println("Your are in the main axis.");
        }
    }
}
