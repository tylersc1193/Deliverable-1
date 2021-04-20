/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The model class that models the game with the amount of players 
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name;//the title of the game
    private static ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    /**
     * Play the game. It takes both players decks which are both array lists 
     * of cards.
     */
    public abstract void play(ArrayList<Card> hand1,ArrayList<Card> hand2);
    
    /**
     * When the game is over, use this method to declare and display a winning 
     * player. Also takes both players scores from the play() in WarGame class
     */
    public abstract void declareWinner(int score1, int score2);
}
    
