/*WAP to create a class in which you have to accept the numbers from the
 user and in the same class create all the variables.
 In the next class Perform the opration of GRT between 3 NO.
 third  class accepting numbers from the user and find out the AVG.
 Last class Perform Fibonacci series.(Hybrid INH) */


package hybrid_inhrt;
import java.util.Scanner;
public class Accept 
{
	int size, i;
	Scanner sc = new Scanner(System.in);
	public int[] user_input() {
		
		//loop for taking size of array
		System.out.println("Enter the number of integers:");
		size=sc.nextInt();
		
		int[] integers = new int[size];
		
		//loop for taking array elements from user
		System.out.println("Enter "+size+" integers:");
		for(i=0; i<size; i++) {
			integers[i] = sc.nextInt();
		}
		return integers;
          }
 }

//Greater number between three numbar

package hybrid_inhrt;
import java.util.Scanner;
public class Greater extends Average
{

	public void grtr()
	{
		// TODO Auto-generated method stub
		int[] integers = user_input();  //integers in every classes are different
		int extra = integers[0];
		
		//loop for displaying the array elements
		System.out.println("Integers you entered are:");
		for(i=0; i<size; i++) {
			System.out.print(integers[i]+"\t");
		}
		System.out.println();
		//loop for finding greater no.
		for(i=0; i<size; i++) {
			if(extra < integers[i]) {
				extra = integers[i];
			}
		}
		System.out.println("The greater no. is "+extra);
	}
}

//Average of number

package hybrid_inhrt;
public class Average extends Accept
{
  public void avrg()
  {
	// TODO Auto-generated method stub
	  int[] integers = user_input();
		int temp = 0, avg;
		
		//summing up array elements
		for(i=0; i<size; i++) {
			temp=temp+integers[i];
		}
		
		//calculating average
		avg=temp/size;
		System.out.println("Average of the numbers are: "+avg);
	}
}

//Fibonacci 

package hybrid_inhrt;
public class Fibonacci extends Accept
{
  public void fibo()
  {
	// TODO Auto-generated method stub
	  int[] digit = user_input();
		int a=0, b=1, c;
		
		System.out.println(a);
		System.out.println(b);
		for(i=0; i<digit[0]-2; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
          }
   }

//hybrid and call the function 

package hybrid_inhrt;
public class hybrid 
{
  public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  Greater obj=new Greater();
	  obj.avrg();
	  obj.grtr();
	 Fibonacci obj2=new Fibonacci();
	 obj2.fibo();

	}
}

