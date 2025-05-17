package vivekSorting.mapSorting.mapComparator1;

//refer chatGPT 
//Sorting a Map by keys using TreeMap
//sorting by Key in ascending and descending order where key data type is String

import java.util.Collections;

//refer chatGPT 
//Sorting a Map by keys using TreeMap
//sorting by Key in ascending and descending order where key data type is String

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		
		Map<String, Integer> animalMap = new HashMap<>();
		animalMap.put("Dog", 3);
		animalMap.put("Elephant", 8);
		animalMap.put("Cat", 5);
		animalMap.put("Lion", 2);
		animalMap.put("Ant", 1);
		
		// sorting by Key in ascending order
		Map<String, Integer> sortedAnimalMap = new TreeMap<>(animalMap);
		
		Set<Entry<String, Integer>> entryAnimal = sortedAnimalMap.entrySet();
	   
		System.out.println(" ------------ sorting by Key in ascending order -------------- ");	
		for( Entry<String, Integer> en : entryAnimal){
			
			String key = en.getKey();
			Integer value = en.getValue();
			
			System.out.println(" key : "+key+" value : "+value);
			
		}
		
		// sorting by Key in descending order
		Map<String, Integer> reversedSortedAnimalMap = new TreeMap<>(Collections.reverseOrder());
		reversedSortedAnimalMap.putAll(animalMap);
		
		Set<Entry<String, Integer>> reverseEntryAnimal = reversedSortedAnimalMap.entrySet();
		
		System.out.println(" ------------ sorting by Key in descending order -------------- ");	
		
		for(Entry<String, Integer> ent : reverseEntryAnimal){
			
			String key = ent.getKey();
			Integer value = ent.getValue();
			
			System.out.println(" key : "+key+" value : "+value);
			
		}
		
	}
	
}
