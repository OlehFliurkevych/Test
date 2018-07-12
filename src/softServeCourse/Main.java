package softServeCourse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
		
		System.out.println("Problem A:");
		for(int i=0;i<5;i++){
			System.out.println(employees.get(i));
		}
		
		System.out.println("Problem B:");
		for(int i=employees.size()-1;i>employees.size()-3-1;i--){
			System.out.println(employees.get(i).getId());
		}
		
		writeEmployeesToFile(employees);
		
		System.out.println("Read collection from file:");
		List<Employee> list=readEmployeesFromFile();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}
	
	//write collection to file
	public static void writeEmployeesToFile(List<Employee> list){
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"))){
			oos.writeObject(list);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	//read collection from file
	public static List<Employee> readEmployeesFromFile(){
		List<Employee> resultList=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"))){
			resultList=(List<Employee>)ois.readObject();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}

}
