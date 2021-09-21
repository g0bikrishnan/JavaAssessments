package assessment2;

import java.util.Iterator;
import java.util.Scanner;

public class MyCalculator implements AdvArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum=0,i;
		for ( i = 1; i<=n ; i++) {
			if(n%i==0) 
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a nubmer ");
	int x=sc.nextInt();
	MyCalculator mc= new MyCalculator();
	System.out.println(mc.divisorSum(x));
	
}
	
}
