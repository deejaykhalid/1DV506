package ko222gj_assign2;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
	System.out.print("Provide 10 integers: ");
	    
		int plats1 = Integer.MIN_VALUE;
		int plats2 = Integer.MIN_VALUE;
		
		
	    for (int i = 0; i < 10; i++) {
	    	int num = sc.nextInt();  // use nextInt() to read int
	    	    	
	    	if (num > plats1) {
	    		plats2 = plats1;
	    		plats1 = num;
	    	}
	    	
	    	else if (num > plats2 && num < plats1)
	    		plats2 = num;
	    }
	    
	    System.out.println("The second largest is: " + plats2);
	    sc.close();

	}

}
