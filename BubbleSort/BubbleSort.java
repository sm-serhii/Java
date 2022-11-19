/*
    Bubble Sort
*/

package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");

        String numbers = scanner.nextLine();

        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        int temp;

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }

        }

        System.out.println("Results:");

        for (int i : array) {
            System.out.println(i);
        }
    }
}
