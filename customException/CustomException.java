package customException;

import java.util.Scanner;

public class CustomException {
	public static void schemeIdentifier(long x)
	{
		try {
		
		int len=String.valueOf(x).length();
		System.out.println(len);
		if(len==16){
			String z=String.valueOf(x).substring(0,1);
			switch(z) 
			{
			case "5":
				System.out.println("you have Master card ");
				break;
			case  "4":
				System.out.println("you have a Visa Card ");
				break;
			default:
				System.out.println("Scheme is not found ");
			}
		}
		else 
		{
			throw new CardNumberMissMatch("Card Numbers is must be 16 Digits");
		}
	}
		catch (CardNumberMissMatch e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Card Number ");
		long cardNum=sc.nextLong();
		schemeIdentifier(cardNum);
		
	}
}
