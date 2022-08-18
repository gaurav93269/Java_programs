//The concat() method concatenates (joins) two strings and returns it.

package Strings;
public class concatMethod  // use to (joins) two strings
{
	public static void main(String[]args)
    {
	    Concat();
     }
	public static void Concat()
	{
		String name = "Gaurav";  
        String surname = "Yadav";  
        
        // Concatenating one string   
        String obj = name.concat(surname);          
        System.out.println(obj); 
       
	}

}
