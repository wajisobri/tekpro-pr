package TugasWeek7.AnotherEmployee;

public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String eSocSecNumber,double eRate, double commissionRate) {
		super(eName, eAddress, ePhone, eSocSecNumber, eRate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	public double pay() {
		double payment = super.pay() + (commissionRate * totalSales);
		
		totalSales = 0;
		
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		
		result += "\nTotal Sales: " + this.totalSales;
		
		return result;
	}
}
