import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,result;
		System.out.println("Enter the table to be printted");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();//5
		i=10;
		do
		{
			result=i*n;
			System.out.println(i + " * "+ n +" = " +result);
			i--;

		}while(i>=1);
	}

}
