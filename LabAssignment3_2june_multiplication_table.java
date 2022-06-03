package practice;
public class LabAssignment3_2june_multiplication_table 
{
     int i;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LabAssignment3_2june_multiplication_table obj=new LabAssignment3_2june_multiplication_table();
		obj.table24();
		obj.table29();
		obj.table50();	
		
	}
	public void table24()
	{
		System.out.println("multiplication table of 24 is");
		for(i=1;i<=10;i++)
		{
			System.out.println(24+"*"+i+"="+24*i);
		}
		System.out.println(" ");
	}
	public void table29()
	{
		System.out.println("multiplication table of 29");
		for(i=1;i<=10;i++)
		{
			System.out.println(29+"*"+i+"="+29*i);
		}
		System.out.println();
	}
	public void table50()
	{
		System.out.println("multiplication table of 50");
		for(i=1;i<=10;i++)
		{
			System.out.println(50+"*"+i+"="+50*i);
		}
		System.out.println();
	}

}
