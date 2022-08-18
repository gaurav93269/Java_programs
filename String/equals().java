//The equals() method compares two strings, and returns true if the strings are equal,

package Strings;
public class equalsMethod
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	        String s1 = "javatpoint";    
	        String s2 = "javatpoint";    
	        String s3 = "Javatpoint";  
	        
	        System.out.println(s1.equals(s2)); // True because content is same 
	        
	        if (s1.equals(s3)) 
	        {  
	            System.out.println("both strings are equal"); 
	        }
	        else System.out.println("both strings are unequal");     
	    }  

	}


