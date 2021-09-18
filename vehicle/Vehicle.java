package vehicle;

public class Vehicle {
	public int wheels;
	public  int seats; 
	public Vehicle(int wheel, int seat) {
		this.wheels=wheel;
		this.seats=seat;
	}
	@Override
	public String toString() {
		return "Number of Seats== "+this.seats+" Number of Wheels== "+this.wheels;
	}
	public static void main(String[] args) {
		Vehicle car = new Vehicle(4,5);
		Vehicle bike=new Vehicle(2,2);
		System.out.println(car);
		System.out.println(bike);
}
}
