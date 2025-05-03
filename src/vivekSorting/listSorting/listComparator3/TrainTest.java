package vivekSorting.listSorting.listComparator3;

// refer Youtube Engineering Digest playlist Java Collections Framework 3/22
// sorting List Object (Class)  type Using Comparator interface

import java.util.List;

public class TrainTest {

	public static void main(String[] args) {
		
		TrainMaster trainMaster = new TrainMaster();
		List<Train> trainsList = trainMaster.getTrainsDetails();
		
		System.out.println("------- trainsList before Sorting --------");
		
		for(Train tr : trainsList){
			System.out.println("Train id : "+tr.getId()+" Train Name : "+tr.getName());
		}
		
		// sorting by Train Id in ascending and descending order
		trainsList.sort(new TrainId());
		
		System.out.println("------- trainsList after Sorting by TrainId --------");
		
		for(Train tr : trainsList){
			System.out.println("Train id : "+tr.getId()+" Train Name : "+tr.getName());
		}
		
		// sorting by Train Name in ascending and descending order
		trainsList.sort(new TrainName());
		
	System.out.println("------- trainsList after Sorting by TrainName --------");
		
		for(Train tr : trainsList){
			System.out.println("Train id : "+tr.getId()+" Train Name : "+tr.getName());
		}
		
	}
	
}
