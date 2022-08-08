
public class program_1 extends Thread
{
   public void run()
	{
      for(int i=1;i<=10;i++)
      {
    	  System.out.println(i);
      }
	}
    public static void main(String[]args)
    {
    	program_1 obj=new program_1();
    	obj.start();
    	program_1 obj1=new program_1();
    	obj1.start();
    }
}
