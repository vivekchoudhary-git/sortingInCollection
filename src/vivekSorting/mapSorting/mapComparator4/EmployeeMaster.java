package vivekSorting.mapSorting.mapComparator4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMaster {

	public Map<String, Employee> getAllEmployeeData(){
		
		Map<String, Employee> empMap = new HashMap<>(); 
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("bose");
		
		Employee emp1 = new Employee();
		emp1.setId(9);
		emp1.setName("messi");
		
		Employee emp2 = new Employee();
		emp2.setId(4);
		emp2.setName("kohli");
		
		Employee emp3 = new Employee();
		emp3.setId(19);
		emp3.setName("bolt");
		
		Employee emp4 = new Employee();
		emp4.setId(21);
		emp4.setName("bhagat");
		
		empMap.put("politician",emp);
		empMap.put("footballer",emp1);
		empMap.put("cricketer",emp2);
		empMap.put("athlete",emp3);
		empMap.put("freedom fighter",emp4);
		
		return empMap;
		
	}
	
}
