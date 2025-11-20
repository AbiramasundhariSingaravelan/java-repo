
class Variable<T>{
	
	T a;
	Variable(T a)
	{
		this.a=a;
	}
	public T getA()
	{
		return this.a;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable<Integer> v=new Variable<Integer>(15);
		Variable<Float> v1=new Variable<Float>(15.5f);
		Variable<Double> v2=new Variable<Double>(15.345543);
		Variable<String> v3=new Variable<String>("Welcome");
		System.out.println("Integer Value: "+v.getA());
		System.out.println("Float Value: "+v1.getA());
		System.out.println("Double Value: "+v2.getA());
		System.out.println("String Value: "+v3.getA());
		
	}

}
