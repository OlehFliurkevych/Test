package softServeCourse;

import java.util.Comparator;
//sorting collection of Employees in DESC order by average monthly salary
//in the case of equals salary order by name
public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getMonthlySalary()>emp2.getMonthlySalary()){
			return -1;
		}
		else if(emp1.getMonthlySalary()<emp2.getMonthlySalary()){
			return 1;
		}else{
			return emp1.getName().compareTo(emp2.getName());
		}
			
		
	}

	
}
