package java_program;

import java.util.Scanner;

public class order_management
{
	public static void main(String[]args)
	{
		int choice,price=0,starter,main_course,dessert,bill;
		char ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to yadav hotel...");
		do 
		{
		  System.out.println("please select menu what you want\n "
		  		+ "1:Starter\n"
		  		+ "2:main course\n"
		  		+ " 3:dessert\n");
		   choice=sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   System.out.println("you selected starter "
			   		+ "please select\n"
		    	   		+ "1:for Panipuri=50rs\n"
		    	   		+ "2:for Paneer tikka=100rs\n"
		    	   		+ "3:for Momos=80rs\n"
		    	   		+ "4:for Samosa=60rs");   
			      starter=sc.nextInt();
			      if(starter==1)
		    	   {  
		    		   System.out.println(" your Panipuri served  a few minutes");
		    		   price=price+50;
		    	   }
		    	   else if(starter==2)
		    	   {
		    		 System.out.println(" your Paneer tikka served a few minutes");	    	   }
		    	   else if(starter==3)
		    	   {
		    		   System.out.println(" your Momos served a few minutes ");
		    	   }
		    	   else if(starter==4)
		    	   {
		    		   System.out.println(" your Samosa served a few minutes");
		    	   }
			     else {    
		    	   System.out.println("Do you want to add another Item Yes/No");
		    	   ans=sc.next().charAt(0);
		    	   }
			   
			   
		       break;
		  case 2:  System.out.println("you selected Main_course "
			   		+ "please select\n"
	    	   		+ "1:for Mushroom biryani=350rs\n"
	    	   		+ "2:for Daltakda=300rs\n"
	    	   		+ "3:for paneer masala=400rs\n"
	    	   		+ "4:for  jeera rice=250rs");   
		  main_course=sc.nextInt();
	      if(main_course==1)
    	   {  
    		   System.out.println(" your Mushroom biryani served in a few minutes");
    		   price=price+50;
    	   }
    	   else if(main_course==2)
    	   {
    		 System.out.println(" your Daltadka served in a few minutes");	    	   }
    	   else if(main_course==3)
    	   {
    		   System.out.println(" your paneer masala served in a few minutes ");
    	   }
    	   else if(main_course==4)
    	   {
    		   System.out.println(" your jeera rice served in a few minutes");
    	   }
	     else {    
    	   System.out.println("Do you want to add another Item Yes/No");
    	   ans=sc.next().charAt(0);
    	   }
		      break;
		  case 3:
			  System.out.println("you selected dessert "
				   		+ "please select\n"
			    	   		+ "1:for chocolate cake=500rs\n"
			    	   		+ "2:for Ice cream=200rs\n"
			    	   		+ "3:for gulabjamun=160rs\n");
			  dessert=sc.nextInt();
				 if(dessert==1)
	    	   {  
	    		   System.out.println(" your chocolate cake served  a few minutes");
	    		   price=price+50;
	    	   }
	    	   else if(dessert==2)
	    	   {
	    		 System.out.println(" your Ice cream served a few minutes");	    	   }
	    	   else if(dessert==3)
	    	   {
	    		   System.out.println(" your gulabjamun a few minutes ");
	    	   }
		     else {    
	    	   System.out.println("Do you want to add another Item Yes/No");
	    	   ans=sc.next().charAt(0);
	    	   }
		   break;
		   default:
				System.out.println("Invalid Item");
				break;
		     }
		   System.out.println("Do you want to add another Item Yes/No");
			ans=sc.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		bill=price;
		System.out.println("Thankyou For coming yadav hotel:"
				+ "your Bill is:"+bill);
}
}
