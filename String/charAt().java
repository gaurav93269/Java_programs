//Returns the character at the specified index (position)
package Strings;

import java.util.Scanner;

public class charAtMethod
{
public static void main(String []args)
{
	name();
}
public static void name()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name ");
	char name=0;
	name=sc.next().charAt(name);
	
	System.out.println("enter your surname ");
	char surName=0;
	surName=sc.next().charAt(surName);
	
	System.out.println( "Your short name is:("+name+"."+surName+")");
	
}
}
