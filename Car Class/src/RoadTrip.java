import java.util.Scanner;


public class RoadTrip {
	static Scanner in = new Scanner(System.in);
	static double[] tripLengths = new double[3];
	static double[] gasPrices = new double[3];
	
	public static void main(String[] args)
	{	
		Car subaru = new Car("Outback", 30, 18, 0);
		Car volvo = new Car("S70", 25, 13, 1);
		Car volkswagen = new Car("Jetta", 28, 17, 2);
		
		System.out.println("Welcome to the road trip!\n");
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println("Now, how long is Car #" + i + "'s trip? (In miles): ");
			tripLengths[i] = in.nextDouble();
			System.out.println();
			
			System.out.println("And, how many dollars should gas cost per gallon for car #" + i + "?");
			gasPrices[i] = in.nextDouble();
			System.out.println();
		}
		
		printCarInfo(subaru);
		printCarInfo(volvo);
		printCarInfo(volkswagen);
	}
	
	public static void printCarInfo(Car theCar)
	{
		double tripMiles = tripLengths[theCar.getInfoIndex()];
		double tripGallons = tripMiles / theCar.getMPG();
		double tripPrice = 0.0;
		double tanksFull = theCar.calcPriceTanks(tripMiles, gasPrices[theCar.getInfoIndex()], tripPrice);
		
		System.out.println(theCar.getType() + " :");
		System.out.println("\t Miles Per Gallon: " + theCar.getMPG());
		System.out.println("\t Trip Length: " + tripMiles  + " miles");
		System.out.println("\t Gallons Needed for Trip: " + tripGallons + "gallons");
		System.out.println("\t Full Tanks of Gas Needed for Trip: " + tanksFull + " full tanks");
		System.out.println("\t Gas Cost Per Gallon: $" + gasPrices[theCar.getInfoIndex()]);
		System.out.println("\t Trip Cost: $" + tripPrice);
		System.out.println();
	}
}
