package inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select shape for which area has to calculate \n 1. Triangle \n 2.Circle \n");
		int inp=scanner.nextInt();
		if(inp==1) 
		{
			Triangle t=new Triangle();
			System.out.println("enter value of length ");
			float l=scanner.nextFloat();
			System.out.println("enter value of height ");
			float h=scanner.nextFloat();
			System.out.println("Area of Triangle is "+t.area(l, h));
		}if(inp==2) 
		{
			Circle c=new Circle();
			System.out.println("enter value of radius ");
			Float r=scanner.nextFloat();
			System.out.println("area of circle is "+c.area(r));
			
		}
	}

}
