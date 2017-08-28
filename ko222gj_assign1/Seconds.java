package ko222gj_assign1;
import java.util.Scanner;
public class Seconds {

	public static void main(String[] args) {
		
		// create Scanner to read user input
		Scanner input = new Scanner(System.in);
		
		int hours;
		int minutes;
		int seconds;
		
		
		System.out.print("Hours: ");
        hours = input.nextInt();
        
        System.out.print("Minites: ");
        minutes = input.nextInt();
        
        System.out.print("Seconds: " ); 
        seconds = input.nextInt();
        
        // formula to calculate for the total amount of time in seconds
        minutes += (hours*60);
         seconds+= (minutes*60);
        
      // To display the result calculated
        System.out.println("\nThe amount of seconds in: " +seconds);
        input.close();

        
       
	}

}
