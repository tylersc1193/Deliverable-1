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
    	return new ArrayList<Player>(Game.players);
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public static void play(ArrayList<Card> hand1,ArrayList<Card> hand2){
        System.out.println("p1"+"\t\t\t\t"+"p2");
        int score1=0;
        int score2=0;
        for(int j = 0; j < 26; j++){
            Card first = hand1.get(j);
            Card first2 = hand2.get(j);

            System.out.println(first+"\t\t\t"+first2);
            if(first.getValue().getRank() < first2.getValue().getRank()){
                System.out.println("Player 2 wins round\n");
                score2++;
            }
            else if(first.getValue().getRank() > first2.getValue().getRank()){
                System.out.println("Player 1 wins round\n");
                score1++;
            }
            else{
                System.out.println("Tie!\n");
            }
            declareWinner(score2, score1);
        }
    }
    
    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public static void declareWinner(int score1, int score2){
        if(score1 > score2){
            System.out.println("Player 1 wins!");
        }
        else if(score1 < score2){
            System.out.println("Player 2 wins!");
        }
    }
}
    
