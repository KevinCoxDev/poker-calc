class Card {
    
    private String suit;
    private int value;
    
    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public String getSuit(){
        return suit;
    } 
    
    public int getValue(){
        return value;    
    }
    
    public String toString(){
        return value + "" + suit;
    }
}

