package ko222gj_assign2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class SalaryRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();

	System.out.print("Provide salaries (and terminate input with 'X'): ");

	Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
	sc.useDelimiter(delimiters); 
	while (sc.hasNextInt()) {
		al.add(sc.nextInt());
	}
	
	// Sorting list 
	Collections.sort(al);

	if (al.size() % 2 == 0) {
		
		int halfSize = al.size() / 2;
		int med = (((al.get(halfSize) + al.get(halfSize - 1)) / 2));
		System.out.println("Median: " + med);

		int averageSal = 0;
		for (int i = 0; i < al.size(); i++) {
			averageSal = averageSal + al.get(i);
		}
		System.out.println("Average: " + (averageSal/al.size()));
		
		System.out.println("Gap: " + (al.get(al.size()-1)-al.get(0)));
			
	}
	if (al.size() % 2 != 0) {
		
		int halfSize = al.size() / 2;
		//int average = (((al.get(halfSize) + al.get(halfSize - 1)) / 2));
		System.out.println("Median: " + al.get(halfSize));

		int averageSal = 0;
		for (int i = 0; i < al.size(); i++) {
			averageSal = averageSal + al.get(i);
		}
		System.out.println("Average: " + (averageSal/al.size()));
		
		System.out.println("Gap: " + (al.get(al.size()-1)-al.get(0)));
		sc.close();	
	}

	}

}
