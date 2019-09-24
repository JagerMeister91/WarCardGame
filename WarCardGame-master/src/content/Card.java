package content;


public class Card 
{
    public enum Value {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
    NINE, TEN, JACK, QUEEN, KING, ACE};
    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADES};
    
    private Value value;    
    private Suit suit;

    public Card(Value value, Suit suit)
    {
        this.value = value;
        this.suit = suit;
    }
    
    public int valueToInt()
    {
        switch(this.value)
        {
            case TWO: 
                return 2;
            case THREE: 
                return 3;
            case FOUR: 
                return 4;    
            case FIVE: 
                return 5;
            case SIX: 
                return 6;
            case SEVEN: 
                return 7;
            case EIGHT: 
                return 8;
            case NINE: 
                return 9;
            case TEN: 
                return 10;
            case JACK: 
                return 11;
            case QUEEN: 
                return 12;
            case KING: 
                return 13;
            case ACE: 
                return 14;
        }
        
        return -1;
    }
    
    /*
        Returns 0 if the values are equal
        Returns 1 if the value is greater
        Returns -1 if the value is less than the other value
    */
    public int compare(Card other)
    {
       int thisValue = this.valueToInt();
       int otherValue = other.valueToInt();
       
       if(thisValue == otherValue)
       {
           return 0;
       }
       else if(thisValue > otherValue)
       {
           return 1;
       }
       else
       {
           return -1;
       }
       
    }
   
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    
     public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    
}
