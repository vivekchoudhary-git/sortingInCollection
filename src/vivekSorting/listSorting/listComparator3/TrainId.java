package vivekSorting.listSorting.listComparator3;

import java.util.Comparator;

public class TrainId implements Comparator<Train>{

	// sorting in ascending order
/*	@Override
	public int compare(Train t1, Train t2) {
		
		int i = t1.getId() - t2.getId();
		
		return i;
	}*/

	// sorting in descending order
	@Override
	public int compare(Train t1, Train t2) {
		
		int i = t2.getId() - t1.getId();
		
		return i;
	}
	
}
