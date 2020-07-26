package inheritance;

public class HomeLoan {
String customername;
double loanamount;
int term;
String postalcode;
	//constructor
	HomeLoan(String nme,double amount, int tm, String pc){
		customername=nme;
		loanamount=amount;
		term=tm;
		postalcode=pc;
	}
	public String getCustomername() {
		return "Customer "+customername+" looking to buy a property in area:"+postalcode;
	}
	
	//overloading
	public double calculateEMI(String scheme) {
		if(scheme=="fixed") {
			System.out.println("calculating fixed interest EMI");
			return ((loanamount*interest/100)+(loanamount/term));
		}
		else {
			System.out.println("for floating interest, EMI varies depending on the current bank interest");
			System.out.println("Please call us at 1-800-Bank-Loan");
			return 0.0;
		}
	}
}
