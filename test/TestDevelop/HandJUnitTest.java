
package TestDevelop;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import pokerhandevaluation.Hand;

/**
 * @author lhebe
 */
public class HandJUnitTest {
    int[] card;
    Hand hand1 = new Hand();
    Hand hand2 = new Hand();
    
    public HandJUnitTest() {
    }
    @Before
    public void setUpCard(){
        card = new int[5];
        card[0] = 12;
        card[1] = 10;
        card[2] = 11;
        card[3] = 8;
        card[4] = 9;
    }
    
    @Test
    public void setNewCard(){
        for(int i = 0; i<5; i++){
            hand1.setOneRank(i, card[i]);
            assertEquals("the values are not equal.",hand1.getOneRank(i),card[i]);
        }
        assertArrayEquals("the values are not equal.",hand1.rank, card);
    }
    
    @Test
    public void setNewHand2(){
        hand2.setDealHandTest();
        for(int i = 0; i<5; i++){
            assertEquals("the values are not equal.",hand2.getOneRank(i),card[i]);
        }
        assertArrayEquals("the values are not equal.",hand2.rank, card);
    }
    
    @Test
    public void setNewHand3(){
        hand2.setDealHandTest();
        hand2.setSortHand();
        card[0] = 12;
        card[1] = 11;
        card[2] = 10;
        card[3] = 9;
        card[4] = 8;
        for(int i = 0; i<5; i++){
            assertEquals("the values are not equal.",hand2.getOneRank(i),card[i]);
        }
        assertArrayEquals("the values are not equal.",hand2.rank, card);
    }
    
    @Ignore
    @Test
    public void setNewHand1(){
        hand2.setDealHand();
        for(int i = 0; i<5; i++){
            assertEquals("the values are not equal.",hand2.getOneRank(i),card[i]);
        }
        assertArrayEquals("the values are not equal.",hand2.rank, card);
    }
}
