package exception;

public class TryCatchException {
	public static void main(String[] args)
	{
		try {
			int[] myNumbers= {1,2,3};
			for (int i=0; i<5;i++) {
				System.out.println(myNumbers[i]);
				float ans =i/0; // what happens if you comment this line?
			
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Verify the index of the element you are try to retrieve ");
			
		}
		catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		finally {
			// This block will always run
			System.out.println("Contact customer support if you run into any issues");
		}
	}

}
