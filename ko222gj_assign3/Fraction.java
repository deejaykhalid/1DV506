package ko222gj_assign3;

public class Fraction {
	private int D; 
	private int N; 

	public Fraction() {
	}

	public Fraction(int dIn, int nIn) {
		if (nIn != 0) {
			D = dIn;
			N = nIn;
		}
		if (nIn == 0) {
			System.out.println("0 is not a number cop!");
		}
	}

	public void setNumerator(int dIn) {
		D = dIn;
	}

	public void setDenominator(int nIn) {
		if (nIn != 0) {
			N = nIn;
		}
		if (nIn == 0) {
			System.out.println("0 is not a number cop!");
		}
	}

	public int getNumerator() {
		return D;
	}

	public int getDenominator() {
		return N;
	}

	public String add(int newD, int newN) {
		if (newN != 0) {
			if (newN == N) {
				D = D + newD;
				return Integer.toString(D) + "/" + Integer.toString(N);
			}
			if (newN != N) {
				D = ((D * N) + (D * newN));
				N = (N * newN);
				return Integer.toString(D) + "/" + Integer.toString(N);
			}
		}
		return "Cant divide by 0, cop";
	}

	public String subtract(int newD, int newN) {
		if (newN != 0) {
			if (newN == N) {
				D = D - newD;
				return Integer.toString(D) + "/" + Integer.toString(N);
			}
			if (newN != N) {
				D = ((D * N) - (D * newN));
				N = (N * newN);
				return Integer.toString(D) + "/" + Integer.toString(N);
			}
		}
		return "Cant divide by 0, cop";
	}

	public String multiply(int newD, int newN) {
		if (newN != 0) {

			D = (D*newD);
			N = (N * newN);
			return Integer.toString(D) + "/" + Integer.toString(N);

		}
		return "Cant divide by 0, cop";
	}

	public String divide(int newD, int newN) {
		if (newN != 0) {

			D = (D * newN);
			N = (N * newD);
			return Integer.toString(D) + "/" + Integer.toString(N);

		}
		return "Cant divide by 0, cop";
	}
	
	public boolean isNegative() {
		if ((D/N) < 0) {
			return true;
		}
		return false;
	}
	
	public boolean isEqualTo(int newD, int newN) {
		if ((D == newD)&&(N == newN)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return Integer.toString(D)+"/"+Integer.toString(N);
	}

}
