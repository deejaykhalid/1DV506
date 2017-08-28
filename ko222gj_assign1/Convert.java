package ko222gj_assign1;
import java.util.Scanner;
public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner in = new Scanner(System.in);  
		    
		    
		    int Celsius =0;
		    int Fahrenheit=0;
		 
		    // Enter degree to calculate 
		    System.out.print("Temperatue in Fahrenheit: "); 
		    Fahrenheit= in.nextInt();
		    
		    // formula to calculate Celsius
		    Celsius = Math.round(Fahrenheit - 32)*5/9; 
		 
		    //Display the result
		    System.out.println("Temperatue in Celsius = " + Celsius );
		    in.close();
	}

}
