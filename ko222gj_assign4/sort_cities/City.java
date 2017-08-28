package ko222gj_assign4.sort_cities;


public class City implements Comparable<City> {
	
	// Fields
	private int postNr = 0;
	private String ort = "";
	
	// Constructor for City
	public City(int nbr, String name) {
		postNr = nbr;
		ort = name;
	}
	
	public int getPostNr() {
		return postNr;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public String toString() {
		return ort + " " + postNr;
	}
	
	// Implement Comparable
	public int compareTo(City o) {
		return postNr - o.postNr;
	}

}