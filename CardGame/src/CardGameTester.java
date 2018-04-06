import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CardGameTester {
	private static Scanner in = new Scanner(System.in);
	private static NumberFormat toMoney = NumberFormat.getCurrencyInstance(Locale.getDefault());
	
	public static void main(String[] args)
	{
		//Instantiate all of our variables
		char again = 'n';
		double outCome = 0.0;
		double bet = 0.0;
		double myMoney = 1000.0;
		Card guessCard;
		Card.CColor guessColor;
		Card.Suit guessSuit;
		Card.Type guessType;
		
		System.out.println("====================================");
		System.out.println(" Welcome to the card guessing game!");
		System.out.println("====================================\n");
		
		System.out.println("Here, you will try to guess different qualities \nof a random card from a standard card deck.");
		
		do
		{
			System.out.println("First I'd like to ask you, what do you want to guess?");
			
			
			System.out.println("You now have " + toMoney.format(myMoney) + "!");
			System.out.println("Would you like to play, again? (y or n):");
			again = in.next().charAt(0);
		} while (again == 'y' && myMoney > 0);
		
		
		if (myMoney > 0)
		{
			System.out.println();
			System.out.println("==================================================");
			System.out.println(" Thank you for playing the card guessing game! :D");
			System.out.println("==================================================");
		
			System.out.println("==============================");
			System.out.println(" You can walk out with: $" + myMoney + "!");
			System.out.println("=================================");
		} else {
			System.out.println("Yeah...you've gone bankrupt... :/ Oops...");
			System.out.println("Bye now!");
		}
		
		in.close();
	}
	
	private static double checkRulesForMoney()
	{
		double outMoney = 0.0;
		
		
		return outMoney;
	}
}
