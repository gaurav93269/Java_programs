If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:

public class Main implements Runnable
 {
  public static void main(String[] args) 
{
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() 
{
    System.out.println("This code is running in a thread");
  }
}