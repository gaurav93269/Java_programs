/*WAP to create a class which contain the method Palindrom .
the second class will use the proerty of first class and display the output. */

import java.util.*;
public class Single_inheritance 
{
   public static void pali()
	{ 
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

-----------------------------------------------------------------------------------------------
public class Single_inheritance1 extends Single_inheritance
{
   public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   pali();
		
	}	
}


