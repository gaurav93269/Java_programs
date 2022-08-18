// format() Returns a formatted string using the specified locale, format string, and arguments

package Strings;
public class formatMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name="Gaurav";  
		 
		
		String sf1=String.format("Name is %s",name);  
		System.out.println(sf1);
		
		String sf2=String.format("value is %f",32.32);  
		System.out.println(sf2); 
		
		//returns 12 char fractional part filling with 0  
		String sf3=String.format("value is %32.12f",32.33434); 
		System.out.println(sf3);  

	}

}
