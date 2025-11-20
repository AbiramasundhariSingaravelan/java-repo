
class Numbers
{
	Numbers(int a, int b)
	{
		System.out.println(a+b);
	}
	Numbers(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	Numbers(float a, float b)
	{
		System.out.println(a+b);
	}
}
public class Functiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers n=new Numbers(100,200);
		Numbers n1=new Numbers(100,200,400);
		Numbers n2=new Numbers(100.56f,200.67f);
		
		
	}

}
