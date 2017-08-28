package ko222gj_assign1;
import java.util.Scanner;
public class SumOfThree {

	public static void main(String[] args) {
		
		//creating scanner
		Scanner in = new Scanner(System.in);
		int digit =0;
		int sum =0;
		

	      System.out.print("Provide a three digit number: ");
		digit  = in. nextInt ();	
		
		//formula to calculate the sum
		sum = digit / 32 ;

        // display result
		System.out.println("Sum of digits: " + sum   );
		in.close();
	}

}
