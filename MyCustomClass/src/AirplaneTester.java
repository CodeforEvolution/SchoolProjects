import java.util.Random;
import java.util.Scanner;


public class AirplaneTester {
	private static Scanner in = new Scanner(System.in);
	private static Random r = new Random();
	private static Airplane myAirplane;
	private static Airplane thatAirplane;
	
	public static void main(String[] args)
	{	
		System.out.println("Welcome to the Airplane Simulator!");
		System.out.println("Please name your first plane!: ");
		myAirplane = new Airplane(in.next());
		System.out.println("What a great name!");
		
		System.out.println();
		System.out.println("Your Enemy: Big Chin Airlines!");
		thatAirplane = new Airplane("Big Chin Airlines", (r.nextInt(20) + 5), (r.nextInt(300) + 50), r.nextBoolean());
		
		while ((myAirplane.yardsTraveled() < 1000) && (thatAirplane.yardsTraveled() < 1000))
		{
			System.out.println(choiceToString(youTakeAction(), myAirplane));
			System.out.println(choiceToString(enemyTakesAction(), thatAirplane));
		}
		
		System.out.println("Congragulations too......");
		
		String winnerName = "";
		if (myAirplane.yardsTraveled() > thatAirplane.yardsTraveled())
		{
			winnerName = myAirplane.planeName();
		} else if (myAirplane.yardsTraveled() < thatAirplane.yardsTraveled()) {
			winnerName = thatAirplane.planeName();
		} else {
			winnerName = "Well, it was a tie!!!!! OH MY GOD MY MIND IS BLOWN!";
		}
		
		System.out.println(winnerName.toUpperCase() + "!");
		System.out.println();
		System.out.println("Thank you for playing!");
	}
	
	static int youTakeAction()
	{
		int choice = 0;
		boolean ok = false;
		
		System.out.println("What would you like todo?: ");
		
		do
		{
			System.out.println("0) Fly, 1) Refill Gas, 2) Play Bonus Game for Money: ");
			choice = in.nextInt();
			if (choice < 0 || choice > 2)
			{
				ok = false;
				System.out.println("That not a proper option!");
				System.out.println("I'll ask again...");
			} else {
				ok = true;
			}
		} while (ok == false);
		
		doAction(choice, myAirplane);
		return choice;
	}
	
	static int enemyTakesAction()
	{
		int choice = 0;
		
		if (thatAirplane.isDestroyed())
		{
			choice = 3;
		} else {
			choice = r.nextInt(3);
		}
		
		doAction(choice, thatAirplane);
		return choice;
	}
	
	static void doAction(int theChoice, Airplane thePlane)
	{
		switch (theChoice)
		{
			case 0:
				thePlane.flyYards(50);
			case 1:
				thePlane.refill(r.nextInt(201));
			case 2:
				thePlane.playForMoney(thePlane.isAI());
			case 3:
				thePlane.repair(thePlane.isAI());
			default:
				System.out.println("Just, error man.");
		}
	}
	
	static String choiceToString(int theChoice, Airplane theAirplane)
	{
		switch (theChoice)
		{
			case 0:
				return (theAirplane.planeName() + " will fly!");
			case 1:
				return (theAirplane.planeName() + " will refill gas!");
			case 2:
				return (theAirplane.planeName() + " will play a bonus game!");
			case 3:
				return (theAirplane.planeName() + " will be repaired!");
			default:
				return "An error, how?!?!?!?";
		}
	}
}
