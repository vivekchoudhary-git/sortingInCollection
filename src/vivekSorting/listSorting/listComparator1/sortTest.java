package vivekSorting.listSorting.listComparator1;

// refer Youtube Engineering Digest playlist Java Collections Framework 3/22
// sorting List integer type Using Comparator interface

import java.util.ArrayList;
import java.util.List;

public class sortTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(11);
		numbers.add(2);
		numbers.add(25);
		numbers.add(19);
		numbers.add(1);
		
		// sorting in ascending order
//		numbers.sort(null);
		
//		another way to do this
		numbers.sort(new NumbersComparator());
		
//		System.out.println("numbers in ascending order  : "+numbers);
		
		// sorting in descending order
		numbers.sort(new NumbersComparator());
		System.out.println("numbers in descending order  : "+numbers);
		
		
	}
	
	
}
