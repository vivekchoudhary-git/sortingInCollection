package vivekSorting.listSorting.listComparator1;

// numbers =  [5, 11, 2, 25, 19, 1]

import java.util.Comparator;

public class NumbersComparator implements Comparator<Integer> {

	// sorting in ascending order
/*	@Override
	public int compare(Integer a, Integer b) {
		
		
		return a-b;
	}*/
	
	// sorting in descending order
	@Override
	public int compare(Integer a, Integer b) {
		
		
		return b-a;
	}

}
