//simple try catch
package Exception_Handling;

public class Try1 {
	public static void main(String[]args)
	{
		try {
			int data=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occures");
			
		}
		
	}

}