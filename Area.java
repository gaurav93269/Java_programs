import java.util.Scanner;
public class Area
{
public static void main(String args[])
{
  int base,height,area;
  Scanner sc = new Scanner(System.in);
System.out.println("enter the base of traingle");
base=sc.nextInt();

System.out.println("enter the height of traingle");
height=sc.nextInt();

area=(base*height)/2;
System.out.println("area of traingle is:" +area);
}
}

