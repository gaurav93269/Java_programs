package java_program;


/*WAP to accept the choice from from user and accordingly display the output
1:Greater Between 2 No
2:Profit and Loss
3:Area of rectangle
4:Even ODD*/
import java.util.Scanner;

public class switch_demo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice,no,num1,num2,sp,cp,res,length,width,area;
		System.out.println("Enter the choice :");
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			if(num1>num2)
			{
				System.out.println("Number1 is greater"+num1);
			}
			else
			{
				System.out.println("Number2 is greater"+num2);
			}
			break;
		case 2:
			System.out.println("Enter Selling Price");
			sp=sc.nextInt();
			System.out.println("Enter Cost Price");
			cp=sc.nextInt();	
			res=sp-cp;

			System.out.println("The result is ="+res);
			break;
		case 3:
		          System.out.println("enter length of rectangle");
		          length=sc.nextInt();
		          System.out.println("enter width of rectangle");
		          width=sc.nextInt();

		          area=length*width;
		          System.out.println("Area of rectangle is:"+area);
			break;
		case 4:
			System.out.println("enter the any value");
			no=sc.nextInt();
			 if(no%2==0)
		      {
		   	 System.out.println("given num is even");
		      }
		       else 
		      {
		  	System.out.println("given num is odd");
		      }
			break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}

}
