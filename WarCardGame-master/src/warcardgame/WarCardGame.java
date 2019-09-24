package warcardgame;

import content.Card;
import content.Card.Suit;
import content.Card.Value;
import content.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class WarCardGame {
    public static ArrayList<Card> deck = new ArrayList();
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("THIS IS WAR!!!");
        System.out.println("Press \"Enter\" to Start!");
        input.nextLine();
        
        //Initalzing cards
        for (Value v : Value.values()) {
            for (Suit s : Suit.values()) {
                Card c = new Card(v, s);
                deck.add(c);
            }
        }

        //Creating player objects which automatically gets filled
        //with cards
        Player player1 = new Player();
        Player player2 = new Player();

        //Creating a while loop until a player reaches 0 cards
        boolean gameOver = false;
        int counter = 0;
        while (!gameOver) {
            counter++;
            int p1Size = player1.hand.size();
            int p2Size = player2.hand.size();

            if (p1Size == 0 || p2Size == 0) {
                System.out.println("Game Over!");
                if (p1Size == 0) {
                    System.out.println("Player B won!");
                } else {
                    System.out.println("Player A won!");
                }
                gameOver = true;
            } else {
                System.out.println("Turn #" + counter);
                System.out.println("------------------------------");
                /*System.out.println("Hand 1 size: " + p1Size);
                System.out.println("Hand 2 size: " + p2Size);*/

                Card p1 = player1.Turn();
                Card p2 = player2.Turn();
                
                
                /*System.out.print(p1.getValue() + " OF " + p1.getSuit());
                System.out.print(" vs. ");
                System.out.println(p2.getValue() + " OF " + p2.getSuit());*/
                
                //int last = p1.size() - 1;
                
                switch(p1.compare(p2))
                {
                    case 0:
                        System.out.print(
                                p1.getValue() + " OF " + p1.getSuit());
                        System.out.print(" = ");
                        System.out.println(
                                p2.getValue() + " OF " + p2.getSuit());
                        System.out.println("\nIt's a tie!\n");
                        player1.sameCard(player2);
                        break;
                    case 1:
                        System.out.print(
                                p1.getValue() + " OF " + p1.getSuit());
                        System.out.print(" > ");
                        System.out.println(
                                p2.getValue() + " OF " + p2.getSuit());
                        System.out.println("\nPlayer A won this round!\n");
                        player1.winRound(player2);
                        //System.out.println(player1.hand.get(0).getValue());
                        
                        /*System.out.println(player1.hand.get(
                                player1.hand.size() - 2).getValue());
                        System.out.println(player1.hand.get(
                                player1.hand.size() - 1).getValue());*/
                        
                        break;
                    case -1:
                        System.out.print(
                                p1.getValue() + " OF " + p1.getSuit());
                        System.out.print(" < ");
                        System.out.println(
                                p2.getValue() + " OF " + p2.getSuit());
                        System.out.println("\nPlayer B won this round!\n");
                        player1.loseRound(player2);
                        
                        //System.out.println(player2.hand.get(0).getValue());
                        
                        /*System.out.println(player2.hand.get(
                                player2.hand.size() - 2).getValue());
                        System.out.println(player2.hand.get(
                                player2.hand.size() - 1).getValue());*/
                        
                        break;
                }
                System.out.println("Now Player A has " 
                        + player1.hand.size() 
                        + " cards");
                System.out.println("Now Player B has " 
                        + player2.hand.size() 
                        + " cards");
                
                System.out.println("\nPRESS ENTER FOR THE NEXT TURN!");
                input.nextLine();
            }
            
        }
    }

}

//Thanks for your time...
