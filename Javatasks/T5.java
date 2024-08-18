// WAP to find simple interest. si = (p*r*t)/100

import java.util.*;

public class T5 {
    public static void main(String[] args) {
        double p, r, t, si;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Profit : ");
        p = sc.nextDouble();

        System.out.print("Enter the Rate : ");
        r = sc.nextDouble();

        System.out.print("Enter the time : ");
        t = sc.nextDouble();

        si = (p * r * t) / 100;

        System.out.println("So the Simple Interest is : " + si);

    }
}
