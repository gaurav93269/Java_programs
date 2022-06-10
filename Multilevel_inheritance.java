/* WAP to create a class Reverse No, second class SOD , 
Third class use both the class property and display the output */

package multilevel_inheritance;
import java.util.Scanner;
public class Class1 
{
 public static void reverse()
  {
     // TODO Auto-generated method stub
	Scanner sc=new Scanner (System.in);
	int i,num,reverse = 0;  
	System.out.println("enter the any number");
	num=sc.nextInt();
	while(num != 0)   
	{  
	int remainder = num % 10; // gives the last digit of the number  
	reverse = reverse * 10 + remainder;  
	num = num/10; //removes the last digit of the number
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
     }
	
}
 ------------------------------------------------------------------------------------------------------------------

package multilevel_inheritance;
import java.util.*;
public class Class2 extends Class1
{

	public static void sod()
	{
		// TODO Auto-generated method stub
		int num,sum=0,reminder;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer");
		num=sc.nextInt();
		while(num > 0)  
		{  
		//finds the last digit of the given number    
		reminder = num % 10;  
		sum = sum + reminder; //adds last digit to the variable sum  
       	num= num/ 10; //removes the last digit from the number
		}  
		System.out.println("Sum of Digits: "+sum); //prints the result  
	}

}

-----------------------------------------------------------------------------------------------------------------------------

package multilevel_inheritance;

public class Class3 extends Class2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		reverse();
		sod();
        }
}





