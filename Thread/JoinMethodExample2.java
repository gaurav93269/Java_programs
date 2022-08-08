
public class JoinExample2  extends Thread
{
	public void run()
	{
	int i;
	for(i=1;i<=5;i++)
	{
	try
	{
		Thread.sleep(1000
				);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println(i);
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JoinExample2 thread1=new JoinExample2();
		JoinExample2 thread2=new JoinExample2();
		JoinExample2 thread3=new JoinExample2();
		JoinExample2 thread4=new JoinExample2();
		thread1.start();
		try
		{
			thread2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		thread2.start();
		thread3.start();

	}

}
