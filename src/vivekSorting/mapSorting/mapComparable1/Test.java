package vivekSorting.mapSorting.mapComparable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		EmployeeMaster employeeMaster = new EmployeeMaster();
		
		Map<Employee, String> empMap = employeeMaster.getAllEmployeeData();
		
		// convert it to Tree Map for sorting
		Map<Employee, String> empTreeMap = new TreeMap<>(empMap);             
		
		// print the output
		Set<Entry<Employee, String>> empEntrySet = empTreeMap.entrySet();
		
		System.out.println("---------- Sorting By Name -----------");
		for(Entry<Employee, String> en : empEntrySet){
			
			Employee key = en.getKey();
			String value = en.getValue();
			
			System.out.println("key : "+key+" value : "+value);
			
		}
		
	}
	
}
