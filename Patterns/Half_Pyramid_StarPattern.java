/* write the program to print the following pattern

Half_Pyramid_StarPattern
* 
* * 
* * * 
* * * * 
* * * * * 

*/
import java.util.Scanner;

public class Half_Pyramid_StarPattern
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i ,j,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  the value of num");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print("* ");
		}
		System.out.println();
	}
     }
}