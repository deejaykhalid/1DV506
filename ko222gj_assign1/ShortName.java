package ko222gj_assign1;
import java.util.Scanner;
public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName,
        lastName;

        Scanner scanner = new Scanner( System.in );
       
        System.out.print("First name: ");
        firstName = scanner.nextLine();

        System.out.print("Last name: ");
        lastName = scanner.nextLine();
        
        String firstScanner = firstName.substring(0,1);
        String lastScanner = lastName.substring(0,4);
        
        System.out.print("Short name: "  + firstScanner + ".\t"+lastScanner);
        scanner.close();
	}

}
