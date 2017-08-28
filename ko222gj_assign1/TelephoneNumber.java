package ko222gj_assign1;
import java.util.Random;
public class TelephoneNumber {

	public static void main(String[] args) {
		
				Random randInt = new Random();
				
				System.out.print("0");
				
				//For random integers number
				for(int t=0; t<3; t++)	
				System.out.print(randInt.nextInt (9));
				System.out.print("-"+(randInt.nextInt(8) + 1));
				
				System.out.print("0");
				for(int k=0; k<4; k++)	
		        System.out.print(randInt.nextInt(9));
				
			
		
	       
	}
	
	
}	