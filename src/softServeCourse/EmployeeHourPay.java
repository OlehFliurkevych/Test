package softServeCourse;

public class EmployeeHourPay extends Employee{

	int hourlyRate;
	
	public EmployeeHourPay(String name,int hourlyRate) {
		this.name=name;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getMonthlySalary() {
		return 20.8*8*hourlyRate;
	}

	
	
}
