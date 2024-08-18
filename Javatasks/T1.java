// WAP to find area and perimeter of Rectangle.

import java.util.*;

class T1 {
    public static void main(String[] args) {

        int a, l, w, p;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        l = sc.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        w = sc.nextInt();

        a = l * w;
        p = 2 * (l + w);

        System.out.println("Area of the rectangle: " + a);
        System.out.println("Perimeter of the rectangle: " + p);
    }
}