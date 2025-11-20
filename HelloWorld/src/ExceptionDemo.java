import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter A Value: ");
			a=s.nextInt();
			System.out.println("Enter B Value: ");
			b=s.nextInt();
			if(b==0)
				throw new ArithmeticException("Not Possible to divide a number by Zero");
			else
				c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide a number by zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		catch(Exception e)
		{
			System.out.println("Cannot Divide By Zero");
		}
		finally {
				System.out.println(c);

		}
		System.out.println("Test user");
		
	}

}
