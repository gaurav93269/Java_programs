package practice;
import java.util.Scanner;
public class positive_sum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int size,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the  size of an element");
		 size=sc.nextInt();
		 
		 int a[]=new int[size];
		 System.out.println("please enter"+size+" of elemet");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
			sum+=a[i];
				System.out.println("sum of enterd number is:"+sum);
			}
		}
		

	


