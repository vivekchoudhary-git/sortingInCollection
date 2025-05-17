package vivekSorting.listSorting.listComparator4;

import java.util.ArrayList;
import java.util.List;

public class TrainMaster {

	public List<Train> getTrainsDetails(){
		
		List<Train> trainList = new ArrayList<>();
		
		Train train1 = new Train();
		train1.setId(12);
		train1.setName("poorva express");
		
		Train train2 = new Train();
		train2.setId(1);
		train2.setName("jhelum express");
		
		Train train3 = new Train();
		train3.setId(9);
		train3.setName("rajdhani express");
		
		Train train4 = new Train();
		train4.setId(33);
		train4.setName("duronto express");
		
		trainList.add(train1);
		trainList.add(train2);
		trainList.add(train3);
		trainList.add(train4);
		
		return trainList;
		
	}
	
}
