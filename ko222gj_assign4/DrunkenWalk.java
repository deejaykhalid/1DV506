package ko222gj_assign4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scan.nextInt();
		System.out.print("Enter the number of steps: ");
		int max = scan.nextInt();
		System.out.print("Enter the number ok walks: ");
		int times = scan.nextInt();
		int count = 0;
		scan.close();
		for(int i = 0; i < times; i++){
			RandomWalk d = new RandomWalk(size, max);
			d.walk();
			if(!d.inBounds()){
				count++;
			}
		}
		
		double percentage = (double)(count*100)/times;
		DecimalFormat dFormat = new DecimalFormat("0.###");
		String three_decimals = dFormat.format(percentage);

		System.out.println("Out of "+times+" drunk people "+ count+" ("+three_decimals+" %) fell into the water.");

	}

}