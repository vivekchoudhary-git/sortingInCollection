package vivekSorting.listSorting.listComparator4;

//refer Youtube Engineering Digest playlist Java Collections Framework 3/22
//sorting List Object (Class)  type Using Comparator interface
// here we are using Java 8 Lambda Expressions (with detailed concepts)

import java.util.Comparator;
import java.util.List;

public class TrainTest {

	public static void main(String[] args) {
		
		TrainMaster trainMaster = new TrainMaster();
		
		List<Train> trainsList = trainMaster.getTrainsDetails();
		
		Comparator<Train> trainId = (t1,t2) ->  t1.getId()-t2.getId();                       // sorted in Ascending order
		
		trainsList.sort(trainId);
		
		System.out.println("------ sorted By Train Id in Ascending Order -----------");
		
		for(Train t : trainsList){
			
			System.out.println("id : "+t.getId()+"  train : "+t.getName());
		}
		
		Comparator<Train> trainId1 = (t1,t2) ->  t2.getId()-t1.getId();                       // sorted in Descending order
		
		trainsList.sort(trainId1);
		
		System.out.println("------ sorted By Train Id in Descending Order -----------");
		
		for(Train t : trainsList){
			
			System.out.println("id : "+t.getId()+"  train : "+t.getName());
		}
		
		Comparator<Train> trainName = (t1,t2) -> t1.getName().compareTo(t2.getName());                      // sorting in Ascending order
		
		trainsList.sort(trainName);
		
        System.out.println("------ sorted By Train Name in Ascending Order -----------");
		
		 for(Train t : trainsList){
			
			System.out.println("id : "+t.getId()+"  train : "+t.getName());
		}
		 
		 Comparator<Train> trainName1 = (t1,t2) -> t2.getName().compareTo(t1.getName());                      // sorting in Ascending order
			
			trainsList.sort(trainName1);
			
	        System.out.println("------ sorted By Train Name in Descending Order -----------");
			
			 for(Train t : trainsList){
				
				System.out.println("id : "+t.getId()+"  train : "+t.getName());
			}
		
	}
	
}
