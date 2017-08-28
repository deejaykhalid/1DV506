package ko222gj_assign2;
import java.util.Scanner;
public class CountA {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		String string = "All cars got the highest safty grading A";
		System.out.println("Provide name: "+string);
		int countA = 0;
	    for(int A =0; A < string.length(); A++){
	        if(string.charAt(A) == 'A'){
	            countA++;
	                   
	            }
	    }
	    int counta = 0;
	    for(int a =0; a < string.length(); a++){
	        if(string.charAt(a) == 'a'){
	            counta++;
	        }
	    }
	    System.out.println("The number of letter A is: " + countA);
	    System.out.println("The number of letter a is: " + counta);
	    
	    scan.close();
    
	}

}
