// WAP to take number of days as input and compute years. weeks and days.
// eg: 
// Input : 375
// Output : 1 year 1 week 3 days
// avoid leap year.

import java.util.*;

public class T2 {
    public static void main(String[] args) {

        int dayIn, years, dayRemain, days, weeks;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        dayIn = sc.nextInt();

        years = dayIn / 365;
        dayRemain = dayIn % 365;
        weeks = dayRemain / 7;
        days = dayRemain % 7;

        // Output: Years, Weeks, and Days
        System.out.println(dayIn + " days is equal to: ");
        System.out.println(years + " year");
        System.out.println(weeks + " week");
        System.out.println(days + " days");
    }
}
