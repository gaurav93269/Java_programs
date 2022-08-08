
package Exception_handling;

import java.util.Scanner;

public class single_try_catch_block 
{      
	public static void main(String[]args)
	{
	// TODO Auto-generated method stub
      int i,num1,num2;
      Scanner sc= new Scanner(System.in);
	  try 
	  {
	  System.out.println("enter the first number");
	  num1=sc.nextInt();
	  System.out.println("enter the secound number");
	  num2=sc.nextInt();
	  int res=num1/num2;
	  System.out.println("result is"+res);
	   }
			catch(ArithmeticException e)//this is exception type 2
			
			{
				System.out.println("somthing went to wrong"+e.getMessage());
			}
			finally
			{
				System.out.println(" This is my final result ");
			}
			
		}

	}


