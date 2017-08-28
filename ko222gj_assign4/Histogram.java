package ko222gj_assign4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


public class Histogram {
	public int count = 0;
	public int size = 0;
	
	public Integer[] readFile (Path dir){
		StringBuilder text = new StringBuilder ();
		ArrayList<Integer> digit = new ArrayList<>();
		System.out.println(dir);
		try{
		File file = new File(dir.toString());
		Scanner fileScan = new Scanner(file);
		while(fileScan.hasNext()) {
			String str = fileScan.nextLine ();
			if(Integer.parseInt(str) <= 100 && Integer.parseInt(str) > 0){
			digit.add(Integer.parseInt(str));
			text.append(str+",");
			}else{
			count++;
			}
			
		}
		fileScan.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		Integer[] list = {};
		size = digit.size();
		list = digit.toArray(list);
		return list;
	}
	
	//list Array of integers in the range 1-100
	 
	public void printOut(Integer[] list) {
		StringBuilder text = new StringBuilder ();
		sort(list);
		int count = 0;
		text.append("Histogram");
		String star = "*";
		for(int i = 0; i < list.length; i++) {
			if(list[i] > 0 && list[i] <= 10) {
				if(count == 0){
					text.append("\n  1  -  10  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 10 && list[i] <= 20) {
				if(count == 1){
					text.append("\n  11  - 20  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 20 && list[i] <= 30) {
				if(count == 2){
					text.append("\n  21  - 30  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 30 && list[i] <= 40) {
				if(count == 3){
					text.append("\n  31  - 40  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 40 && list[i] <= 50) {
				if(count == 4){
					text.append("\n  41  - 50  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 50 && list[i] <= 60) {
				if(count == 5){
					text.append("\n  51  - 60  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 60 && list[i] <= 70) {
				if(count == 6){
					text.append("\n  61  - 70  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 70 && list[i] <= 80) {
				if(count == 7){
					text.append("\n  71  - 80  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 80 && list[i] <= 90) {
				if(count == 8){
					text.append("\n  81  - 90  | ");
					count++;
				}
				text.append(star);
			}else if(list[i] > 90 && list[i] <= 1000) {
				if(count == 9){
					text.append("\n  91  - 100 | ");
					count++;
				}
				text.append(star);
			}
		}
		System.out.println(text.toString());
	}
	
	//Sorts an Array in growing order
	 // Integer[] list unsorted
	 //return Integer[] sorted.
	private Integer[] sort(Integer[] list) {
		Integer [] out = new Integer[list.length];
		System.arraycopy(list, 0, out, 0, list.length);
		boolean match = true;
	    int j = 0;
	    int tmp;
	    while (match) {
	        match = false;
	        j++;
	        for (int i = 0; i < out.length - j; i++) {
	            if (out[i] > out[i + 1]) {
	                tmp = out[i];
	                out[i] = out[i + 1];
	                out[i + 1] = tmp;
	                match = true;
	            }
	        }
	    }
		return out;
	}
}