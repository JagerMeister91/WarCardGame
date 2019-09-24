/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Osman Yusoof
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of method valueToInt. Creates a card object
     * and checks to see if the method will return the expected
     * value for the Card object.
     * 
     * This method cannot have a bad test as the Card object cannot be 
     * created without assigning a value which is assigned to an Enum
     * object. Therefore it can only return the assigned values.
     */
    @Test
    public void testValueToInt() {
        System.out.println("valueToInt: Testing");
        Card instance = new Card(Card.Value.TWO, Card.Suit.SPADES);
        int expResult = 2;
        int result = instance.valueToInt();
        assertEquals(expResult, result);
    }



    /**
     * Test of compare method, of class Card. This test will
     * test when one card's Value is less than the Card
     * that is calling the method. Should return -1 when this occurs.
     */
    @Test
    public void testCompareLessThan() {
        System.out.println("compare: Test Less Than");
        Card other = new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card instance = new Card(Card.Value.FOUR, Card.Suit.SPADES);
        int expResult = -1;
        int result = instance.compare(other);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of compare method, of class Card. This test will
     * test when one card's Value is equal to the Card calling 
     * method. Should return 0 when this occurs.
     */
    @Test
    public void testCompareEquals() {
        System.out.println("compare: Test Equals");
        Card other = new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card instance = new Card(Card.Value.JACK, Card.Suit.SPADES);
        int expResult = 0;
        int result = instance.compare(other);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of compare method, of class Card. This test will
     * test when one Card's Value is greater than the Card's
     * calling method. Should return 1 when this occurs.
     */
    @Test
    public void testCompareGreaterThan() {
        System.out.println("compare: Test Greater Than");
        Card other = new Card(Card.Value.FOUR, Card.Suit.SPADES);
        Card instance = new Card(Card.Value.JACK, Card.Suit.SPADES);
        int expResult = 1;
        int result = instance.compare(other);
        assertEquals(expResult, result);
    }
    
}
