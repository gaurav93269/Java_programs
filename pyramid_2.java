import java.util.Scanner;
public class pyramid_2
{
  public static void main(String[]args)
  {
    int i,j;
    for(i=1;i<=5;i++)
    {  
      for(j=5; j>=i; j--)
    {
      System.out.print("*");
    }
      System.out.println("\n"); 
     }
  }
}
