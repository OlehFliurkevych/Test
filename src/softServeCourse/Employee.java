package softServeCourse;

public abstract class Employee {

	static int idCounter;
	int id=0;
	String name;
	
	public Employee(){
		idCounter++;
		id=idCounter;
	}
	public abstract double getMonthlySalary();
	
	public static int getIdCounter() {
		return idCounter;
	}
	public static void setIdCounter(int idCounter) {
		Employee.idCounter = idCounter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name +", salary="+getMonthlySalary()+ "]";
	}
}
