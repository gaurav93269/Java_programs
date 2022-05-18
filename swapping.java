/*Write a function to accept two no from the user and do the process of swapping
a)With third variable
b)Without third variable */

package function;
import java.util.Scanner;
public class swapping 
{  
    int a,b,c;
    Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		swapping obj=new swapping();
		obj.with_third_variable();
	    obj.without_third_variable();
    }
	public void with_third_variable()
	{
		System.out.println("enter the value of a:");
		a=sc.nextInt();
		System.out.println("enter the value of b:");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping the value a is:"+a);
		System.out.println("after swapping the value b is:"+b);
	}
	public void without_third_variable()
	{
		System.out.println("enter the value of a:");
		a=sc.nextInt();
		System.out.println("enter the value of b:");
		b=sc.nextInt();
		a=a+b;
		b=b-a;
		a=a-b;
		System.out.println("after swapping the value a is:"+a);
		System.out.println("after swapping the value b is:"+b);
	  }
}

	


