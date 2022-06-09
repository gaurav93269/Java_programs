/* write a function to implement greater number between two number,sum of digit, even_odd,(class1)
( class2) call the function of sum of digit
 (class3) call the fuction of (class2) and greater number and even_odd */

package functions;
import java.util.*;
public class class1 
{
   public  void grt() //function1- perform greater number between two number
    {
      int num1,num2,res;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of num1");
      num1=sc.nextInt();
      System.out.println("enter the value of num2");
      num2=sc.nextInt();

       if(num1>num2)  //condition is true if block is execute and print num1
        {
         System.out.println("Greater number is num1:"+num1);
        }
      else  // if condition is false else block is execute and print num2
       {
      System.out.println("Greater number is num2:"+num2);
        }
    }
      public void sum()//function2- perform sum of two number
      {
    	  int num1,num2,sum;
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("enter the value of num1");
    	    num1=s.nextInt(); 
    	  
    	   System.out.println("enter the value of num2");
    	    num2=s.nextInt();

    	   sum=num1+num2;
    	  System.out.println("sum of the value of num1 and num2 is:" +sum);

      }
      public void even_odd() //function3- define even and odd number
      {
    	  int i,num;
    	     Scanner sc=new Scanner(System.in);
    	     System.out.println("enter the value of an integer");
    	     num=sc.nextInt();
    	     if(num%2==0)
    	     {
    	       System.out.println("enter number is even");
    	      }
    	    else
    	     {
    	        System.out.println("enter number is an odd");
    	     }
      }
}

//(class2) call the function of sum of didgit
package functions;

public class class2 
{

	public void sum()
	{
	// TODO Auto-generated method stub
	class1 obj=new class1();  //To create the object of class1 and call the function of sum.
	obj.sum();
        }
}

//(class3) call the fuction of (class2) and greater number and even_odd.

package functions;

public class class3 {

	public static void main(String[] args) 
	{
		 //TODO Auto-generated method stub
		class2 obj1= new class2();
		obj1.sum();
		class1 obj2=new class1(); //To create the object of class1 and call the function of greater number and even_odd
		obj2.grt();
	    obj2.even_odd();
         }
}



