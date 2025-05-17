package vivekSorting.mapSorting.mapComparator2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	// sorting in ascending order
//	@Override
//	public int compare(Employee emp1, Employee emp2) {
//		
//		int i = emp1.getName().compareTo(emp2.getName());
//		
//		return i;
//	}
	
	// sorting in descending order
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		int i = emp2.getName().compareTo(emp1.getName());
		
		return i;
	}

}
