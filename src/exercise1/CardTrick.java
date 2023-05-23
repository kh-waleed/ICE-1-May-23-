package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */


/* IN-CLASS EXERCISE 1 (SYST17796)
 * Modified by: Waleed Khan (Student ID: 991645816)
 * Last modified: May 23, 2023
 * Editing this provided CardTrick class as part of ICE 1. */
import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Card[] hand = new Card[7];
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //generating a card value between 1 and 13 and suit between 0 and 3
            int randoValue = (int)(Math.random() * 13) + 1;
            card.setValue(randoValue);
            int randoSuit = (int)(Math.random() * 4);
            card.setSuit(Card.SUITS[randoSuit]);
            hand[i] = card;
        }//end for loop

        //(int)Math.floor(Math.random() * (3 - 0 + 1) + 0)]
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        System.out.print("Please select a card value between 1 and 13: ");
        int userVal = userInput.nextInt();
        System.out.print("Please select a suit with a value between 1 and 4: ");
        int userSuit = userInput.nextInt();
        userSuit--;
        
        //creating a new Card object for later comparison
        Card userCard = new Card();
        userCard.setValue(userVal);
         userCard.setSuit(Card.SUITS[userSuit]);
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        //for checking the card values in the array
        /*for (int i = 0; i < hand.length; i++) {
            System.out.println(hand[i].toString());
        }*/
        
        for (int i = 0; i < hand.length; i++) {
            if (userCard.equals(hand[i])) {
                printInfo();
            }
        }//end for loop
        // If the guess is successful, invoke the printInfo() method below.
    }//end main

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        //I'm done!
        
	//EDITING COMMENT REMOTELY FROM GITHUB FOR LATER MERGE 4:18 PM ON 23 MAY
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Waleed Khan.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with good grades!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Biking");
        System.out.println("-- Hiking");
        System.out.println("-- Go-Karting");
        System.out.println("-- Camping");

        System.out.println();
        
    
    }//end method printInfo()

}//end class CardTrick
