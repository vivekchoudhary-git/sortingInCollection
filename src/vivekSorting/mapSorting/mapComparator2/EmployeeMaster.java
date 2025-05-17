package vivekSorting.mapSorting.mapComparator2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMaster {

	public Map<Employee, String> getAllEmployeeData(){
		
		Map<Employee, String> empMap = new HashMap<>(); 
		
		Employee emp = new Employee();
		System.out.println("emp hashcode : "+emp.hashCode());
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
		System.out.println("emp4 hashcode : "+emp4.hashCode());
		emp4.setId(21);
		emp4.setName("bhagat");
		
		empMap.put(emp,"politician");
		empMap.put(emp1,"footballer");
		empMap.put(emp2,"cricketer");
		empMap.put(emp3,"athlete");
		empMap.put(emp4,"freedom fighter");
		
		return empMap;
		
	}
	
}
