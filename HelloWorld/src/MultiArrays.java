import java.util.Scanner;

public class MultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int a[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
	}

}
