package leapyear;

import java.util.Scanner;

public class LeapYear {
	private static void checkLeap(int year) {
		if(year%100!=0 && year%4==0 || year%400==0 ) 
		{
			System.out.println(year+"  is Leap Year");
		}
		else 
		{
			System.out.println(year+"  is not Leap Year");
		}
	}
	
 public static void main(String[] args) {
	 System.out.println("Enter Year   \n");
	 Scanner sc=new Scanner(System.in);
	 int year=sc.nextInt();
	 checkLeap(year);
	}

}
	

