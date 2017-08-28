package ko222gj_assign3;

public class Point {
	private int point1;
	private int point2;
	
	public Point() {
		point1 = 0;
		point2 = 0;
	}
	
	public Point (int p1, int p2) {
		point1 = p1;
		point2 = p2;
	}
	
	public String toString() {
		return ( "(" + point1 + ", " + point2 + ")");
	}
	
	public boolean isEqualTo(Point compare) {
		if (this.point1 == compare.point1) {
			if (this.point2 == compare.point2) {
				return true;
			}
		}
		return false;
	}
	
	public double distanceTo(Point compare) {
		double avstand = Math.sqrt(((this.point1-compare.point1)*(this.point1-compare.point1)) + ((this.point2-compare.point2)*(this.point2-compare.point2)));
		return avstand;
	}
	
	public void move(int movePoint1, int movePoint2) {
		point1 = point1 + movePoint1;
		point2 = point2 + movePoint2;
	}
	
	public void moveToXY(int movePoint1To, int movePoint2To) {
		point1 = movePoint1To;
		point2 = movePoint2To;
	}

}
