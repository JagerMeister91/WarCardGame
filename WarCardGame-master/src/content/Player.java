package content;

import java.util.ArrayList;
import java.util.Random;
import static warcardgame.WarCardGame.deck;


public class Player 
{
    public ArrayList<Card> hand = new ArrayList();
    
    public Player()
    {
        Random rand = new Random();
        int randomIndex;
        
        //Filling player object with a random assortment of cards
        while(hand.size() < 26)
        {
            randomIndex = rand.nextInt(deck.size());
            hand.add(deck.get(randomIndex));
            deck.remove(randomIndex);
            
            
            //System.out.println(randomIndex);
            //System.out.println(deck.size());
            //System.out.println(hand.get(hand.size() - 1).getValue());
            //System.out.println(hand.get(hand.size() - 1).getSuit());
            
        }
        
         //System.out.println("Hand Size = " + hand.size());
         //System.out.println("Deck Size = " + deck.size());
    }
    
    public Card Turn()
    {
        return hand.get(0);
    }
    
    public void winRound(Player other)
    {
        hand.add(hand.get(0));
        hand.add(other.hand.get(0));
        hand.remove(0);
        other.hand.remove(0);
    }
    
    public void loseRound(Player other)
    {
        other.hand.add(other.hand.get(0));
        other.hand.add(hand.get(0));
        other.hand.remove(0);
        hand.remove(0);
    }
    
    public void sameCard(Player other)
    {
        hand.add(hand.get(0));
        hand.remove(0);
        other.hand.add(other.hand.get(0));
        other.hand.remove(0);
    }
    
}
