package vivekSorting.mapSorting.mapComparator2;

//refer chatGPT 
//Sorting a Map by keys using TreeMap
//sorting by Key in ascending and descending order where key data type is Class type (Object)

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		EmployeeMaster employeeMaster = new EmployeeMaster();
		
		Map<Employee, String> empMap = employeeMaster.getAllEmployeeData();
		
		// sorting by Employee Id
		Map<Employee, String> sortedEmpById = new TreeMap<>(new IdComparator());
		sortedEmpById.putAll(empMap);
	
		Set<Entry<Employee, String>> entryEmp = sortedEmpById.entrySet();
		
//		System.out.println("------- sorting by Key (Employee Id) in Ascending Order ---------------");
//		for( Entry<Employee, String> ent : entryEmp){
//			
//			Employee key = ent.getKey();
//			String value = ent.getValue();
//			
//			System.out.println("key : "+key+" value : "+value);
//			
//		}
		
		System.out.println("------- sorting by Key (Employee Id) in Descending Order ---------------");
		for( Entry<Employee, String> ent : entryEmp){
			
			Employee key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("key : "+key+" value : "+value);
			
		}
		
		// sorted by Employee Name
		Map<Employee, String> sortedEmpByName = new TreeMap<>(new NameComparator());
		sortedEmpByName.putAll(empMap);
		
		Set<Entry<Employee, String>> entryEmp1 = sortedEmpByName.entrySet();
		
//		System.out.println("----------- sorting by Key (Employee Name) in Ascending Order ---------------");
//		for( Entry<Employee, String> ent : entryEmp1){
//			
//			Employee key = ent.getKey();
//			String value = ent.getValue();
//			
//			System.out.println("key : "+key+" value : "+value);
//			
//		}
		
		System.out.println("----------- sorting by Key (Employee Name) in Descending Order ---------------");
		for( Entry<Employee, String> ent : entryEmp1){
			
			Employee key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("key : "+key+" value : "+value);
			
		}
		
	}
	
}
