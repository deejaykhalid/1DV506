package ko222gj_assign3;

public class Play123Main {


		public static void main(String[] args) {
			Deck deck = new Deck();
			deck.shuffle();
			int count = 0;
			for(int i = 0; i < 10000; i++){
				if(deck.play123()){
					count++;
				}
			}
			System.out.println("Win rate is 0.0"+count+"%.");
	}

}	