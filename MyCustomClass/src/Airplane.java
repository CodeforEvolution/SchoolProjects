
public class Airplane {
	private double planeYards = 0.0;
	private double fuelGallons = 0.0;
	private double distanceTraveled = 0.0;
	private boolean isCommercial = false;
	private boolean destroyed = false;
	private String name = "";
	
	public Airplane(String theName)
	{
		planeYards = 15;
		fuelGallons = 200;
		isCommercial = false;
		name = theName;
	}
	
	public Airplane(String theName, double lengthInYards, double fuelInGallons, boolean commercial)
	{
		planeYards = lengthInYards;
		fuelGallons = fuelInGallons;
		isCommercial = commercial;
		name = theName;
	}
	
	boolean flyYards(double yardsToFly)
	{		
		double yards = yardsToFly;
		
		do
		{
			yards =- 0.25;
			distanceTraveled =+ 0.25 * planeYards;
			if (useFuel(0.25) == false)
			{
				System.out.println("Had to stop flying, not enough fuel!");
				if (isCommercial())
				{
					System.out.println("Nice going, you killed 10,000,000,000,000,000 passengers!!!!!! AAAAAAAAAHHHHHHHHHH!!!!!");
				} else {
					System.out.println("Well, there goes another band.");
				}
				return false;
			}
		} while(fuelRemaining() > 0.5 && yards > 0.0);
		
		return true;
	}
	
	String planeName()
	{
		return name;
	}
	
	double fuelRemaining()
	{
		return fuelGallons;
	}
	
	boolean useFuel(double gallons)
	{
		if (fuelRemaining() < gallons)
		{
			return false;
		}
		
		fuelGallons =- gallons;
		return true;
	}
	
	void refill(double gallons)
	{
		fuelGallons =+ gallons;
	}
	
	double yardsTraveled()
	{
		return distanceTraveled;
	}
	
	boolean isCommercial()
	{
		return isCommercial;
	}
	
	boolean isDestroyed()
	{
		return destroyed;
	}
}
