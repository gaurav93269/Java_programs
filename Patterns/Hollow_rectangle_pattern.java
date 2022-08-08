/*write the program to print hollow rectangle.
   *****
   *   *
   *   *
   *****  */

package practice;
import java.util.Scanner;
public class Hollow_rectangle_pattern 
{
 public static void main(String[]args)
 {   
	 int i,j,n;
	Scanner sc=new Scanner(System.in);
	
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=5;j++)
		{ 
			if(i==1||j==1 || i==4||j==5)
			{
			System.out.print("*");
		   }
			else
			{
				System.out.print(" ");
			}
          }
		System.out.println();
		}
	}

}
