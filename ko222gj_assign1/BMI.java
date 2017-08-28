package ko222gj_assign1;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		         double m;
		         double kg;
		         double bmi;
		         
		 //prompt user to insert their lenght
		          System.out.print( "Your lenght in meters: " );
		          m = keyboard.nextDouble();
		 //prompt user to insert their weight
		         System.out.print( "Your weight in kilograms: " );
		         kg = keyboard.nextDouble(); 
		 //formula to calculate the bmi for the user
		         bmi = kg / (m*m);
		 //print out the result
		         System.out.println( "Your BMI is: " + bmi );
		         keyboard.close();
	}

}
