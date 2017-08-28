package ko222gj_assign4.sort_cities;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortCities {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		File inputFile = new File ("C:/Users/khalid/workspace/1DV506/src/ko222gj_assign4/sort_cities/cities.txt"
				);
		System.out.println("Reading cities from file: " + inputFile);
		
		List<City> cityList = new ArrayList<City>();
		Scanner scan = new Scanner (inputFile);		
		
		while (scan.hasNext()) {
			String currentLine = scan.nextLine();
			String splitChar = ";";
			String[] array = currentLine.split(splitChar);	// Create array after splitting at the ;
			//System.out.println(array[0]);
			//System.out.println(array[1]);
			int arrayPart1 = Integer.parseInt(array[0]);	
			String arrayPart2 = array[1];					//city
			City city = new City(arrayPart1, arrayPart2);
			cityList.add(city);
		}
		int nbrOfCitys = cityList.size();
		System.out.println("Number of cities found: " + nbrOfCitys);
		
		Collections.sort(cityList);							// Using collection instead of arrays since I use arrayList
		for (City ort : cityList)
			System.out.println(ort.toString());
		


		scan.close();

	}

}

	


	
		        