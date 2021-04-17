/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
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
    public static ArrayList<Player> newPlayer(String name) {
        
       /* for(name p : name.values()){
            
        }
        if(name == name){
            
        }*/
    	return new ArrayList<Player>(Game.players);
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();
    
    public static  Deal(ArrayList<Card> cards){
        for(int i = 0; i < 52; i++){
            if(i % 2 == 0){
                
            }
        }
    }
    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
