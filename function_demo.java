/*write the java program using function perform the following operation...
1.hello  2.add  3.square  */
package function;
import java.util.Scanner;
public class function_demo
{
	int i,num,num1,num2,res;
 Scanner sc=new Scanner(System.in);
 public static void main(String[]arge)
 {   
	 program_1 obj=new program_1();
	 //obj.hello();
	 //obj.sum();
	 obj.sqr();
	
	 
 }
 
	 public void hello()
	 {
		 System.out.println("welcome to java world");
	 }
	 public int add()
	 {   
		 System.out.println("enter the value of num1 ");
		 num1=sc.nextInt();
		 System.out.println("enter the value of  num2");
		 num2=sc.nextInt();
		 res=num1+num2;
		 System.out.println("the sum of two number is:"+res);
		 res=sc.nextInt();
		 return res;
      }
	 public void sqr()
	 {
		 System.out.println("enter the value of num");
		 num=sc.nextInt();
		 res=num*num;
		 System.out.println("squar of given number is:"+res);
		 res=sc.nextInt();
	 }
	 public void evenodd()
	 {
		 if(num%2==0)
		 {
			 System.out.println("entered number is even");
	     }
		 else
		 {
			 System.out.println("enter number is odd");
		 }
	 }
}



