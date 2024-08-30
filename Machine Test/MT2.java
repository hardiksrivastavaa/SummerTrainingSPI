// P2 : Write a Java Program to convert binary to decimal.

import java.util.Scanner;

public class MT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Initialize the decimal value to 0
        int decimalValue = 0;

        // Length of the binary string
        int length = binaryString.length();

        // Loop through each character of the binary string
        for (int i = 0; i < length; i++) {
            // Get the character at position i from the left
            char binaryChar = binaryString.charAt(i);

            // Convert the character to an integer (0 or 1)
            int binaryDigit = binaryChar - '0';

            // Calculate the power of 2 for the current position
            int power = length - 1 - i;

            // Update the decimal value by adding the value of this bit
            decimalValue += binaryDigit * Math.pow(2, power);
        }

        // Output the decimal value
        System.out.println("The decimal equivalent of binary " + binaryString + " is: " + decimalValue);

        scanner.close();
    }
}
