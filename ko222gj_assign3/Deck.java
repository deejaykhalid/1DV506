package ko222gj_assign3;

public class Deck {
	private Card[] deck;
	private int discardPile;
	
	public Deck() {
		deck = new Card[52];
		int count = 0;
		for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 1; value <= 13; value++ ) {
                deck[count] = new Card(value,suit);
                count++;
            }
        }
		discardPile = 0;
	}
	
	public int cardsLeft() {
		if (52 == discardPile){
			System.out.println("The deck is empty.");
		}
		return deck.length - discardPile;
	}
	
	public void shuffle() {
		if (discardPile == 0) {
		for ( int i = deck.length - 1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
		discardPile = 0;
		} else {
			System.out.println("The deck can only be shuffled when it is full!");
		}
	}
	
	public Card dealCard() {
		if (discardPile == 52){
			discardPile = 0;
			shuffle();
			discardPile += 1;
			return deck[discardPile];
		}else {
		discardPile += 1;
		return deck[discardPile - 1];
		}
	}
	
	public Boolean play123() {
		String currentCard;
		int count = 1;
		Boolean win = true;
		for(int i = 0; i < 52; i++) {
			if (count == 4){
				count = 1;
			}
			currentCard = dealCard().valueToString();
			if (count == 1 && currentCard == "Ace") {
				return false;
			}else if (count == 2 && currentCard == "2"){
				return false;
			}else if (count == 3 && currentCard == "3"){
				return false;
			}
			count++;
		}
		return win;
	}
	
}
