package ko222gj_assign2;
import java.util.Scanner;
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
		int[] x = new int[100];
        int i = 0, y;
        int counter = 1;   // count the number within the range
       
        
        do
        {
            System.out.printf("Enter new positive integer: " + "\ninteger %d :",counter );
             y = sc.nextInt();
             x[i] = y;
             i++;
             counter++;
        }
        
        while( y >= 0); i--;
        System.out.println("Number of positive integers: "+i);
        System.out.print("In reverse order: ");
        for(int j = i; j >0; j--)
        {
            System.out.print(x[j-1] + " ");
        }
        
        sc.close();
	}

}
