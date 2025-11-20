


abstract class Systemm
{
	abstract void add();
	void print()
	{
		System.out.println("Addition");
	}
}
interface Check
{
	abstract void test();
}
{
class Demo extends Systemm implements Check

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	void test() {
		
	}
	
}
public class absdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo s=new Demo();
		s.add();
		s.print();
		s.print();
	}

}
