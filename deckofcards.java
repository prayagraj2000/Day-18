public class deckofcards { 
    public static void main(String[] args) { 
        String[] card_rank = new String[13];
        for(int i=1;i<card_rank.length;i++){
            if(i==1)
            card_rank[i]="Ace";
            else if(i==11)
            card_rank[i]="Jack";
            else if(i==12)
            card_rank[i]="Queen";
            else if(i==13)
            card_rank[i]="King";
            else 
            card_rank[i]=Integer.toString(i);
        }
        String[] card_suit = {"Clubs", "Hearts", "Spades", "Diamonds"}; 
        int len = 52; 
        String[] cards_deck = new String[len]; 
        int rank_len=card_rank.length;
        int suit_len=card_suit.length;
        for (int i=0; i<rank_len; i++) { 
            for (int j=0; j<suit_len; j++) { 
                cards_deck[(suit_len)*i + j] = card_rank[i] + " of " + card_suit[j];
                }}
                for (int i=0; i<len; i++) { 
                    int index = i + (int) (Math.random() * (len-i)); 
                    String temp = cards_deck[index]; 
                    cards_deck[index] = cards_deck[i]; 
                    cards_deck[i] = temp;
                    } 
                    for (int i=0; i<len; i++) 
                    System.out.println(cards_deck[i]);    
    } }
