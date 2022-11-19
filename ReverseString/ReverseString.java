/*
    Reverse string output
*/

package ReverseString;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");

        String text = scanner.nextLine();

        System.out.print("Original string: ");
        System.out.println(text);

        char[] arr = text.toCharArray();

        int n = arr.length;
        String str = "";

        for(int i = n-1; i > -1; i--) {
            str = str + arr[i];
        }

        System.out.println("Reversed string: " + str);
    }
}