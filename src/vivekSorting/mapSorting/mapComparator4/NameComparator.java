package vivekSorting.mapSorting.mapComparator4;

import java.util.Comparator;
import java.util.Map.Entry;

public class NameComparator implements Comparator<Entry<String, Employee>> {

	// sorting in ascending order
//	@Override
//	public int compare(Entry<String, Employee> ent1, Entry<String, Employee> ent2) {
//		
//		int i = ent1.getValue().getName().compareTo(ent2.getValue().getName());
//		
//		return i;
//	}

	// sorting in descending order
	@Override
	public int compare(Entry<String, Employee> ent1, Entry<String, Employee> ent2) {
		
		int i = ent2.getValue().getName().compareTo(ent1.getValue().getName());
		
		return i;
	}
	
}
