package ko222gj_assign3;

public class Card {

	private int value;
	int suit;
	
	public Card (int Value, int Suit) {
		value = Value;
		suit = Suit;
	}
	
	private String suitToString() {
		switch(suit) {
		case 0: return "Spades";
		case 1: return "Hearts";
		case 2: return "Clubs";
		case 3: return "Diamonds";
		default: return "Wrong type of suit provided from the Deck konstructor!";
		}
	}
	
	public String valueToString() {
		switch ( value ) {
        case 1:   return "Ace";
        case 2:   return "2";
        case 3:   return "3";
        case 4:   return "4";
        case 5:   return "5";
        case 6:   return "6";
        case 7:   return "7";
        case 8:   return "8";
        case 9:   return "9";
        case 10:  return "10";
        case 11:  return "Jack";
        case 12:  return "Queen";
        case 13:  return "King";
        default: return "Wrong value provided from the Deck constructor!";
        }
	}
	
	public String toString() {
		return valueToString() + " of " + suitToString();
	}
}
