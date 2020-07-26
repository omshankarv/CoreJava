package exception;

import java.util.Scanner;

public class ThrowThrowsExample {
	public void checkValidity(float age) throws ArithmeticException{
		if(age<21) {
			throw new ArithmeticException("you are not eligible to sign up");
			//throw an AE when a certain condition is not met. Notice the custom message 
		}
		else {
			System.out.println("Congrats! Your account was created Successfully!");
		}
	}
	public static void main(String args[]) {
		ThrowThrowsExample t1=new ThrowThrowsExample();
		char response ='y';
		Scanner s1=new Scanner (System.in);
		do {
			System.out.println("Enter your age:");
			String strange=s1.nextLine();
			float age=Float.parseFloat(strange);
			try {
				t1.checkValidity(age);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Do you want to continue? (y/n):");
				response=s1.nextLine().charAt(0);
			}//Notice the use of the finally block
		}
		while(response=='y');
		s1.close();
		System.out.println("Bye for now!");
	}

}
