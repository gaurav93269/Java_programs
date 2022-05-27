//WAP to accept no rows from the user and accordingly display the pyramid.
package practice;
import java.util.Scanner;
public class user_pyramid 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size of an element");
	   size=sc.nextInt();
	   for(i=1;i<=size;i++)
	   {
		for(j=1;j<=i;j++)   
		{
		   System.out.print("*");
	   }
		System.out.println(" ");
	   }
	}
}



