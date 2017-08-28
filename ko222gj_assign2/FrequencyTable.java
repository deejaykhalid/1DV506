package ko222gj_assign2;
import java.util.Random;
public class FrequencyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random randomNumbers = new Random(); // Generates random numbers 
		 
		 int[] array = new int[ 7 ]; // Declares the array 
		 
		 	           
		 
	   //Rolling the die 6000 time
		for ( int roll = 1; roll <=6000; roll++ ) 
		
		++array[ 1 + randomNumbers.nextInt ( 6 ) ]; 
		 
		 	    		 
       System.out.printf( "%s%10s\n", "Frequencies", " when rolling a dice 6000 times. " ); 
		 		 
       // the outputs array values 
	    for ( int face = 1; face < array.length; face++ ) 
      System.out.printf( "%4d%10d\n", face, array[ face ] ); 
	}

}
