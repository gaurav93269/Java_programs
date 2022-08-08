
public class MyClass implements Runnable
{
   public void run()
   {
	   System.out.println("thread is running");
   }
   public static void main(String args[])
   {
	   MyClass m=new MyClass();
	   Thread t=new Thread(m);
	   t.start();
	   
	   
   }
}
