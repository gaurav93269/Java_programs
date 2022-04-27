 //write a java program to choice any number and perform the following instruction
import java.util.Scanner;
public class your_choice
{
  public static void main(String args[])
  {
	  int ch;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your choice");
	  ch=sc.nextInt();
	  switch (ch)
	  {
case 1://TO perform the greater number between three number.
	 int num1,num2,num3;
         System.out.println("enter the value of num1");
         num1=sc.nextInt();
         System.out.println("enter the value of num2");
         num2=sc.nextInt();
         System.out.println("enter the value of num3");
         num3=sc.nextInt();
         if((num1>num2)&&(num1>num3))
         {
         System.out.println("greater number is num1:"+num1);
         }
         else if((num2>num1)&&(num2>num3))
         {
         System.out.println("greater number is num2:"+num2);            
         }
         else
         {
         System.out.println("greater number is num3:"+num3);
         }
         
         break;
case 2://TO perform the Area of reactangle
	       int length,width,area;
	       System.out.println("enter length of rectangle");
               length=sc.nextInt();	      
	       System.out.println("enter width of rectangle");
               width=sc.nextInt();
	       area=length*width;
	       System.out.println("Area of rectangle is:"+area);
	       break;
case 3:// To perform the number which is divisible by 7 and its cube. 
		   int num,cube;
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
           break;
 case 4:// TO perfom the age and gender and display RI(above 60 m:7, f:7.5)(below 60 m,f=5%).
		  
           int age;
           char gender;
           System.out.println("Enter the age");
           age=sc.nextInt();
           System.out.println("Enter the gender");
           gender=sc.next().charAt(0);
           if((age>=60)&&(gender=='m'))
           {
        	   System.out.println("RI is 7%");
           }
         else if ((age>=60)&&(gender=='f'))
           {
        	   System.out.println("RI IS 7.5%");
           }
           else 
           {
        	   System.out.println("RI is 5%");
            }
           break;
  default://if user put above (1,2,3,4,)...
	       System.out.println("invalid choice......please enter valid number");
            break;
	 }
  }
}




	  
           
            
            
            
            
            
            
		  
	       
