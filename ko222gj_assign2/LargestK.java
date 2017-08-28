package ko222gj_assign2;
import java.util.Scanner;
public class LargestK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       int k=0;
       int sum=0;
      
       
       while (sum <8){
       	k=2;
      sum = sum +k;
       	
       System.out.println("Give a positive integer: " );
 	    k=sc.nextInt();
 	    
 	                              
      System.out.println("The largest k such that 0+2+4+6+...+k < " + k + " ==> k = " + sum );      
       
              } 
       sc.close();
       
	}

}
