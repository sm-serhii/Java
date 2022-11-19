/*
    Get the name of the season after entering the month number
*/

package GetSeasons;

import java.util.Scanner;

public class GetSeasons {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");

        int month = scanner.nextInt();

        System.out.print("Season name: " + seasons(month));

    }

    static String seasons(int month){
        if (month > 12 || month <= 0) {
            return "Invalid data";
        } else if (month >= 1 && month <= 2) {
            return "Winter";
        } else if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else if (month >= 9 && month <= 11) {
            return "Autumn";
        } else if (month == 12)
            return "Winter";
        return "Error";
    }

}
