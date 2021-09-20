package single;

public class Car extends ClassVehicle {
	

	public static void main(String[] args) {
		Car c=new Car();
		c.engine();
		c.Speed();
	}

	private void Speed() {
		System.out.println("this car reches Max 150km/h");
		
	}
}
