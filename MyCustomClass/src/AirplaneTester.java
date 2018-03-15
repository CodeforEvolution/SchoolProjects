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
		System.out.println("Fly 1,000 yards to win!");
		System.out.println();
		thatAirplane = new Airplane("Big Chin Airlines", (r.nextInt(20) + 5), (r.nextInt(300) + 50), r.nextBoolean());
		
		
		while ((myAirplane.yardsTraveled() < 1000) && (thatAirplane.yardsTraveled() < 1000))
		{
			youTakeAction();
			System.out.println();
			enemyTakesAction();
			System.out.println();
		}
		
		System.out.println("Congragulations too......");
		
		String winnerName = "";
		if (myAirplane.yardsTraveled() > thatAirplane.yardsTraveled())
		{
			winnerName = myAirplane.planeName();
		} else if (myAirplane.yardsTraveled() < thatAirplane.yardsTraveled()) {
			winnerName = thatAirplane.planeName();
		} else {
			winnerName = "Well, it was a tie!!!!! OH MY GOSH MY MIND IS BLOWN!";
		}
		
		System.out.println(winnerName.toUpperCase() + "!");
		System.out.println();
		System.out.println("Thank you for playing!");
	}
	
	static void youTakeAction()
	{
		int choice = 0;
		boolean ok = false;
		
		System.out.println("What would you like todo?: ");
		
		do
		{
			System.out.println("0) Fly, 1) Refill Gas, 2) Play Bonus Game for Money 3) Repair Airplane: ");

			choice = in.nextInt();
			if (choice < 0 || choice > 3)
			{
				ok = false;
				System.out.println("That not a proper option!");
				System.out.println("I'll ask again...");
			} else {
				ok = true;
			}
		} while (ok == false);
		
		System.out.println("\n" + choiceToString(choice, myAirplane));
		doAction(choice, myAirplane);
		
		return;
	}
	
	static void enemyTakesAction()
	{
		int choice = 0;
		
		if (thatAirplane.isDestroyed())
		{
			choice = 3;
		} else {
			choice = r.nextInt(3);
		}
		
		System.out.println("\n" + choiceToString(choice, thatAirplane));
		System.out.println();
		doAction(choice, thatAirplane);

		return;
	}
	
	static void doAction(int theChoice, Airplane thePlane)
	{
		if (thePlane.isDestroyed())
		{
			switch (theChoice)
			{
				case 3:
					thePlane.repair(thePlane.isAI());
					break;
				case 2:
					thePlane.playForMoney(thePlane.isAI());
					break;
				case 0:
				case 1:
					System.out.println("You're a terrible parent! (Of an airplane of course :)) You need to repair your plane!");
					break;
				default:
					System.out.println("Just, error man.");
			}
		} else {
			switch (theChoice)
			{
				case 0:
					thePlane.flyYards(100);
					break;
				case 1:
					thePlane.refill(r.nextInt(201), thePlane.isAI());
					break;
				case 2:
					thePlane.playForMoney(thePlane.isAI());
					break;
				case 3:
					System.out.println("But, your plane is ok! How rude of you to judge a plane like that! :D");
					break;
				default:
					System.out.println("Just, error man.");
			}
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
