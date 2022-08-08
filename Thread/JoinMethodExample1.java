/*
 What is use of join () in threads of Java?
 
Join method in Java allows one thread to wait until another thread completes its execution.
 In simpler words, it means it waits for the other thread to die. 
 It has a void type and throws InterruptedException.
 */
public class JoinExample extends Thread 
{
  public void run()  
	    {    
	        for(int i=1; i<=4; i++)  
	        {    
	            try 
	            {    
	                Thread.sleep(500);    
	            }
	            catch(Exception e)
	            {
	            	System.out.println(e);
	            }    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {   
	        JoinExample thread1 = new JoinExample();    
	        JoinExample thread2 = new JoinExample();    
	        JoinExample thread3 = new JoinExample();    
	        thread1.start();   
	       try 
	        {    
	        thread1.join();    
	        }catch(Exception e)
	       {
	        	System.out.println(e);
	        }    
	        thread2.start();   
	        thread3.start();    
	    }    
	}


