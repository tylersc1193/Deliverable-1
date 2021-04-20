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
 * The view class that asks the player if they want to play.
 * @author scott
 */
public class War {

/*
* @param args the command line arguments
* the main method that asks the user if they want to play war and to enter
* their username
*/
    public static void main(String[] args) {
        String game = "War";
        WarGame war = new WarGame(game);
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;
        System.out.println("Would you like to play a game of War? (Y/N)");
        String play = in.nextLine();
            if(play.equalsIgnoreCase("Y")){
                System.out.println("Enter your username: ");
                String name = in.nextLine();
                Players player1 = new Players(name);
                player1.setName(name);
                war.players.add(player1);
                System.out.println("Would you like to add another player? (Y/N)");
                String addPlayer = in.nextLine();
                if(addPlayer.equalsIgnoreCase("Y")){
                    System.out.println("Enter your username: ");
                    String name2 = in.nextLine();
                    Players player2 = new Players(name2);
                    player2.setName(name2);
                    war.players.add(player2);
                }
                else{
                  String comp = "computer";
                  Players player2 = new Players(comp);
                  player2.setName(comp);
                  war.players.add(player2);
                }
/*
 * While the player wants to keep playing, the deck from the GroupOfCards class
 * is brought in as a new deck and 2 different card hands are created for each 
 * player in an arraylist and the game starts with the card hands being taken in
 */
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
                        war.play(hand1, hand2);
                        
                       
                    }
            System.out.println("Would you like to play again? (Y/N)");
            String again = in.nextLine();
            if(again.equalsIgnoreCase("Y")){
               playAgain = true;
            }
            else playAgain = false;
        }while(playAgain == true);
            }
        System.out.println("Thanks for Playing!\nHave a great day!");
    }
}
