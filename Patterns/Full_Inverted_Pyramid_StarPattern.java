/* write the program to write he following pattern

Full_Inverted_Pyramid_StarPattern 
  * * * * *
   * * * *
    * * *
     * *
      *

*/



import java.util.Scanner;

public class Full_Inverted_Pyramid_StarPattern 
{
    public static void main(String[] args)
      {
         // TODO Auto-generated method stub
	 int i,j,k;
	   Scanner sc=new Scanner(System.in);
	  System.out.println("enter the value of num");
	 int num=sc.nextInt();

	for(i=1;i<=num;i++)
                {  
                  for(j=1;j<=i;j++)
                   {
	      System.out.print(" ");
	    }
	         for(k=num;k>=i;k--)
	         {
	             System.out.print(" *");
	          }
		System.out.println();	
				
	      }

                }
     }
