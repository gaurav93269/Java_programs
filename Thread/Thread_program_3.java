package thread;

public class Multi_thread_demo extends Thread
{
  public void run()
  {
	  int i,sum=0;
	   for(i=1;i<=7;i++)
	   {
		sum=sum+i;
		 System.out.println(sum);
	  
	   try
	   {
		   Thread.sleep(1000);
	   }
	   catch(Exception Multi_thread_program_1)
	   {
		   Multi_thread_program_1.printStackTrace();
	   }
     }
  }
  public static void main(String []args)
	  {
    	 Multi_thread_demo obj=new Multi_thread_program_1();
    	 obj.start();
    	 Multi_thread_demo obj1=new Multi_thread_program_1();
    	 obj1.start();
	  }
   }
