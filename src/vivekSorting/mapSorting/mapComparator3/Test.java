package vivekSorting.mapSorting.mapComparator3;

//refer chatGPT 
//Sorting a Map by Value 
//sorting by Value in ascending and descending order where value data type is integer

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map<String, Integer> fruitsMap = new HashMap<>();
		fruitsMap.put("Banana", 2);
		fruitsMap.put("Apple", 5);
		fruitsMap.put("Orange", 3);
		
		Set<Entry<String, Integer>> fruitsEntrySet = fruitsMap.entrySet();
		
		// here fruits are sorted 
		List<Entry<String, Integer>> fruitsEntryList = new ArrayList<>(fruitsEntrySet);
//	   fruitsEntryList.sort(Entry.comparingByValue());                                                                                          // sorting in Ascending Order
		fruitsEntryList.sort(Entry.<String, Integer>comparingByValue().reversed());                                    // sorting in Descending Order
		
		// using LinkedHashMap to maintain the sorted List Order
		Map<String, Integer> fruitsLinkedMap = new LinkedHashMap<>();
		
		for( Entry<String, Integer> ent : fruitsEntryList){
			
			String key = ent.getKey();
			Integer value = ent.getValue();
			fruitsLinkedMap.put(key, value);
			
		}
		
		// print sorted Map
		
		Set<Entry<String, Integer>> fruitsEntryLinkedSet = fruitsLinkedMap.entrySet();
		
		for( Entry<String, Integer> en : fruitsEntryLinkedSet){
			
			String key = en.getKey();
			Integer value = en.getValue();
			
			System.out.println("key : "+key+" value : "+value);
			
		}
		
	}
	
}
