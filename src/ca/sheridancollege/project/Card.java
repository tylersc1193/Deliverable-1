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
    public enum SUIT {
        CLUBS,DIAMONDS,SPADES,HEARTS;
    }

   
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
    	return value.name() + " of " + suit + "(" + value.getRank() +")";
    }

}
