package vivekSorting.listSorting.listComparable1;

// refer Youtube Engineering Digest playlist Java Collections Framework 3/22

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		TrainMaster trainMaster = new TrainMaster();
		
		List<Train> trainsList = trainMaster.getTrainsDetails();
		
		trainsList.sort(null);
		
	/*	System.out.println(" ------ Trains List sorted by Train Id in ascending or descending order ------");
		
		for( Train tr : trainsList){
			
			System.out.println("  id : "+tr.getId()+"    train : "+tr.getName());
		}*/
		
	System.out.println(" ------ Trains List sorted by Train Name in ascending or descending order ------");
		
		for( Train tr : trainsList){
			
			System.out.println("  id : "+tr.getId()+"    train : "+tr.getName());
		}
		
	}
	
}
