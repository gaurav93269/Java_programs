// write the the program to find greater between 2 no, 5 no and 5 no.by using method overloading. 

package Polymorphism;
public class Overloading 
{
    public static void main(String[] args) 
     {
        // TODO Auto-generated method stub
           Overloading obj=new Overloading();
          obj.greater_num(15,20);
          obj.greater_num(2, 8,6);
          obj.greater_num(10,2,3, 4, 5);
       }
    public void greater_num(int a,int b)
      {
	if(a>b)
	{
	System.out.println("Greater number is:" +a);
	}
	else
	{
	System.out.println("Greater number is:" +b);
	}
      }
    public void greater_num(int a,int b,int c)
    {
	if(a>b && a>c)
	{
	System.out.println("Greater number is:" +a);
	}
	else if(b>a && b>c)
	{
	System.out.println("Greater number is:" +b);
	}
	else if(c>a && c>b)
	{
	System.out.println("Greater number is:" +c);
	}
     }
  public void greater_num(int a,int b,int c,int d,int e)
     {
	if(a>b && a>c && a>d && a>e)
	{
	System.out.println("Greater number is:" +a);
	}
	else if(b>a && b>c && b>d && b>e)
	{
	System.out.println("Greater number is:" +b);
	}
	else if (c>a && c>b && c>d && c>e)
	{
	System.out.println("Greater number is:" +c);
	}
	else if (d>a && d>b && d>d && d>e)
	{
	System.out.println("Greater number is:" +d);
	}
	else 
	{
	System.out.println("Greater number is:" +e);
	}
      }


}
