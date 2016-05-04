
import java.util.Arrays;
import java.util.Random;

class Deck {

    Card[] cards;
    
    public Deck() {
        String[] suits = {"C", "D", "H", "S"};
        cards = new Card[52];
        int next = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 1; j < 14; j = j + 1) {
                cards[next] = new Card(suits[i], j);
                next = next + 1;
            }
        }
    }
    
    public void shuffle() {
        Random randy = new Random();
        for (int i = 0; i < cards.length; i = i + 1) {
            int j = randy.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
    
    public Card deal() {
        Card c = cards[cards.length - 1];
        Card[] all_but_last = new Card[cards.length - 1];
        for (int i = 0; i < all_but_last.length; i= i + 1) {
            all_but_last[i] = cards[i];
        }
        cards = all_but_last;
        return c;
    }
    
    public String toString(){
        return Arrays.toString(cards);
    }
}

