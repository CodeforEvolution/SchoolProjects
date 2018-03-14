import java.util.Random;
import java.util.Scanner;


public class Airplane {
	private double planeYards = 0.0;
	private double fuelGallons = 0.0;
	private double distanceTraveled = 0.0;
	private double money = 0.00;
	private boolean isAI = false;
	private boolean isCommercial = false;
	private boolean isDestroyed = false;
	private String name = "";
	
	private Scanner in = new Scanner(System.in);
	private Random r = new Random();
	
	public Airplane(String theName)
	{
		planeYards = 15;
		fuelGallons = 200;
		isCommercial = r.nextBoolean();
		name = theName;
	}
	
	public Airplane(String theName, double lengthInYards, double fuelInGallons, boolean commercial)
	{
		planeYards = lengthInYards;
		fuelGallons = fuelInGallons;
		isCommercial = commercial;
		name = theName;
		isAI = true;
	}
	
	void playForMoney(boolean isAI)
	{
		String difficulty = "";
		
		if (isAI)
		{
			int aiDifficulty = r.nextInt(2);
			switch (aiDifficulty)
			{
				case 0:
					System.out.println("The enemy is going for an easy game.");
					if (r.nextInt(2) == r.nextInt(2))
					{
						money += 50.00;
					}
				case 1:
					System.out.println("The enemy is going for a so-so game!");
					if (r.nextInt(5) == r.nextInt(5))
					{
						money += 100.00;
					}
				case 2:
					System.out.println("The enemy is going for an EXTREME game!");
					if (r.nextInt(10) == r.nextInt(10))
					{
						money += 200.00;
					}

			}
		} else {
			System.out.println("Guess a number to win money!");
			System.out.println("What level of difficulty? (easy, medium, hard): ");
			difficulty = in.next().toLowerCase();
			
			if (difficulty.equals("easy"))
			{
				System.out.println("Guess a number! (0-2): ");
				if (in.nextInt() == r.nextInt(3))
				{
					System.out.println("You have won $50!");
					money =+ 50.00;
				} else {
					System.out.println("BAAAAHHHHH!!!! Sorry, wrong answer!");
				}
			} else if (difficulty.equals("medium")) {
				System.out.println("Guess a number! (0-5): ");
				if (in.nextInt() == r.nextInt(6))
				{
					System.out.println("You have won $100!");
					money =+ 100.00;
				} else {
					System.out.println("BAAAAHHHHH!!!! Sorry, wrong answer!");
				}
			} else if (difficulty.equals("hard")) {
				System.out.println("Guess a number! (0-10): ");
				if (in.nextInt() == r.nextInt(11))
				{
					System.out.println("You have won $200!");
					money =+ 200.00;
				} else {
					System.out.println("BAAAAHHHHH!!!! Sorry, wrong answer!");
				}
			} else {
				System.out.println("That's not an option! Goodbye!");
			}
		}
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
				System.out.println("It seems we are going to craSH LAND!!!!!!! AAAAAAHHHH!");
				isDestroyed = true;
				return false;
			}
		} while(fuelRemaining() > 0.5 && yards > 0.0);
		
		return true;
	}
	
	private boolean useFuel(double gallons)
	{
		if (fuelRemaining() < gallons)
		{
			return false;
		}
		
		fuelGallons =- gallons;
		return true;
	}
	
	boolean repair(boolean isAI)
	{
		if (isAI == true)
		{
			if (85 > money)
			{
				money =- 85.00;
				isDestroyed = false;
				return true;
			}
			
			return false;
		} else {
			System.out.println("I can repair your broken plane with all it's broken people!");
		
			if (85 > money)
			{
				System.out.println("You, uh, need $85 to repair your plane, why not play some games?");
				return false;
			} else {
				System.out.println("That'll be $85!");
			}
		
			System.out.println("Pay this man? (y or n):");
			if (in.next().charAt(0) == 'y')
			{
				System.out.println("Thank you for your business!");
				money =- 85.00;
				isDestroyed = false;
				return true;
			} else {
				System.out.println("Well I am hurt!!! Goodbye Felisha!");
				return false;
			}
		}
	}
	
	boolean refill(double gallons)
	{
		double cost = 0.25 * gallons;
		if (cost > money)
		{
			System.out.println("You don't have the required money!: $" + cost);
			return false;
		}
		
		System.out.println("Will you pay " + cost + " dollars for " + gallons + " gallons of gas? (y or n): ");
		if (in.next().charAt(0) == 'y')
		{
			money =- cost;
			fuelGallons =+ gallons;
			System.out.println("Thank you for your business!");
			return true;
		} else {
			System.out.println("Alright, goodbye!");
			return false;
		}
	}
	
	double yardsTraveled()
	{
		return distanceTraveled;
	}
	
	boolean isAI()
	{
		return isAI;
	}
	
	boolean isCommercial()
	{
		return isCommercial;
	}
	
	boolean isDestroyed()
	{
		return isDestroyed;
	}
	
	String planeName()
	{
		return name;
	}
	
	double fuelRemaining()
	{
		return fuelGallons;
	}
}
