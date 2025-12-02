

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
}
class MyThread2 implements Runnable
{
	public void run()
	{
		System.out.println("Running Thread2");
	}
}
public class ThredDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread mt=new MyThread();// when thread class object is created -> new 
		mt.start();//Running state
	}

}
