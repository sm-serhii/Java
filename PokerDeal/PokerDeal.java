/*
    Dealing Cards in Poker
*/

package PokerDeal;

import java.util.Scanner;

public class PokerDeal {

    public static void main(String[] args) {

        int cardsPerPlayer = 5;
        int players = 0;

        String[] suits = {
                "Spades", "Clubs", "Diamonds", "Hearts"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int n = suits.length * rank.length; // number of cards


        // console input
        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of players: ");

            if(sc.hasNextInt()){

                players = sc.nextInt();
                if(cardsPerPlayer * players <= n){
                    break;
                } else {
                    if (players ==0){

                        System.out.println("The game has been terminated.");
                        break;

                    } else if (players<0){

                        System.out.println("The number of players cannot be less than 0");

                    } else{

                        System.out.println("Too many players!");
                    }
                }

            } else{
                System.out.println("You have not entered a number, or your number is too large!");

            }
        }


        // initialization
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        // reshuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i)); // random card
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // output on display
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }

    }

}
