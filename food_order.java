package java_program;

import java.util.Scanner;

public class food_order
{
     public static void main(String[]args) 
     {
    	 int choice;
    	 char ans;
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println(" welcome to gaurav food corner");
    	 do
    	 {  
    		 System.out.println("1:samosa");
    		 System.out.println("2:vadapaw ");
    		 System.out.println("3:idli");
    		 System.out.println("4:chai");
    		 System.out.println("5:chole bhturee ");
    		 choice=sc.nextInt();
    		 System.out.println("do you want add somthing new");
    		 ans=sc.next().charAt(0);
    	 }
    	 while(ans=='y'||ans=='Y');
    	 System.out.println("thankyu for commig gaurav food corner ");
    		   		 
    	 }
     }

