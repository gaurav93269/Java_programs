/* write the program to draw the structure.

*****
*   *
*   *
*****
  *  
  *  
  *      */


package practice;
import java.util.Scanner;
public class structure_1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i ,j,k;
		int row=4;
		int cols=5;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=cols;j++)
			{
				if(i==1||j==1 || i==4||j==5 )
			{
		      System.out.print("*");
			}
			 else 
				{
			      System.out.print(" ");
				}
			}
			{
				System.out.println( );
			}
				if(i==4)
				{
			   System.out.println("  *  ");
			   System.out.println("  *  ");
			   System.out.println("  *  ");
			}
	       }
     }
}


	
	

  