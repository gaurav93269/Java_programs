/*getBytes() Encodes this String into a sequence of bytes using the named charset,
storing the result into a new byte array*/

package Strings;

public class getBytesMethod 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   String name = "GAURAV";  
	        byte[] b = name.getBytes(); 
	        
	        for(int i=0;i<b.length;i++)
	        {  
	            System.out.println(b[i]);  
	        }  
	        // Getting string back   
	        String s2 = new String(b);  
	        System.out.println(s2);  
	    }  

	}


