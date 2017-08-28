package ko222gj_assign4;

import java.nio.file.Paths;

public class HistogramMain {

	public static void main(String[] args) {
		
		String text = "C:/Users/khalid/workspace/1DV506/src/ko222gj_assign4/first_file"; 
		Histogram out = new Histogram();
		Integer [] list = out.readFile(Paths.get(text));
		System.out.println("Reading file from: "+text);
		System.out.println("Number of integers in the interval [1,100]: " + out.size);
		System.out.println("Others: " + out.count);
		out.printOut(list);
	}
	
}