/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICE1;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author John Smela (modifier) SID: 991847264
 */


import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int randomValue = rand.nextInt(13)+1;
            
            
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            Card luckyCard = new Card();
            luckyCard.setValue(5);
            luckyCard.setSuit(Card.SUITS[3]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Scanner in = new Scanner(System.in);
        System.out.print("Pick a Card value from 1-13. (1=Ace, Jack=11, Queen=12, King=13: ");
        int value = in.nextInt();
        System.out.print("Pick a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs: ");
        int suitInd = in.nextInt();
      
        //insert code to ask the user for Card value and suit, create their card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suitInd]);
        // and search magicHand here
         boolean found = false;
        for (int i = 0; i < magicHand.length; i++){
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit()) ){
                found = true;
                break;
            }   
        }
        //Then report the result here
        if (found){
            System.out.println("Your card is in the magic hand.");
    }
        else 
        {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}
