/*
    Checking names for a match
*/

package Namesakes;

import java.util.Scanner;

public class Namesakes {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");

        String n1 = scanner.next();

        System.out.print("Enter second name: ");

        String n2 = scanner.next();

        if (n1.equals(n2)) {
            System.out.println("Names are identical");
        }
        else if (n1.length() == n2.length()) {
            System.out.println("Name lengths are equal");
        }

    }
}

