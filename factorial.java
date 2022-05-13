//Write a program to accept the number from user and find out the factorial.
package practice;
import java.util.Scanner;
public class factorial
{

	public static void main(String[]args) 
	{
	       int i,num=0,fact=1;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number");
	       num=sc.nextInt();
	       for(i=1;i<=num;i++)
	       {
	    	 fact=fact*i;   
	       }
	         System.out.println("factorial of given number is:"+fact);
	       
	  }
	}






	