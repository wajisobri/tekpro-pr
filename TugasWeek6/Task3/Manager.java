package TugasWeek6.Task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee implements Sortable {
	public Manager (String n, double s, int d, int m, int y){
		super(n, s, d, m, y);
		secretaryName = "";
	}
	
	public void raiseSalary(double byPercent){
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName(){
		return secretaryName;
	}
	
	public int compare(Sortable b) {
		Manager eb = (Manager) b;
 		if (super.getSalary()<eb.getSalary()) return -1;
 		if (super.getSalary()>eb.getSalary()) return +1;
 		return 0;
	}
	
	private String secretaryName;
}