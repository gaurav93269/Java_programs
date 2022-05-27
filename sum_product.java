//write the program to find the sum and product of an element?..
package practice;
import java.util.Scanner;
public class sum_product 
{
  public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,size,sum=0,product=1;
		System.out.print("enter the size of an element");
	    size=sc.nextInt();
	    
	    int a[]=new int [size];
	    System.out.println("enter the "+size+" number");
	    for(i=0;i<size;i++)
			{
			   a[i]=sc.nextInt();
			}
	           for(i=0;i<size;i++)
	           {
			    	sum=sum+a[i];
			    	product=product*a[i];
	           }
			    System.out.println("sum of given number is:"+sum); 	
			    System.out.println("product of given number is:"+product);
	           }
         }

