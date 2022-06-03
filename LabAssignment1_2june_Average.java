//write the program to find the average of 10 number?
package practice;
import java.util.Scanner;
public class LabAssignment1_2june_Average 
{
    public static void main(String[] args)
	{ 
                Scanner sc = new Scanner(System.in);
	       	int i, avg, sum=0;
		System.out.println("please enter 10 number:");
			
		int[] arr = new int[10];
		for(i=0; i<10; i++) 
		{
		arr[i]=sc.nextInt();
		}

		for(i=0; i<10; i++) 
		sum +=arr[i]; //  calculate sum of enterd number 
                avg=sum/10;   // calcutate average 
                System.out.println("Average of the integers is "+avg);
	 }
}




