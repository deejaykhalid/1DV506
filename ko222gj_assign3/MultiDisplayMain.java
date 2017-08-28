package ko222gj_assign3;

public class MultiDisplayMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(3);
		md.display();                           // ==> print-out
				
		md.display("Goodbye cruel world!", 2);  // ==> print-out
				
		System.out.println("Current Message: "+ md.getDisplayMessage());
		
	}

}