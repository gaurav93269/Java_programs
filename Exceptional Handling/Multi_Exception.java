package Exception_handling;

import java.util.Scanner;

public class multi_try_catch_block
{
	public static void main(String []args)
	{
    int a,b,res;
    Scanner sc= new Scanner(System.in);
 try
 {
    System.out.println("enter the value of a");
    a=sc.nextInt();
    System.out.println("enter the value of b");
    b=sc.nextInt();
    res=a/b;
    System.out.println("result is"+res);
    
    try
    {
    int arr[]=new int[5];
    arr[5]=45;
    System.out.println("The value of array is="+arr[25]);
    
    try
    {
    String str;
    str=null;
    System.out.println("value of string is="+str.length());
    }
    catch(NullPointerException e)
    {
   	 System.out.println(e.getMessage());
    }
  }
    catch(ArrayIndexOutOfBoundsException e)
    {
   	 System.out.println("Array size cannot use more than location"+e.getMessage());
    }
  }
   catch(ArithmeticException e)
    {
	 System.out.println("Any number cannot divisible by zero"+e.getMessage());
    }
   finally
   {
	 System.out.println("This is my final bolck");
   }
 }
}
	
