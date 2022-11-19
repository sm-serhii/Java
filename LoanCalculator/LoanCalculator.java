/*
    Calculate the remaining loan amount after 3 months
*/

package LoanCalculator;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");

        int amount = scanner.nextInt();
        int remaining = amount;

        for(int i=0 ; i<3 ; i++){
            int payment = ((amount*10) / 100);
            remaining = amount - payment;
            amount = remaining;
        }

        System.out.println("Remaining amount after 3 months: " + remaining);
    }
}
