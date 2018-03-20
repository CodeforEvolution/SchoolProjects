
public class Car {
	private String carType = "";
	private int milesPerGallon = 0;
	private double gasTankSize = 0.0;
	private int infoIndex = 0;

	public Car(String typeOCar, int MPG, double tankSizeGallons, int index)
	{
		carType = typeOCar;
		milesPerGallon = MPG;
		gasTankSize = tankSizeGallons;
		infoIndex = index;
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
	
	int getInfoIndex()
	{
		return infoIndex;
	}
	
	double calcFullTanks(double tripInMiles)
	{
		double filledTanks = tripInMiles / (getSize() * getMPG());
		return Math.ceil(filledTanks);
	}

	double calcTripCost(double filledTanks, double priceOGas)
	{
		return Math.ceil(filledTanks * getSize() * priceOGas);
	}
}
