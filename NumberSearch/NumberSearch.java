/*
    Search numbers in array
*/

package NumberSearch;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");

        String numbers = scanner.nextLine();

        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.print("Search: ");

        String search = scanner.nextLine();

        int value = Integer.valueOf(search);

        boolean found = false;

        for (int x : array) {
            if (x == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Number found");
        }
    }
}
