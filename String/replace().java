/*  replace() Searches a string for a specified value, 
and returns a new string where the specified values are replaced */

package Strings;
public class replaceMethod 
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    	replace();
    	
	}
    public static void replace()
    {
    	String str = "oooooo-hhhh-oooooo";  
            String obj = str.replace("h","s"); // Replace 'h' with 's'  
            System.out.println(obj); 
            
           String name="gaurav";
           String obj1=name.replace('g', 's');
           System.out.println(obj1);
        }  
    }
    


