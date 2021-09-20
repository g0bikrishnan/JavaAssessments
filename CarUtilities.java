package car;

import java.util.Random;

public class CarUtilities extends CarInterior {
	
	String musicSystem, radio, bumpper,numberplate;
	Random rn=new Random();
	public String setNumber() 
	{
		return this.numberplate=rn.nextInt(9999)+"";
	}

}
