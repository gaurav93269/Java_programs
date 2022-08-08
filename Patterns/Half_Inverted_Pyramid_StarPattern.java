/*  Write the program to print the following patten

Half_Inverted_Pyramid_StarPattern
 * * * * *
 * * * *
 * * *
 * *
 *

*/

import java.util.Scanner;

public class Half_Inverted_Pyramid_StarPattern 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  an integer ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
		    for(j=num;j>=i;j--)
		     {
		       System.out.print(" *");
		      }
		System.out.println();
		}
                 }
}
