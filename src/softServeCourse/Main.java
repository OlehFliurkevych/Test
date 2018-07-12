package softServeCourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();
		employees.add(new EmployeeFixedPay("Steve", 1500));
		employees.add(new EmployeeFixedPay("John", 2500));
		employees.add(new EmployeeFixedPay("Bill", 1750));
		employees.add(new EmployeeFixedPay("Kevin", 2500));
		employees.add(new EmployeeFixedPay("Nick", 1250));
		employees.add(new EmployeeHourPay("Jack", 15));
		employees.add(new EmployeeHourPay("Ihor", 11));
		employees.add(new EmployeeHourPay("Oleh", 17));
		employees.add(new EmployeeHourPay("Kevin", 20));
		employees.add(new EmployeeHourPay("Nick", 15));
		
		Collections.sort(employees, new EmployeeComparator());
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println("Problem b:");
		for(int i=0;i<5;i++){
			System.out.println(employees.get(i));
		}
	}

}
