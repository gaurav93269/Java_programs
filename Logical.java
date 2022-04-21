//Logical operaters 

import java.util.Scanner;  
class Logical
{
	public static void main(String args[]) 
	{
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();

           System.out.println(num1>num2 && num1<num1);
           System.out.println(num1>num2 || num1<num1);
           System.out.println(!(num1>num2));
           }
}


      
     

    