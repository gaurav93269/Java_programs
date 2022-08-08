
public class CurrentExample1  extends Thread
{
	public void run()
	{
	System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CurrentExample1 obj1= new CurrentExample1();
		CurrentExample1 obj2= new CurrentExample1();
		CurrentExample1 obj3= new CurrentExample1();
		obj1.start();
		obj2.start();
		obj3.start();

	}

}
