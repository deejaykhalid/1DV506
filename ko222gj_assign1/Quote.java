package ko222gj_assign1;
import java.util.Scanner;
public class Quote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//to prompt user to write a text
		System.out.print("Please type a line of text: ");
		String scannedText = sc.nextLine();
		
		//To display the result
		System.out.println("Quote: " + "\"" + scannedText + "\""  );
		
		sc.close();
		
	}

}
