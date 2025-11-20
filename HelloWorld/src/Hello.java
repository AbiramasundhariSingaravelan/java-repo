import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks;
		 System.out.println("enter your marks");
		 Scanner s=new Scanner(System.in);
		 marks=s.nextInt();
		 if(marks > 90)
		 {
			 if(marks <100)
				 System.out.println("A Grade");
			 else
				 System.out.println("Invalid Score");
		 }
		 else if((marks >80) && (marks <90 ))
		 {
			 System.out.println("B Grade");
		 }
		 else if((marks >70) && (marks<80))
		 {
			 System.out.println("C Grade");
		 }
		 else
		 {
			 System.out.println("Invalid Score");
		 }
	}

}
