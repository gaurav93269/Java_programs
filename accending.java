//write the program to enterd number in accending order ..

import java.util.Scanner;
	public class accending
	{
public static void main(String[] args) 
{
		// TODO Auto-generated method stub

		int size,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size.");
		size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Now enter "+size+" numbers:");
		
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\nThe NUmbers are");
		for(i=0;i<size;i++)
		{	
			System.out.print(arr[i]+"\t");
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nThe Numbers in ascending oredr is :");
		for(i=0;i<size;i++)
		{	
			System.out.print(arr[i]+"\t");
		}
	}

}

