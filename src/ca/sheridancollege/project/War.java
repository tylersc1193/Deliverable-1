/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author scott
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       
        Scanner in = new Scanner(System.in);
        boolean again = true;
        System.out.println("Would you like to play a game of War? (Y/N)");
        String play = in.nextLine();
            if(play.equalsIgnoreCase("Y")){
                System.out.println("Enter your username: ");
                String name = in.nextLine();
                Players player1 = new Players(name);

                System.out.println("Would you like to add another player? (Y/N)");
                String addPlayer = in.nextLine();
                if(addPlayer.equalsIgnoreCase("Y")){
                    System.out.println("Enter your username: ");
                    String name2 = in.nextLine();
                    Players player2 = new Players(name2);
                }
                else{
                  String comp = "computer";
                  Players player2 = new Players(comp);
                }
                do{
                    ArrayList<Card> deck = GroupOfCards.newDeck();
                    ArrayList<Card> hand1 = new ArrayList<>();
                    ArrayList<Card> hand2 = new ArrayList<>(); 
                    if(play.equalsIgnoreCase("Y")){
                        Collections.shuffle(deck);
                        for(int i = 0; i < 52; i++){
                            if(i % 2 == 0){
                                hand1.add(deck.get(i));

                            }
                            else if(i % 2 != 0){
                                hand2.add(deck.get(i));

                            }
                        }
                        Game.play(hand1, hand2);
                    }
            System.out.println("Would you like to play again? (Y/N)");
            String playAgain = in.nextLine();
            if(playAgain.equalsIgnoreCase("Y")){
               again = true;
            }
            else again = false;
        }while(again == true);
            }
        System.out.println("Thanks for Playing!\nHave a great day!");
    }
}
