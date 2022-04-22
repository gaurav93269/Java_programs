//write a program to accept the number from user and find the greatest number..

import java.util.Scanner;
public class greater_number
{
  public static void main(String agrs[])
    {
      int num1,num2,res;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of num1");
     num1=sc.nextInt();
     System.out.println("enter the value of num2");
     num2=sc.nextInt();
    
     if(num1>num2)  //condition is true if block is execute and print num1
      {
         System.out.println("Greater number is num1:"+num1);
      }
      else  // if condition is false else block is execute and print num2
      {
         System.out.println("Greater number is num2:"+num2);
       }
    }
}
    
     