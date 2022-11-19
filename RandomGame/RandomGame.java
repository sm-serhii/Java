/*
    Guess the number game
*/

package RandomGame;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 5;

        int random = (int)(Math.random()*(max-min+1)+min);

        // System.out.println(random);

        System.out.println("Guess the number from 1 to 5");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Your number: ");

            String number = scanner.next();
            String exit = "exit";

            if (number.equals(exit)) {
                System.out.println("Game over!");
                break;
            }

            int numbs = Integer.valueOf(number);

            if (numbs == random) {
                System.out.println("You win!");
                break;
            } else if (numbs < random) {
                System.out.println("Small number");
            } else {
                System.out.println("Large number");
            }
        }
    }
}

