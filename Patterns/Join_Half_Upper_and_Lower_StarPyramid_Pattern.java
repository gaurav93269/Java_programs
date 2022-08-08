/* Write the program println the following pattern

Join_Half_Upper_and_Lower_StarPyramid_Pattern
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 


*/

import java.util.Scanner;

public class Join_Half_Upper_and_Lower_StarPyramid_Pattern
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
                    for(i=1;i<=num;i++)
	      {
	          for(j=num-1;j>=i;j--)
	         {
		System.out.print("* ");
		}
		System.out.println();
	}

         }
}
