package softServeCourse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<Employ> employs=new ArrayList<>();
		double maxRandHour=20.9;
		double minRandHour=9.9;
		double maxRandFix=3500.0;
		double minRandFix=1500.0;
		Random rand=new Random();
			for(int i=0;i<20;i++){
				if(i%2==0){
					employs.add(new EmployFixedPay(i, "Employ"+i,
							Math.round((minRandFix+(maxRandFix-minRandFix)*rand.nextDouble())*10)/10.0));
				}else{
					EmployHourPay empHour=new EmployHourPay(i, "Employ"+i,
							Math.round((minRandHour+(maxRandHour-minRandHour)*rand.nextDouble())*10)/10.0);
					
					double salary=empHour.AvgSalary(empHour.getHourlyRate());
					
				}
			}
		
		for (Employ employ : employs) {
			System.out.println(employ);
		}
		
	}

}
