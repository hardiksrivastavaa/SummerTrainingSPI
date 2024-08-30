// P6 : Write a Java Program to find volume of cuboid using user defined method.

import java.util.*;

class MT6 {

    public int volume(int l, int b, int h) {
        return l * b * h;
    }

    public static void main(String[] args) {

        int l, b, h, v;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        l = sc.nextInt();

        System.out.print("Enter breadth : ");
        b = sc.nextInt();

        System.out.print("Enter height : ");
        h = sc.nextInt();

        MT6 vl = new MT6();
        v = vl.volume(l, b, h);

        System.out.println("The volume of cubiod is : " + v);

    }
}