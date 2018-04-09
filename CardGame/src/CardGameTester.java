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
		int modeChoice = 0; 
		double outCome = 0.0;
		double bet = 0.0;
		double myMoney = 1000.0;
		Card guessCard;
		
		System.out.println("====================================");
		System.out.println(" Welcome to the card guessing game!");
		System.out.println("====================================\n");
		
		System.out.println("Here, you will try to guess different qualities \nof a random card from a standard card deck.");
		System.out.println("On to the game!\n");
		
		do
		{
			System.out.println("You now have: " + toMoney.format(myMoney));
			
			do
			{
				System.out.println("The Odds: Card Color = 2:1, Suit = 4:1, Type: 13:1, Exact Card: 52:1");
				System.out.println("Money in return: Card Color = bet * 2, Suit = bet * 3, Type = bet * 5, Exact Card = bet * 10");
				System.out.println("\nI'd like to ask you, what do you want to guess?");
				System.out.println("Guess: (0) Card Color, (1) Card Suit, (2) Card Type, (3) Exact Card ");
				
				modeChoice = in.nextInt();
				
				if (modeChoice < 0 || modeChoice > 3)
				{
					System.out.println("That's not a option...");
					System.out.println("I'll ask again...\n");
				}
				
			} while (modeChoice < 0 || modeChoice > 3);
			
			System.out.println("Now how much money is on the table? ;D : ");
			bet = in.nextDouble();
			
			myMoney -= bet;
			
			System.out.println("\nAlright, here, we, GO!!!");
			
			guessCard = null;
			guessCard = new Card();
			

			
			outCome = checkRulesForMoney(askGuessForMode(modeChoice), guessCard, bet);
			myMoney += outCome;
			
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
			System.out.println(" You can walk out with: " + toMoney.format(myMoney) + "!");
			System.out.println("=================================");
		} else {
			System.out.println("Yeah...you've gone bankrupt... :/ Oops...");
			System.out.println("Bye now!");
		}
		
		in.close();
	}
	
	private static double checkRulesForMoney(String theGuess, Card theCard, double theBet)
	{
		double outMoney = 0.0;
		
		
		return outMoney;
	}
	
	private static String askGuessForMode(int mode)
	{
		String guess = "";
		boolean guessValid = false;
		
		switch (mode)
		{
			case 0:
			{
				do
				{
					System.out.println("Guess the card's color! (Red or Black): ");
					guess = in.next();
					
					if (guess.equalsIgnoreCase("Red") || guess.equalsIgnoreCase("Black"))
					{
						guessValid = true;
					}
					else
					{
						System.out.println("That's not an option! I'll ask again...");
						guessValid = false;
					}
					
				} while (guessValid == false);
				break;
			}
			case 1:
			{
				do
				{
					System.out.println("Guess the card's suit!");
					System.out.println("(Hearts, Clubs, Diamonds, or Spades)? : ");
					guess = in.next();
					
					if (guess.equalsIgnoreCase("Hearts") || guess.equalsIgnoreCase("Clubs") || 
						guess.equalsIgnoreCase("Diamonds") || guess.equalsIgnoreCase("Spades"))
					{
						guessValid = true;
					}
					else
					{
						System.out.println("That's not an option! I'll ask again...");
						guessValid = false;
					}
					
				} while (guessValid == false);
				break;			
			}
			case 2:
			{
				do
				{
					System.out.println("Guess the card's type!");
					System.out.println("(TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, or ACE)? : ");
					guess = in.next();
					
					if (guess.equalsIgnoreCase("TWO") || guess.equalsIgnoreCase("THREE") || 
						guess.equalsIgnoreCase("FOUR") || guess.equalsIgnoreCase("FIVE") ||
						guess.equalsIgnoreCase("SIX") || guess.equalsIgnoreCase("SEVEN") || 
						guess.equalsIgnoreCase("EIGHT") || guess.equalsIgnoreCase("NINE") ||
						guess.equalsIgnoreCase("TEN") || guess.equalsIgnoreCase("JACK") || 
						guess.equalsIgnoreCase("QUEEN") || guess.equalsIgnoreCase("KING") ||
						guess.equalsIgnoreCase("ACE"))
					{
						guessValid = true;
					}
					else
					{
						System.out.println("That's not an option! I'll ask again...");
						guessValid = false;
					}
				} while (guessValid == false);
				break;
			}
			case 3:
			{
				do
				{
					String color = "";
					String type = "";
					String suit = "";
					
					System.out.println("Guess the entire card!");
					System.out.println("For example: (Black Six of hearts): ");
					guess = in.next();
					
					//Let's take apart a string!
					guess.toLowerCase();
					guess.
					
				} while (guessValid == false);
				break;
			}
			default:
			{
				System.out.println("Do while loop, have you failed me?!?");
				break;
			}
		}
		
		return guess;
	}
}
