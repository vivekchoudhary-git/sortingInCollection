package vivekSorting.mapSorting.mapComparator4;

// refer chatGPT
// Sorting a Map by Value 
// sorting by Value in ascending and descending order where value data type is Custom Class type (Object)

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		EmployeeMaster employeeMaster = new EmployeeMaster();
		
		Map<String, Employee> empMap = employeeMaster.getAllEmployeeData();
		
		Set<Entry<String, Employee>> empEntrySet = empMap.entrySet();
		
		// Convert to list
		List<Entry<String, Employee>> empEntryList = new ArrayList<>(empEntrySet);
		
		// sort by Employee name
		Collections.sort(empEntryList, new NameComparator());
		
		 // Create a LinkedHashMap to preserve the sorted order
		Map<String, Employee> empLinkedMap = new LinkedHashMap<>();
		
		for( Entry<String, Employee> en : empEntryList){
			
			String key = en.getKey();
			Employee value = en.getValue();
			
			empLinkedMap.put(key, value);
		}
		
		// print the output
		System.out.println("----------- sorting by Employee name -------------");
		Set<Entry<String, Employee>> empLinked = empLinkedMap.entrySet();
		
	for( Entry<String, Employee> en : empLinked){
			
			String key = en.getKey();
			Employee value = en.getValue();
			
			System.out.println("key : "+key+" value : "+value);
		}
		
	}
	
}
