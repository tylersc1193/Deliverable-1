/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;


/**
 * The controller class that starts the actual game
 * @author scott
 */
public class WarGame extends Game{

    public ArrayList<Player> players;
    
    public WarGame(String name) {
        super(name);
        players = new ArrayList();
    }
/**
 * The game starts taking in the hands and sets the players score to 0.
 * Each card is being printed for each player and whoever has the highest card
 * at the time wins the round and get one point.
 */
    @Override
    public void play(ArrayList<Card> hand1, ArrayList<Card> hand2) {
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
    }//To change body of generated methods, choose Tools | Templates.

 /**
 * as soon as every card has been played, whichever player has more points wins.
 */
    @Override
    public void declareWinner(int score1, int score2) {
        if(score1 > score2){
            System.out.println("Player 1 wins!");
        }
        else if(score1 < score2){
            System.out.println("Player 2 wins!");
        }
    }
    

    
}
    

    