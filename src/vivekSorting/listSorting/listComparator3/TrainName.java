package vivekSorting.listSorting.listComparator3;

import java.util.Comparator;

public class TrainName implements Comparator<Train> {

	// sorting in ascending order
/*	@Override
	public int compare(Train t1, Train t2) {
		
		int i = t1.getName().compareTo(t2.getName());
		
		return i;
	}*/
	
	// sorting in descending order
	@Override
	public int compare(Train t1, Train t2) {
		
		int i = t2.getName().compareTo(t1.getName());
		
		return i;
	}

}
