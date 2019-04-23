
package pokerhandevaluation;

/**
 * @author lee heberer
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
        Hand try1 = new Hand();
        try1.setDealHand();
        try1.setSortHand();
        int [][] myCards = new int[5][2];
        myCards = try1.getCard();
        RankHands nameHand = new RankHands(myCards);
        String str = "";
        str = nameHand.getNameOfHand();
        /*
        if(nameHand.isRoyalFlush().equals("Royal Flush"))
            str = "Royal Flush";
        else if(nameHand.isStraightFlush().equals("Straight Flush"))
            str = "Straight Flush";
        else if(nameHand.isFourOfAKind().equals("Four of a Kind"))
            str = "Four of a Kind";
        else if(nameHand.isFullHouse().equals("Full House"))
            str = "Full House";
        else if(nameHand.isFlush().equals("Flush"))
            str = "Flush";
        else if(nameHand.isStraight().equals("Straight"))
            str = "Straight";
        else if(nameHand.isThreeOfAKind().equals("Three of a Kind"))
            str = "Three of a Kind";
        else if(nameHand.isTwoPair().equals("Two Pair"))
            str = "Two Pair";
        else if(nameHand.isOnePair().equals("One Pair"))
            str = "One Pair";
        else if(nameHand.isHighCard().equals("High Card"))
            str = "High Card";
    */
        
        System.out.println("your Hand is: " + str);
        
        return;
    }
}
