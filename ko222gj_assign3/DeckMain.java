package ko222gj_assign3;

public class DeckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String discardPile = "Cards played this game:\n";
		String currentCard;
		int rounds = 5;
		Deck deck = new Deck();
		deck.shuffle();
		for (int i = 1; i <= rounds; i++){
		currentCard = deck.dealCard().toString();
		System.out.println("Current round: "+currentCard);
		discardPile += "Round "+i+" : "+currentCard+"\n"; 
		}
		System.out.println(discardPile);
		System.out.println(deck.cardsLeft());
		

	}

}
