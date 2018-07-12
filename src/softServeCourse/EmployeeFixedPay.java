package softServeCourse;

public class EmployeeFixedPay extends Employee{

	int fixedPay;
	
	public EmployeeFixedPay(String name,int fixedPay) {
		this.name=name;
		this.fixedPay = fixedPay;
	}

	@Override
	public double getMonthlySalary() {
		return 0;
	}
	
}
