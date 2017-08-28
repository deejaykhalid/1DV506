package ko222gj_assign4;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws IOException{
		
		File inputFile = new File ("C:/Users/khalid/Downloads/ant.jpg");
		int countNum = 0;
		int countOthers = 0;
		
		//Create array to keep track of the count. 
		int [] array = new int[11];
		for (int i = 0; i < array.length; i += 1) {
			array[i] = 0;
		}
		
		Scanner scan = new Scanner (inputFile);
		
		System.out.println("Läser heltal från filen: " + inputFile);
		
		while ( scan.hasNextInt()) {			
			int num = scan.nextInt();
			System.out.print(num);
			
			if (num >= 101 || num < 0) {	// Not valid number
				countOthers += 1;
			}
			if (num >= 0 && num < 101) {		// Valid number
				int sort = num / 10; 			// remove last digit so it can be added into the array, 11 turns into 1 and 45 into 4.
				array[sort] = array[sort] +1;	// increment value in the right position in the array
				countNum += 1;
			}
		}
		scan.close();
		
		System.out.println("Antal i intervallet [1, 100]: " + countNum);
		System.out.println("övriga: " + countOthers);
		System.out.println("Histogram: ");
		
		for (int i = 1; i < array.length-1; i += 1) {
			System.out.print(( i * 10) + "-" + ((i * 10 + 10)) + " | " );
			for (int j = 1; j <= array[i]; j += 1) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}