
interface Add
{
	void addition(int a,int b,int c);
	void demo();
}
interface Sub
{
	void subtraction(int a, int b, int c);
	void demo(String name);
	
}
class Calculate implements Sub
{
	abstract void subtraction(int a, int b, int c);

}
class Calculator implements Add,Sub
{
	public void addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void subtraction(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}
	public void demo()
	{
		System.out.println("Welcome");
	}
	public void demo(String name)
	{
		System.out.println("Welcome "+name);
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s=new Calculator();
		s.demo("arthi");
		Calculator c=new Calculator();
		c.demo();
		c.demo("arthi");
		c.addition(14, 40, 20);
		c.subtraction(15, 60,70);
	}

}
