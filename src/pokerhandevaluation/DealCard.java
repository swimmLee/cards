
package pokerhandevaluation;

import java.util.Scanner;

/**
 * @author lhebe
 */
public class DealCard {
    private int cardRank;
    Scanner kb = new Scanner(System.in);
    
    public DealCard(){
    }
    
    public int getCard(){
        System.out.println("Enter the rank for this card.");
        String str = kb.nextLine();
        this.cardRank = Integer.parseInt(str);
        return cardRank;
    }
    
    public int getCard0(){ return 12;}
    public int getCard1(){ return 10;}
    public int getCard2(){ return 11;}
    public int getCard3(){ return 8;}
    public int getCard4(){ return 9;}
}
