// Write the program to drawn half Inverted pyramid 

*****
****
***
**
*   

import java.util.Scanner;

public class half_Inverted_Pyramid 
 {

	public static void main(String[] args) 
	{
		int i,j,num;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the value of num");
	   num=sc.nextInt();
	    for(i=1;i<=num;i++)
	    {  
	      for(j=num; j>=i; j--)
	    {
	      System.out.print("*");
	    }
	      System.out.println(""); 
	     }

	}
}


