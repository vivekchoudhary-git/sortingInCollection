package vivekSorting.listSorting.listComparable1;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		TrainMaster trainMaster = new TrainMaster();
		List<Train> trainsList = trainMaster.getTrainsDetails();
		
	   List<Train> sortedTrainList = trainsList.stream().sorted().collect(Collectors.toList());
	   
	   sortedTrainList.stream().forEach(x -> System.out.println(x.getId()+"  "+x.getName()));
		
	}
	
}
