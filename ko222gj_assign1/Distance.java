package ko222gj_assign1;
import java.util.Scanner;
import java.lang.Math;
public class Distance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter X1: ");
		int x1 = sc.nextInt();

		System.out.print("Enter X2: ");
		int x2 = sc.nextInt();

		System.out.print("Enter Y1: ");
		int y1 = sc.nextInt();
		
		System.out.print("Enter Y2: ");
		int y2 = sc.nextInt();
		
		     Math.sqrt( (x1-x2)^2 + (y1-y2)^2 );
		     System.out.printf("%.3f\n",Math.sqrt(Math.pow((x1-x2),2)+Math.pow(y1-y2,2)));
	
	   sc.close();

	}

}
