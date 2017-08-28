package ko222gj_assign4.stack;
import java.util.Iterator;

public class PerfectStack implements Stack {
	
	
	private int counter = 0;
	private Object[] array = new Object[3];
	
	public Object peep() {
		if (isEmpty()) {						// If empty, do nothing
			return null;
		} else {
			return array[counter];				// Return last object in array
		}
	}
	
	// Add object to stack(array). First check if counter is less then array, if so add one otherwise extend the array before
	public void push(Object element) {
		if ( counter < array.length - 1) {
			counter += 1;
			array[counter] = element;
		} else {
			increaseSize();
			counter += 1;
			array[counter] = element;
		}
		
	}
	
	
	// Remove object from stack (array)
	public Object pop() {
		if (isEmpty()) {					// If empty, do nothing
			return null;
		} else {
			Object pops = array[counter];	
			array[counter] = null;			// Zero the space in the array
			counter -= 1;
			return pops;
		}
		
	}
	
	// Check the stack
	
	// Check if counter is zero
		public boolean isEmpty() {
			if (counter == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		// Return size of stack
		public int size() {
			return counter;
		}
	
	// Need a help function to extend the size of the array
	private void increaseSize() {
		Object[] temp = new Object[array.length * 2];
		for (int i = 0; i < array.length; i += 1) {
			temp[i] = array[i];
		}
		array = temp;		
	}
	
	// Attempt to implement the java iterator as I understood the assignment and forum, i.e implement the java iterator in my own iterator, did not create a different class for this
	public Iterator<Object> iterator() {
        Iterator<Object> it = new Iterator<Object>() {
           
        	private int iteratorIndex = 0;
            
           public boolean hasNext() {
                return iteratorIndex < counter;		// Return true if iterator index(iteratorIndex) are less then array index(counter)
       	    }
            
            public Object next() {					// Return next object in array
                iteratorIndex++;
                return array[iteratorIndex];
            }
            
        };
        return it;
    }
	

}