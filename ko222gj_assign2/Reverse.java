package ko222gj_assign2;
import java.util.Scanner;

public class Reverse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        
        char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 
     			's', 'i', 'h', 'T' };
      
        System.out.println(text);
        
        // Using iterating method to reorder the statements
        char [] textArray = text;
        
        for (int i = textArray.length - 1; i >= 0; i--)
        {
            System.out.print(textArray[i]);   
        }
 
        
         char [] textArray2 = text;
        
        for (int i = textArray2.length - 1; i >= 0; i--)
        {
        	
            System.out.print(textArray2[i]);   
        }
         sc.close();
	}

}
