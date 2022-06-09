/*write the program to creat the sum golbal variable student_name,student_rollnumber,subject,
 create local variable for calculating percentage and display the output.*/

package functions;
import java.util.Scanner;
public class student_info
{
    String stud_name;
     int roll_no;
     int marks[]=new int[5];
     int i,sum=0;
     Scanner sc=new Scanner(System.in);
		
       public int student()
	{
         System.out.println("enter the name of the student");
	 stud_name=sc.next();
	 System.out.println("enter the roll_no of the student");
	 roll_no=sc.nextInt();
	 System.out.println("enter the 5 sub marks of the student \n 1)c++ \n 2)java \n 3)python \n 4).net \n 5)php ");
	 for(i=0;i<5;i++)
	  {
	    marks[i]=sc.nextInt();
	   }
	  for(i=0;i<5;i++)
	   {
	     sum=sum+marks[i]; //To calculate the sum of number 
	    }
         return sum; //To store the value of sum in returns 
			
	 }
     public void calc()
      {
	int percentage;
	percentage=(sum*100)/500;  //To calculate the percentage by using stored value of sum in return
	System.out.println( "student name:"+stud_name  +"\n student roll number"+ ":"+roll_no +"\n percentage(%):"+percentage);
      }
}


// To create object and Call the function.

package functions;

public class student_result 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		student_info obj=new student_info();
		obj.student();
		obj.calc();
	}
}


