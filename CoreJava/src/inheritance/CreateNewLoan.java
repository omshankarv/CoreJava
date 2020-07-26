package inheritance;

import java.util.Scanner;

public class CreateNewLoan {
public static void main(String args[]) {
	Scanner s1=new Scanner (System.in);
	System.out.println("Enter loan type (1 for Home | 2 for Car):");
	String opt=s1.nextLine();
	if(opt.matches("1"))
		HomeLoan h1=new new HomeLoan("Jay Chand",200000,120,"345609");
		System.out.println(h1.get)
}
}
