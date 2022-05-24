package practice;

//write the program to find Armstrong number between 1 to 1000
public class Armstrong_num 
{
  public static void main(String[] args)
   {
	 // TODO Auto-generated method stub
	  int r,i,s=0,num1;
          for(i=1;i<=1000;i++)
	{
	     num1=i;
	     s=0;
	   while(num1>0)
	 {
	    r=num1%10;
            s=s+r*r*r;
	    num1=num1/10;
          }
	    if(i==s)
	 {
	    System.out.println(s);
	 }
    }
}
}


