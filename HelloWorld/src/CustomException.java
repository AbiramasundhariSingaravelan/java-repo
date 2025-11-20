import java.util.Scanner;

class AgeisNegativeException extends Exception
{

	public AgeisNegativeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
public class CustomException {

	public void validate()
	{
	}
	public static void main(String[] args)throws AgeisNegativeException {
		// TODO Auto-generated method stub
		int age;
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("What's your age?");
		age=s.nextInt();
			if(age<0)
			{
				throw new AgeisNegativeException("Age cannot be  negative");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
