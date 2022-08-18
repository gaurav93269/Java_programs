// length() Returns the length of a specified string

package Strings;
public class lengthMethod
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		demo();
		lenght();
		
	}
	public static void demo()
	{
		String name="Gaurav";
		System.out.println(name.length());//To return the length of specified string
	}
	public static void lenght()
	{
	     String str = "java";  
	        if(str.length()>0) 
	        {  
	            System.out.println("String is not empty and length is: "+str.length());  
	          }  
	        
	        else
	        {  
	            System.out.println("String is empty now");  
	        }  
	}
}

