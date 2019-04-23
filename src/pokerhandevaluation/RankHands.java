
package pokerhandevaluation;

/**
 * @author lee heberer
 */
public class RankHands {
    private int[][] my;
    private String message;
    
    public RankHands(int[][] myHand){
        this.my = myHand;
    }
    public String isRoyalFlush(){
        if((my[0][0]==13 && my[1][0]==12 && my[2][0]==11 
                && my[3][0]==10 && my[4][0]==9)
                && (my[0][1]==my[1][1] && my[1][1]==my[2][1] && my[2][1]==my[3][1] 
                && my[3][1]==my[4][1])){
            message = "Royal Flush";
            return message;
        }
        return message = "";
    }
    
    public String isStraightFlush(){
        for(int j=0; j<9; j++){
            if((my[0][0]==13-j && my[1][0]==12-j && my[2][0]==11-j
                    && my[3][0]==10-j && my[4][0]==9-j)
                    && (my[0][1]==my[1][1] && my[1][1]==my[2][1] && my[2][1]==my[3][1] 
                    && my[3][1]==my[4][1])){
                message = "Straight Flush";
                return message;
            }
        }
        return message = "";
    }
    
    public String isFourOfAKind(){
        for(int j=0; j<13; j++){
            if((my[0][0]==13-j && my[1][0]==13-j 
                    && my[2][0]==13-j && my[3][0]==13-j)
                    || (my[1][0]==13-j && my[2][0]==13-j
                    && my[3][0]==13-j && my[4][0]==13-j)){
                message = "Four of a Kind";
                return message;
            }
        }
        return message = "";
    }
    
    public String isFullHouse(){
        for(int j=0; j<13; j++){
            if(((my[0][0]==13-j && my[1][0]==13-j && my[2][0]==13-j)
                    && (my[3][0]==my[4][0]))
                    ||
                    ((my[0][0]==my[1][0])
                    && (my[2][0]==13-j && my[3][0]==13-j && my[4][0]==13-j))){
                message = "Full House";
                return message;
            }
        }
        return message = "";
    }
    
    public String isFlush(){
        if(my[0][1]==my[1][1] && my[1][1]==my[2][1] && my[2][1]==my[3][1] 
                    && my[3][1]==my[4][1]){
            message = "Flush";
            return message;
        }
        return message = "";
    }
    
    public String isStraight(){
        for(int j=0; j<9; j++){
            if((my[0][0]==13-j && my[1][0]==12-j && my[2][0]==11-j
                    && my[3][0]==10-j && my[4][0]==9-j)){
                message = "Straight";
                return message;
            }
        }
        return message = "";
    }
    
    public String isThreeOfAKind(){
        for(int j=0; j<13; j++){
            if((my[0][0]==13-j && my[1][0]==13-j && my[2][0]==13-j)
                    || (my[1][0]==13-j && my[2][0]==13-j && my[3][0]==13-j)
                    || (my[2][0]==13-j && my[3][0]==13-j && my[4][0]==13-j)){
                message = "Three of a Kind";
                return message;
            }
        }
        return message = "";
    }
    
    public String isTwoPair(){
        if((my[0][0]==my[1][0] && my[2][0]==my[3][0])
                || (my[0][0]==my[1][0] && my[3][0] == my[4][0])
                || (my[1][0]==my[2][0] && my[3][0]==my[4][0])){
            message = "Two Pair";
            return message;
        }
        return message = "";
    }
    
    public String isOnePair(){
        if(my[0][0]==my[1][0] || my[1][0]==my[2][0]
              || my[2][0]==my[3][0] || my[3][0]==my[4][0]){
            message = "One Pair";
            return message;
        }
    return message = "";  
    }
    
    public String isHighCard(){
        message = "High Card";
        return message;
    }
    
    public String getNameOfHand(){
        if(this.isRoyalFlush().equals("Royal Flush"))
            message = "Royal Flush";
        else if(this.isStraightFlush().equals("Straight Flush"))
            message = "Straight Flush";
        else if(this.isFourOfAKind().equals("Four of a Kind"))
            message = "Four of a Kind";
        else if(this.isFullHouse().equals("Full House"))
            message = "Full House";
        else if(this.isFlush().equals("Flush"))
            message = "Flush";
        else if(this.isStraight().equals("Straight"))
            message = "Straight";
        else if(this.isThreeOfAKind().equals("Three of a Kind"))
            message = "Three of a Kind";
        else if(this.isTwoPair().equals("Two Pair"))
            message = "Two Pair";
        else if(this.isOnePair().equals("One Pair"))
            message = "One Pair";
        else if(this.isHighCard().equals("High Card"))
            message = "High Card";
        return message;
    }
}
