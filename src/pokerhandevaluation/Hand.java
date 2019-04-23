
package pokerhandevaluation;

/**
 * @author lee heberer
 */
public class Hand {
    public int[][] card = new int[5][2];
    DealCard cards = new DealCard();
    
    public Hand(){
    }

    public int[][] getCard() {
        return card;
    }
    
    public void setCard(int[][] hand){
        this.card = hand;
    }

    public void setOneCard(int i, int rank, int suit) {
        this.card[i][0] = rank;
        this.card[i][1] = suit;
    }
    
    public int getCardRank(int i){
        return card[i][0];
    }
    
    public int getCardSuit(int i){
        return card[i][1];
    }
    
    public void setDealHand(){
        for(int i=0; i<5; i++){
            card[i][0] = cards.getRank();
            card[i][1] = cards.getSuit();
        }
    }
    
    public void setDealHandTest(){
        card[0][0] = cards.getRank0();
        card[1][0] = cards.getRank1();
        card[2][0] = cards.getRank2();
        card[3][0] = cards.getRank3();
        card[4][0] = cards.getRank4();
        
        card[0][1] = cards.getSuit0();
        card[1][1] = cards.getSuit1();
        card[2][1] = cards.getSuit2();
        card[3][1] = cards.getSuit3();
        card[4][1] = cards.getSuit4();
    }
    
    public void setSortHand(){
        int maxRankValue, start, maxRankIndex, maxRankSuit, pointer;
        for(start = 0; start<4; start++){
            maxRankIndex = start;
            maxRankValue = card[start][0];
            maxRankSuit = card[start][1];
            for(pointer = start+1; pointer < 5; pointer++){
                if(card[pointer][0] > maxRankValue){
                    maxRankValue = card[pointer][0];
                    maxRankSuit = card[pointer][1];
                    maxRankIndex = pointer;
                }
            }
            card[maxRankIndex][0] = card[start][0];
            card[maxRankIndex][1] = card[start][1];
            card[start][0] = maxRankValue;
            card[start][1] = maxRankSuit;
        }
    }
    
}
