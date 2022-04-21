//Arthmetic operaters

import java.util.Scanner;  
class Arthmetic
{
	public static void main(String args[]) 
	{
		int num1,num2,add,sub,multi,div,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();

		//Addition
		add = num1+num2;    
		System.out.println("The addition of two no.s "+num1+" and "+num2+" is "+add);

		//Subtraction
		sub = num1-num2;    
		System.out.println("The subtraction of two no.s "+num1+" and "+num2+" is "+sub);

		//Multiplication
		multi = num1*num2;    
		System.out.println("The multiplication of two no.s "+num1+" and "+num2+" is "+multi);

		//Division
		div = num1/num2;
		System.out.println("The division of two no.s "+num1+" and "+num2+" is "+div);

		//Result
		res = num1%num2;
		System.out.println("The remainder of two no.s "+num1+" and "+num2+" is "+res);
	}
} 
