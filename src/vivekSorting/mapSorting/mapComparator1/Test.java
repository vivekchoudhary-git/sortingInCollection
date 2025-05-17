package vivekSorting.mapSorting.mapComparator1;

// refer chatGPT 
// Sorting a Map by keys using TreeMap
// sorting by Key in ascending and descending order where key data type is integer

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "brett lee");
		studentMap.put(8, "shane warne");
		studentMap.put(5, "adam gilchrist");
		studentMap.put(13, "ricky ponting");
//		studentMap.put(null, "hayden");                                         // Note : we can not sort the map by key if the key is null
		
		// sorting by key in ascending order
		Map<Integer, String> sortedStudentMap = new TreeMap<>(studentMap);
		
		Set<Entry<Integer, String>> entrySetStudent = sortedStudentMap.entrySet();
		
		System.out.println(" --------- sorting by key in ascending order ---------");
		for( Entry<Integer, String> eStudent : entrySetStudent) {
			
			Integer key = eStudent.getKey();
			String value = eStudent.getValue();
			
			System.out.println("key : "+key+"  value : "+value);
			
		}
		
		// sorting by key in descending order
		Map<Integer, String> reversedSortedStudentMap = new TreeMap<>(Collections.reverseOrder());
		reversedSortedStudentMap.putAll(studentMap);
		Set<Entry<Integer, String>> reversedEntrySetStudent = reversedSortedStudentMap.entrySet();
		
		System.out.println(" --------- sorting by key in descending order ---------");
        for( Entry<Integer, String> revesedStudent : reversedEntrySetStudent) {
			
			Integer key = revesedStudent.getKey();
			String value = revesedStudent.getValue();
			
			System.out.println("key : "+key+"  value : "+value);
			
		}
		
	}
	
}
