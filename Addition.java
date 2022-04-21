import java.util.Scanner;
public class Addition
{
 public static void main(String[]agrs)
  {
     int num1,num2,sum;
   Scanner s=new Scanner(System.in);
   System.out.println("enter the value of num1");
    num1=s.nextInt(); 
  
   System.out.println("enter the value of num2");
    num2=s.nextInt();

   sum=num1+num2;
  System.out.println("sum of the value of num1 and num2 is:" +sum);
    }
}
   