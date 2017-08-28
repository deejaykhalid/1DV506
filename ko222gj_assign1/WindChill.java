package ko222gj_assign1;
import java.util.Scanner;
import java.lang.Math;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Enter temperature
		System.out.print("\ntemperature: ");
		String temp = sc.next();
		//Enter wind speed 
		System.out.print("\nwind speed: ");
		String wind = sc.next();

		double tempDouble = Double.parseDouble(temp);
		double windDouble = Double.parseDouble(wind);

		//Formula to calculate wind chill
		double windchill = Math.round(( 35.74+0.6215*tempDouble-35.74*Math.pow(windDouble, 0.16)+0.4875195*tempDouble*Math.pow(windDouble, 0.16)));
		
		System.out.print("Windchill temperature: "+ windchill);

		sc.close();

	}

}
