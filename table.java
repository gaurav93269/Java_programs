//Write the program using array to accept the 10 number from user.
import java.util.Scanner;
public class table 
{

	public static void main(String[] args) 
	{
	   
	 int i,num;
	    int[]arr= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter 10 Numbers");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Numbers are:");
		for(i=0;i<10;i++)
		{
			System.out.println("Numbers:"+arr[i]);
		}
		
	}
}



