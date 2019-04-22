
package pokerhandevaluation;

/**
 * @author lhebe
 */
public class Hand {
    public int[] rank = new int[5];
    DealCard cards = new DealCard();
    
    public Hand(){
    }

    public int[] getRank() {
        return rank;
    }

    public void setOneRank(int i, int rank) {
        this.rank[i] = rank;
    }
    
    public int getOneRank(int i){
        return rank[i];
    }
    
    public void setDealHand(){
        for(int j=0; j<5; j++){
            rank[j] = cards.getCard();
        }
    }
    
    public void setDealHandTest(){
        rank[0] = cards.getCard0();
        rank[1] = cards.getCard1();
        rank[2] = cards.getCard2();
        rank[3] = cards.getCard3();
        rank[4] = cards.getCard4();
    }
    
    public void setSortHand(){
        int maxValue, start, maxIndex, pointer;
        for(start = 0; start<rank.length-1; start++){
            maxIndex = start;
            maxValue = rank[start];
            for(pointer = start+1; pointer < rank.length; pointer++){
                if(rank[pointer] > maxValue){
                    maxValue = rank[pointer];
                    maxIndex = pointer;
                }
            }
            rank[maxIndex] = rank[start];
            rank[start] = maxValue;
        }
    }
    
}
