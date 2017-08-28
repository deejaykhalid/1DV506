package ko222gj_assign2;
import java.util.Scanner;
public class Backward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
			
		System.out.print("Provide a line of text: ");
		
		String textIn = sc.nextLine();

		System.out.print("Backwards: ");
		
		for ( int i = textIn.length()-1 ; i >= 0 ; i-- ){
		    System.out.print(textIn.charAt(i));
		}
        sc.close();

	}

}
