package ko222gj_assign3;
public class Arrays {

	public static void main(String[] args) {
		int[] data = {1,2,3,6,4,9,5,2}; //Array to be used in examples
		
		int total = sum(data);
		System.out.print("Sum: " + total + "\n");
		
		String str = Arrays.toString(data);
		System.out.print("data = " + str + "\n");
		
		int[] rArray = reverse(data);
		System.out.print(toString(rArray) + "\n");
		
		int n = 4;
		System.out.print(hasN(data,n) + "\n");
		
		int old = 2;
		int nw = 11;
		replaceAll(data, old, nw);
		
		System.out.print(toString(sort(data)) + "\n" );
		
		int[] sub = {9,5,2};
		System.out.print(hasSubSequence(data, sub));
	}
	private static int sum(int[] arr) {
		int sum = 0;
		int i = 0;
		while (i < arr.length) {
			sum = sum + arr[i];
			i += 1;
		}
		return sum;
	}
	
	private static String toString(int[] arr) {
		String str = "";
		int i = 0;
		while (i < arr.length) {
			str = str+arr[i] + " ";
			i += 1;
		}
		
		return str;
	}
	
	private static int[] reverse(int[] arr) {
		int[] rArr = new int[arr.length];
		int i = 0;
		while (i < arr.length) {
			rArr[i] = arr[(arr.length-1)-i];
			i += 1;
		}
		return rArr;
	}
	
	private static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i] == n) {
				return true;
			} 
		}
		return false;
	}
	
	private static void replaceAll(int[] arr, int old, int nw) {
		int[] nArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i += 1){
			if ( arr[i] == old) {
				nArr[i] = nw;
			}
			else {
				nArr[i] = arr[i];
			}
		}
		System.out.print(toString(nArr) + "\n");
		
	}
	
	private static int[] sort(int[] arr) {
		int[] sortedArr = new int[arr.length];
		int[] tmpArr = new int[1];
		//Copy original copy to keep original
		for (int i = 0; i < arr.length; i += 1) {
			sortedArr[i] = arr[i];
		}
		
		for (int i = 1; i < sortedArr.length; i += 1) {
			if ( sortedArr[i] < sortedArr[i-1]) {
				tmpArr[0] = sortedArr[i-1];
				sortedArr[i-1] = sortedArr[i];
				sortedArr[i] = tmpArr[0];
				i = 0;					// to loop through back to beginning of array
			}
		}
		return sortedArr;
	}
	
	private static boolean hasSubSequence(int[] arr, int[] sub) {
		boolean ok = false;

			for (int i = 0; i <= arr.length - sub.length; i += 1) {
				ok = true;
				for (int j = 0; j < sub.length; j += 1) {
					if (arr[i+j] != sub[j]) {
						ok = false;
						break;		
					}
				}
			}
			if (ok) {
				return true;
			} else {
				return false;
			}
	}
}
