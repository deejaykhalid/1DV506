package ko222gj_assign2;
import java.util.Scanner;
public class Triangle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("Provide an odd positive integer: ");

		int num = sc.nextInt(); // use nextInt() to read int
		System.out.println();
		if (num % 2 == 0) {
			
		}

		else {

			System.out.println("Right-Angled triangel:");

			for (int i = num; i > 0; i--) {

				for (int j = 0; j < i; j++)
					System.out.print(" ");   // print a space, without newline

				for (int j = 0; j <= num - i; j++)
					System.out.print("*"); // print * and a space, without newline

				System.out.println(); // print a newline

			}
			System.out.println("Isosceles triangel:");
			for (int i = 0; i <= num; i = i + 2) {

				for (int j = 0; j < (num - i / 2)-((num/2)+1); j++)
					System.out.print(" ");   // print a space, without newline

				for (int j = 0; j <= i; j++)
					System.out.print("*"); 

				System.out.println();

			}
		}
		sc.close();
	}
}
