
package pokerhandevaluation;

import java.util.Scanner;

/**
 * @author lee heberer
 */
public class DealCard {
    //private int cardRank;
    Scanner kb = new Scanner(System.in);
    
    public DealCard(){
    }
    
    public int getRank(){
        System.out.println("Enter the rank number for this card."
                + "\n1)two, 2)three, 9)ten, ..."
                + "10)Jack, 11)Queen, 12)King 13)Ace");
        //String str = kb.nextLine();
        //this.cardRank = Integer.parseInt(kb.nextLine());
        return Integer.parseInt(kb.nextLine());
    }
    
    public int getSuit(){
        System.out.println("Enter the suit for this card."
                + "\n1)Clubs, 2)Spades, 3)Hearts, 4)Diamonds");
        //String str = kb.nextLine();
        //this.cardRank = Integer.parseInt(kb.nextLine());
        return Integer.parseInt(kb.nextLine());
    }
    
    public int getRank0(){ return 12;}
    public int getRank1(){ return 10;}
    public int getRank2(){ return 11;}
    public int getRank3(){ return 8;}
    public int getRank4(){ return 9;}
    
    public int getSuit0(){ return 1;}
    public int getSuit1(){ return 2;}
    public int getSuit2(){ return 3;}
    public int getSuit3(){ return 4;}
    public int getSuit4(){ return 1;}
}
