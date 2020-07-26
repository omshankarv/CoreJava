package inheritance;

public class CarLoan extends LoanProcess{
	private String model;
	
	//constructor
	CarLoan(String nme, double amount, int tm, String mdl){
		customername=nme;
		loanamount=amount;
		term=tm;
		model=mdl;
	}
	
	//overriding
	public String getCustomerName() {
		return "Customer "+ customername+" has customer ID:"+ customerid;
	}
	
	//over loading
	public double calculateEMI(double prm) {
		System.out.println("Including insurance premium in EMI");
		return prm+ ((loanamount*interest/100)+(loanamount/term));
	}
		
	

}
