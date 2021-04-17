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
        ArrayList<Card> d = GroupOfCards.newDeck();
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play a game of War? (Y/N)");
        String play = in.nextLine();
            if(play.equalsIgnoreCase("Y")){
                System.out.println("Enter your username: ");
                String name = in.nextLine();
                ArrayList<Player> p = Game.newPlayer(name);
                System.out.println("Would you like to add another player? (Y/N)");
                String addPlayer = in.nextLine();
                if(addPlayer.equalsIgnoreCase("Y")){
                    System.out.println("Enter your username: ");
                    String name2 = in.nextLine();
                    ArrayList<Player> p2 = Game.newPlayer(name2);
                }
                else{
                  String comp = "computer";
                  ArrayList<Player> p2 = Game.newPlayer(comp);
                  Collections.shuffle(d);  
                }
                   
                   
                
            }
        for(int i = 0; i < 52; i++){
            if(i % 2 == 0){
                
            }
        }
		
		for(Card c : d){
			System.out.println(c);
		}
	}
}
