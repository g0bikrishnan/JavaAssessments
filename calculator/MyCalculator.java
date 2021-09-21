package calculator;

import java.util.Scanner;

public class MyCalculator {

	public static long power(int n , int p ){
		try {
			
			if(p==0 && n==0){
				throw new InputNotBeZero("n and p should not be zero");
			}
			else if (p<0 && n<0) 
			{
				throw new NegativeInput("n or p should not be negative");
			}
			else 
			{
				return (long) Math.pow(n, p);
			}
		}
		catch (InputNotBeZero e) {
				System.out.println(e.getMessage());
		} 
		catch (NegativeInput e) {
			System.out.println(e.getMessage());
		}
		return 0;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for n");
		int n=sc.nextInt();
		System.out.println("enter value for p");
		int p=sc.nextInt();
		System.out.println(power(n, p));
	}
}
