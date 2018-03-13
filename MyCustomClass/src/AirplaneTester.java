import java.util.Random;
import java.util.Scanner;


public class AirplaneTester {
	private static Scanner in = new Scanner(System.in);
	private static Random r = new Random();
	
	public static void main(String[] args)
	{
		String tempStr;
		int tempInt;
		double tempDouble;
		
		System.out.println("Welcome to the Airplane Simulator!");
		System.out.println("Please name your first plane!: ");
		tempStr = in.next();
		Airplane myAirplane = new Airplane(tempStr);
		System.out.println("What a great name!");
		
		Airplane thatAirplane = new Airplane("Big Chin Airlines", (r.nextInt(20) + 5), (r.nextInt(300) + 50), r.nextBoolean());
		
	}
	
	int whatNow()
	{
		int choice = 0;
		boolean ok = false;
		
		System.out.println("What would you like todo?: ");
		System.out.println("0) Fly, 1) Refill Gas, 2) Play Bonus Game for Money");
		
		do
		{
			try {
				choice = in.nextInt();
				if (choice < 0 || choice > 2)
				{
					ok = false;
					break;
				}
				ok = true;
			} catch (Exception e) {
				System.out.println("That isn't an option! That's not even a number!");
				System.out.println("I'll ask again!");
				ok = false;
			}
		} while (ok == false);
		return choice;
	}
}
