package softServeCourse;

public class EmployFixedPay extends Employ{

	private int ID;
	private String name;
	private double fixedPay;
	
	public EmployFixedPay(int iD, String name, double fixedPay) {
		ID = iD;
		this.name = name;
		this.fixedPay = fixedPay;
	}
	@Override
	double AvgSalary(double fixedPay) {
		return fixedPay;
	}
	@Override
	public String toString() {
		return "EmployFixedPay [ID=" + ID + ", name=" + name + ", fixedPay=" + fixedPay + "]";
	}
	

	
}
