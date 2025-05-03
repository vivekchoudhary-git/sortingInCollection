package vivekSorting.listSorting.listComparator2;

import java.util.Comparator;

public class SportsComparator implements Comparator<String> {

	// sorting in ascending order
/*	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}*/

	// sorting in descending order
	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
	}
	
}
