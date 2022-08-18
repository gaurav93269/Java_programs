// splits() Splits a string into an array of substring ,String[]
package Strings;
public class splitMethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name="gaurav";
		System.out.println(name.split("gaurav"));
		String[]demo=name.split("a");	
		
		String s1="java string split method";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words)
		{  
		System.out.println(w); 
		}

	}
}
