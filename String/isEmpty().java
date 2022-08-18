//  isEmpty() Checks whether a string is empty or not

package Strings;
public class isEmptyMethod 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         empty();
	}
	public static void empty()
	{
		String name="Gaurav "; 
       System.out.println(name.isEmpty());	
       
       // speace are also counted.
       String str="   ";  
       System.out.println(str.isEmpty());
       
       String st="";
       System.out.println(st.isEmpty());
		
	}

}
