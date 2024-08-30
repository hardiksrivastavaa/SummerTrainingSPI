/* P9 : Write a java program to take a sentence as input. 
Now count number of words in sentence. */

import java.util.*;

class MT9 {
    public static void main(String[] args) {

        String str;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("String has words : " + words.length);

    }
}
