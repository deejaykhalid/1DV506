package ko222gj_assign4.stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		
		PerfectStack test = new PerfectStack();
		
		if (test.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
				System.out.println("Stack contains");
		}
		
		test.push("audi");
		test.push("bugatti");
		test.push("ferarri");
		test.push("bentley");
		test.push("mercedes-benz");
		test.push("volvo");
		
		if (test.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack contains");
		}
		
		System.out.println(test.pop());
		System.out.println(test.peep());
		System.out.println(test.pop());
		System.out.println(test.peep());
		
		//Iterator test
		
		System.out.println( "\n" + "Testing the Iterator below: ");
		
		Iterator<Object> it = test.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());;
		}
		
		
	}	
}