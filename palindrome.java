/*write the program to check the given number is palindrome or not.
//ans- Palindrome is a number that remains same when its digit get reversed*/

package practice;
import java.util.Scanner;
public class palindrome 
{
   public static void main(String[] args) 
      {
	// TODO Auto-generated method stub
	   int r,rev=0,temp,num;
           Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number to check palindrome");
           num=sc.nextInt();
           temp=num;    
	   while(num>0)
	{    
	   r=num%10;  //getting remainder  
	   rev=(rev*10)+r;    
	   num=num/10;    
	}    
	  if(temp==rev)    
	    System.out.println(" it is palindrome number ");    
	 else    
	    System.out.println("it is not palindrome");   
	}
}

