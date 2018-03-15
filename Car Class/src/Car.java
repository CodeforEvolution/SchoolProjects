
public class Car {
	private String carType = "";
	private int milesPerGallon = 0;
	private double gasTankSize = 0.0;
	
	public Car(String typeOCar, int MPG, double tankSizeGallons)
	{
		carType = typeOCar;
		milesPerGallon = MPG;
		gasTankSize = tankSizeGallons;
	}
	
	String getType()
	{
		return carType;
	}
	
	int getMPG()
	{
		return milesPerGallon;
	}
	
	double getSize()
	{
		return gasTankSize;
	}
	
	double fullTanks(double tripInMiles, double priceOGas)
	{
		
		return (getSize() * getMPG()) / tripInMiles;
	}
}
