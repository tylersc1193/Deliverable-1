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
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards extends Card {

        private static List<Card> cards = new ArrayList<Card>();

    static {
            for(SUIT s : SUIT.values()){
                for(VALUE v : VALUE.values()){
		    	Card tempCard = new Card(s,v) {};
		    	GroupOfCards.cards.add(tempCard);
		    }
		}
    }

    protected GroupOfCards(final SUIT suit, final VALUE value) {
    	super(suit, value);
    }
 
    public static ArrayList<Card> newDeck() {
    	return new ArrayList<Card>(GroupOfCards.cards);
    }
    
    public static void shuffle() {
        Collections.shuffle(cards);
    }
}