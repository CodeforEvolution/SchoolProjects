import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CrapsGame {
	static Scanner in = new Scanner(System.in);
	static NumberFormat toMoney = NumberFormat.getCurrencyInstance(Locale.getDefault());
	
	public static void main(String[] args)
	{
		Die aDie = new Die();
		Die bDie = new Die();
		double outcome = 0.0;
		char again = 'n';
		double bet = 0.0;
		double myMoney = 1000.0;
		
		System.out.println("Welcome to the Game of Craps!");
		System.out.println("This a game of action and money!!!!!");
		System.out.println("\nThe Game is Simple! Bet Money!");
		System.out.println("and hope your roll of two die equals a 7 or 11");
		
		
		do
		{
			System.out.println("\n===============================");
			System.out.println(" The game is about to start!!!");
			System.out.println("===============================\n");
			
			do
			{
				System.out.println("You currently have " + toMoney.format(myMoney) + "!");
				System.out.println("How much are you betting this round?: ");
				bet = in.nextDouble();
				
				if (bet > myMoney)
				{
					System.out.println("You cannot bet that much!!!!");
					System.out.println("I'll ask again...");
				} else {
					System.out.println("Alright!");
				}
			} while (bet > myMoney);

			myMoney -= bet;
			
			in.useDelimiter("\n");
			System.out.println("\nPress enter when ready: ");
			in.next();
			in.reset();
			
			System.out.println("===============");
			System.out.println(" Here, we, go!");
			System.out.println("===============");
			
			aDie.roll();
			bDie.roll();
			
			lookAtRoll(aDie, bDie);
			
			outcome = checkRules(aDie, bDie, bet);
			
			if (outcome > 0.0)
			{
				System.out.println("Congragulations!");
				System.out.println("You have won " + toMoney.format(outcome) + " !");
				myMoney += outcome;
			} else if (outcome < 0.0) {
				System.out.println("Ehhhhh, (crunch, crunch), sorry doc, better luck next time!");
			} else {
				System.out.println("Warning! Something weird is going on...");
			}
			
			System.out.println("You now have " + toMoney.format(myMoney) + "!");
			System.out.println("Would you like to play, again? (y or n):");
			again = in.next().charAt(0);
		} while (again == 'y' && myMoney > 0.0);
		
		if (myMoney > 0)
		{
			System.out.println();
			System.out.println("==============================");
			System.out.println(" Thank you for playing craps!");
			System.out.println("==============================");
		
			System.out.println("==============================");
			System.out.println(" You can walk out with: $" + myMoney + "!");
			System.out.println("=================================");
		} else {
			System.out.println("Sorry, but you're broke! :( Goodbye now!");
		}
		
		in.close();
	}

	private static double checkRules(Die dieOne, Die dieTwo, double betMoney)
	{
		double outMoney = 0.0;
		
		switch (dieOne.getValue() + dieTwo.getValue())
		{
			case 7:
			case 11:
				outMoney = betMoney * 2;
				break;
			case 2:
			case 3:
			case 12:
				outMoney = -1;
				break;
			default:
				System.out.println("\nIt seems we now pursue to a deeper game...");
				double point = dieOne.getValue() + dieTwo.getValue();
				outMoney = toDeeperGame(dieOne, dieTwo, point, betMoney);
				break;
		}
		
		return outMoney;
	}

	private static double toDeeperGame(Die d1, Die d2, double point, double bet)
	{
		double currentSum = 0.0;
		
		System.out.println("Keep rolling now! You must a roll a sum of: " + point + "!");
		System.out.println("Don't get a sum of 7 though...you will then lose!!!");
		
		do
		{
			in.useDelimiter("\n");
			System.out.println("\nPress enter when ready: ");
			in.next();
			in.reset();
			
			System.out.println("\nWould you like to bet more money? ;D (y or n)");
			if (in.next().charAt(0) == 'y')
			{
				System.out.println("How much?: ");
				bet += in.nextDouble();
				System.out.println("Now we're talking!");
			}
			
			System.out.println("===========================");
			System.out.println(" Another roll! Here we go!");
			System.out.println("===========================");
								
			d1.roll();
			d2.roll();
			lookAtRoll(d1, d2);
			currentSum = d1.getValue() + d2.getValue();
		} while (currentSum != point && currentSum != 7);
		
		if (currentSum == point)
		{
			return bet * 2;
		} else if (currentSum == 7) {
			return -1;
		} else {
			return 0.0;
		}
		
	}
	
	private static void lookAtRoll(Die aDie, Die bDie)
	{
		System.out.println("\nYou rolled: " + aDie + " and " + bDie);
		System.out.println("The sum is: " + (aDie.getValue() + bDie.getValue()));
	}
	
	
}
