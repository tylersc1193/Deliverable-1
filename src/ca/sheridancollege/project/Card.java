/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A model class that creates a card
 * @author dancye
 * @author Mathison, Scott & Malik April 2021
 */
public abstract class Card {
    //default modifier for child classes

 /*
 * Creating an enum for the value of the card and the actual value is the int
    in the enums ordinal
 */
    public enum VALUE {
        
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private final int rank;

        private VALUE(int rank){
            this.rank = rank;
        }

        public int getRank(){
            return rank;
        }

        @Override
        public String toString(){
            return String.format("%s",rank);
        }
    } 
    
 /*
 * Same goes for the suit, except the enum does not hold any values
 */
    public enum SUIT {
        CLUBS,DIAMONDS,SPADES,HEARTS;
    }

/*
 * Finalize the enums so they cannot be changed
 */
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
/*
 * the string that prints the card's suit, value and rank
 */
    @Override
    public String toString() {
    	return value.name() + " of " + suit + "(" + value.getRank() +")";
    }

}
