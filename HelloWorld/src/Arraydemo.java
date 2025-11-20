import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int i=0;
		int a[]=new int[15];
		System.out.println("Enter values for array:");
		while(i<15)
		{
			a[i]=s.nextInt();
			i++;
		}
		System.out.println("Values Entered are:");
		i=0;
		while(i<5)
		{
			System.out.println("A["+ i+" ] =" +a[i]);	
			i++;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	

}
