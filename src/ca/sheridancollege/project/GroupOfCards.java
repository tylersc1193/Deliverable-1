/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that creates the card deck and inherits the value and name
 * of the card
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards extends Card {

        private static List<Card> cards = new ArrayList<Card>();
/*
 * Creating the entire deck of cards froms the enums
 */
    static {
            for(SUIT s : SUIT.values()){
                for(VALUE v : VALUE.values()){
		    	Card tempCard = new Card(s,v) {};
		    	GroupOfCards.cards.add(tempCard);
		    }
		}
    }
/*
 * Protected because we do not want to change the values or give any other class
   the suit and value
 */
    protected GroupOfCards(final SUIT suit, final VALUE value) {
    	super(suit, value);
    }
 /*
 * returns the created deck of cards as a new deck for if the user wants to play
   again
 */
    public static ArrayList<Card> newDeck() {
    	return new ArrayList<Card>(GroupOfCards.cards);
    }
/*
 * Shuffles the cards
 */
    public static void shuffle() {
        Collections.shuffle(cards);
    }
}