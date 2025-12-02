
class ThreadDemo extends Thread
{
	Thread t;
	String threadName;
	ThreadDemo(String name){
		threadName=name;
		System.out.println("Thread: "+threadName );
	}
	public void run()
	{
		System.out.println("Thread: "+threadName+ " ");
		try {
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread: "+threadName+ " "+i);
				
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thred interruppted");
		}
	}
}

public class LifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo("Thread 1");
		t1.start();
		ThreadDemo  t2=new ThreadDemo("Thread 2");
		t2.start();
	}

}
