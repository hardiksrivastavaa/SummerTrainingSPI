/* P7: Write a Java program with a `Rectangle` class. Include constructor 
and an `area()` method that returns the area of the rectangle. 
Create an instance of the class, take user input for length and breadth, 
and calculate the area using the method. */


import java.util.*;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        System.out.println("Area of Rectangle : " + length * breadth);
    }

}

class MT7 {
    public static void main(String[] args) {

        int l, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        l = sc.nextInt();

        System.out.print("Enter the breadth : ");
        b = sc.nextInt();

        Rectangle ar = new Rectangle(l, b);

        ar.area();

    }
}