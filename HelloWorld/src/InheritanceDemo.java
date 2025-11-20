
class Colors
{
	String shadeName;
	String shade()
	{
		return shadeName;
	}
}

class RedColor extends Colors
{
	@Override
	String shade()
	{
		shadeName="Red";
		return shadeName;
	}
}

class ScarlettRed extends RedColor
{
	void printShade()
	{
		System.out.println("ScarlettREd");
	}
	String shade()
	{
		shadeName="scarlett";
		return shadeName;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScarlettRed sr=new ScarlettRed();
		sr.printShade();
		System.out.println(sr.shade());
	}

}
