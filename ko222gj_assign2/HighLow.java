package ko222gj_assign2;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random randInt = new Random();

		int theInt = randInt.nextInt(100)+1;
		int userGuess = -1;
		int counter = 1;
		
		while ( userGuess != theInt ){
		    
		    System.out.printf("Guess %d: ",counter);
		    userGuess = sc.nextInt();

		    if ( userGuess == theInt ) {
			System.out.printf("Answer: %d guess - excelent!", counter);
		    }
		    if ( userGuess < theInt ) {
			System.out.println("Clue: higher");
		    }
		    if ( userGuess > theInt ) {
			System.out.println("Clue: lower");
		    }
		    if ( counter == 10 ) {
			System.out.println("Correct answer after only 3 guesses – Excellent!");
			break;
		    }
		    counter++;
		}
		sc.close();

	}

}
