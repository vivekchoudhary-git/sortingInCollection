package vivekSorting.mapSorting.mapComparator2;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	// sorting in ascending order
//	@Override
//	public int compare(Employee emp1, Employee emp2) {
//		
//		int i = emp1.getId() - emp2.getId();
//		
//		return i;
//	}
	
	
	// sorting in descending order
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		int i = emp2.getId() - emp1.getId();
		
		return i;
	}

}
