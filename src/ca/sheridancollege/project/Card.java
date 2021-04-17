/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    //default modifier for child classes

    
    public enum VALUE {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE;}
    
    public enum SUIT {CLUBS,DIAMONDS,SPADES,HEARTS;}
    
    private final SUIT suit;
    
    private final VALUE value;
   
    public Card(SUIT suit, VALUE value){
        this.suit = suit;
        this.value = value;
    }

    public SUIT getSuit() {
        return suit;
    }

    public VALUE getValue() {
        return value;
    }
    @Override
    public String toString() {
    	return value + " of " + suit;
    }

}
