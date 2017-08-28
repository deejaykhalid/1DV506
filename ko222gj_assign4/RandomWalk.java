package ko222gj_assign4;
import java.util.Random;

public class RandomWalk {
	private int x;
	private int y;
	private int max;
	private int steps;
	private int size;
	private Random random = new Random();
	private int rand;
	
	public RandomWalk(int Size, int Max) {
		size = Size;
		max = Max;
		x = 0;
		y = 0;
		steps = 0;
	}
	
	//  Prints a string representation of the current position and the steps taken since start.
	 
	public String toString() {
		return "X: "+x+" Y: "+y+" Steps taken: "+steps;
	}
	
	  //Takes a step in a random direction on the board
	 
	private void takeStep() {
		rand = random.nextInt(7);
		if(rand == 0){
			x = x + 1;
		}else if(rand == 1 || rand == 4){
			y = y + 1;
		}else if(rand == 2 || rand == 5){
			x = x - 1;
		}else if(rand == 3 || rand == 6){
			y = y - 1;
		}else 
			throw new IllegalArgumentException("The random number generated was not in the range 0-6.");
		steps++;
	}
	
	//return boolean
	 
	public Boolean moreSteps() {
		if(steps < max){
			return true;
		}else 
			return false;
	}
	
	//Checks if the walker is still on the board.
	 //return boolean value
	 
	public Boolean inBounds() {
		if(size > Math.abs(x) && size > Math.abs(y)) {
			return true;
		}else 
			return false;
	}
	
	public void walk(){
		while(moreSteps() && inBounds()) {
			takeStep();
		}
		
	}

}
