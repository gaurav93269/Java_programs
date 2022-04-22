//write a program to accept the no from user is no is divisble by 7 than find out the  cube.
import java.util.Scanner;
public class conditional_statement
{
  public static void main(String agrs[])
    {
      int num,cube;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of number...");
     num=sc.nextInt();
     
     if(num%7==0) // condition is true if block is execute  
      {
         System.out.println("entered number is divisble by 7");
         cube=(num*num*num);
         System.out.println("the cube of entered number is:"+cube);
      }
       else //condition is false than else block execute
       {
        System.out.println("entered number is invalid");
       }
    
    }
 }  