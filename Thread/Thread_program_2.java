
public class program_2 extends Thread
{
 public void run()
	{
      for(int i=1;i<=10;i++)
      {
    	int num=i;
    	  System.out.println(+i);
    	  try
    	  {
    		Thread.sleep(1000);
    	  }
    	  catch( Exception program_2)
    	  {
    	    // program_2.printStackTrace();
    	  }
      }
	}
    public static void main(String[]args)
    {
    	program_2 obj=new program_2();
    	obj.start();
    	program_2 obj1=new program_2();
    	obj1.start();
    }
}




