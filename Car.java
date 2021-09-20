package car;

import java.util.Scanner;

public class Car extends CarUtilities {
	static Car car;
	static String name;
	static int noOfDoor=4;
	static int noOfSeats=5, stepnee=1;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		car=new Car();
		car.buildCar();
	}
	private void buildCar() {
		System.out.println("Enter the Car Name you Want ");
		name=sc.nextLine();
		System.out.println("Do you want a music system (Yes/No)");
		car.musicSystem=sc.nextLine();
		System.out.println("Do you want a Radio (Yes/No)");
		car.radio=sc.nextLine();
		System.out.println("Enter a SeatCover Color");
		car.seatCoverColor=sc.nextLine();
		System.out.println("------------------------------------------------");
		System.out.println("Car name is  "+name+"\n No of Doors "+noOfDoor+"\n no of seats "+noOfSeats+"\n has a Seat Cover"+seatCover+"\n Seat Cover Color "+seatCoverColor);
		System.out.println("Car Number is: "+car.setNumber());
		
		
	}
}
