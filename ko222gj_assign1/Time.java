package ko222gj_assign1;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		 
		int hours;
        int minutes;
        int seconds;
        
        //Enter what to calculate for
		System.out.print("Please enter a number of seconds: ");
         seconds = in.nextInt();
         
         //formula to calculate hours,minutes and seconds
           hours = seconds / 60/60;
           minutes = seconds / 60%60;
           seconds = seconds  %60 ;
           
          //Display result
          System.out.println("This corresponds to: " + hours +" hours, "  + minutes +  " minutes and "  + seconds + " seconds. "  );
        
          in.close();
		
	}

}
