/*WAP to create a class which will accept all the data and store all the variable ,
in one class do the add, second class SUB , third class MUL, forth classs DIV , fifth class MOD */

package heirarchical;
import java.util.Scanner;
public class Parents_class 
{ 
	public static void Add()
	{
		int num1,num2,add;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();

		//Addition
		add = num1+num2;    
		System.out.println("The addition of two no.s "+num1+" and "+num2+" is "+add);

	}
	public static void Sub() 
	{
		// TODO Auto-generated method stub
	   int num1,num2,sub;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		sub = num1-num2;    
		System.out.println("The subtraction of two no.s "+num1+" and "+num2+" is "+sub);
		}
	public static void Multi()
	{
		// TODO Auto-generated method stub
		int num1,num2,multi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		multi = num1*num2;    
		System.out.println("The multiplication of two no.s "+num1+" and "+num2+" is "+multi);
	}
	public static void Div()
	{
		// TODO Auto-generated method stub
		int num1,num2,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		div = num1/num2;
		System.out.println("The division of two no.s "+num1+" and "+num2+" is "+div);
    }
	public static void Mod()
	{
		// TODO Auto-generated method stub
	  int num1,num2,mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		mod=num1%num2;
		}
}

--------------------------------------------------------------------------------------------------------------------------------------
//To call the function of Addition

package heirarchial;
import java.util.Scanner;

public class Class_1 extends Parents_class
{
   public static void main(String[]args)
   {
    Add();
   }
}

----------------------------------------------------------------------------------------------------------------------------------------
//To call the function of Subtraction

package heirarchial;
import java.util.Scanner;

public class Class_2 extends Parents_class
{
   public static void main(String[]args)
    {
	Sub();
     }   
}

-----------------------------------------------------------------------------------------------------------------------------------------
//To call the function of Multiplication

package heirarchial;
import java.util.Scanner;

public class Class_3 extends Parents_class 
{
  public static void main(String[]args)
  {
    Multi();
   }
}

------------------------------------------------------------------------------------------------------------------------------------------
////To call the function of Division

package heirarchial;
import java.util.Scanner;

public class Class_4 extends Parents_class
{
  public static void main(String[]args) 
  {
    Div();
  }
}

---------------------------------------------------------------------------------------------------------------------------------------
//To call the function of MOD

package heirarchial;
import java.util.Scanner;

public class Class_5 extends Parents_class
{
 public static void main(String[]args)
  {
   Mod();
   }
}






