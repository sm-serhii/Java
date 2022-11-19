/*
    Output min and max number in array
*/

package MinMaxValueInArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValueInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");

        String numbers = scanner.nextLine();

        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
                break;
            }
        }

        System.out.println("Min value: " + min);

        int max = array[0];

        for (int num : array) {
            if (num > max)
                max = num;
        }

        System.out.println("Max value: " + max);

    }
}
