package softServeCourse;

public class EmployHourPay extends Employ{

	private int ID;
	private String name;
	private double hourlyRate;
	private double salary;
	
	public EmployHourPay(int iD, String name, double hourlyRate, double salary) {
		ID = iD;
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.salary = salary;
	}
	
	public EmployHourPay(int iD, String name, double hourlyRate) {
		super();
		ID = iD;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}



	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	double AvgSalary(double hourlyRate) {
		return 20.8*8*hourlyRate;
	}
	@Override
	public String toString() {
		return "EmployHourPay [ID=" + ID + ", name=" + name + ", hourlyRate=" + hourlyRate + ", salary=" + salary + "]";
	}
	
	
	
}
