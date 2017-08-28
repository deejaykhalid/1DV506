package ko222gj_assign2;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter a postive integer value: ");
	String input = sc.next();  // use next() to read String

	//Iterate
	int Odd = 0;
	int Even = 0;
	int Zero = 0;
	for(int i = 0; i < input.length(); i++){
	char c = input.charAt(i);
	int num = Integer.parseInt(Character.toString(c));

	if(num == 0)
	Zero++;
	else if(num%2 == 0)
	Even++;
	else
	Odd++;
	}

	//Print results
	System.out.println("odd: " + Odd);
	System.out.println("Even: " + Even);
	System.out.println("Zero: " + Zero);
    
    sc.close();
        
	}

}
