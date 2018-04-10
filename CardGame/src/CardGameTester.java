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
			
			outCome = checkRulesForMoney(askGuessForMode(modeChoice), guessCard, bet, modeChoice);
			
			if (outCome > 0)
			{
				System.out.println("\nYou did it!!! You've got money!");
			}
			else if (outCome < 0)
			{
				System.out.println("\nIt seems your pockets are a bit emptier, you've lost in other words. :(");
			}
			else
			{
				System.out.println("\nIt seems you haven't gained or lost any money, talk about a win-win scenario!");
			}
			
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
	
	private static double checkRulesForMoney(String[] theGuess, Card theCard, double theBet, int theMode)
	{
		double outMoney = 0.0;
		Card ourCard;
	
		switch (theMode)
		{
			case 0:
				ourCard = Card.fromString(theGuess[0], theGuess[1], theGuess[2]);
				if (theCard.getColor() == ourCard.getColor())
				{
					outMoney = theBet * 2;
				}
				break;
			case 1:
				ourCard = Card.fromString(theGuess[0], theGuess[1], theGuess[2]);
				if (theCard.getSuit() == ourCard.getSuit())
				{
					outMoney = theBet * 3;
				}
				break;
			case 2:
				ourCard = Card.fromString(theGuess[0], theGuess[1], theGuess[2]);
				if (theCard.getType() == ourCard.getType())
				{
					outMoney = theBet * 5;
				}
				break;
			case 3:
				ourCard = Card.fromString(theGuess[0], theGuess[1], theGuess[2]);
				if (theCard == ourCard)
				{
					outMoney = theBet * 10;
				}
				break;
			default:
				System.out.println("Invalid mode given!");
				break;
		}
		
		
		
		return outMoney;
	}
	
	private static String[] askGuessForMode(int mode)
	{
		String[] guess = new String[3];
		guess[0] = "";
		guess[1] = "";
		guess[2] = "";
		
		boolean guessValid = false;
		
		switch (mode)
		{
			case 0:
			{
				do
				{
					System.out.println("Guess the card's color! (Red or Black): ");
					guess[0] = in.next();
					
					if (guess[0].equalsIgnoreCase("Red") || guess[0].equalsIgnoreCase("Black"))
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
					guess[1] = in.next();
					
					if (guess[1].equalsIgnoreCase("Hearts") || guess[1].equalsIgnoreCase("Clubs") || 
						guess[1].equalsIgnoreCase("Diamonds") || guess[1].equalsIgnoreCase("Spades"))
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
					guess[2] = in.next();
					
					if (guess[2].equalsIgnoreCase("TWO") || guess[2].equalsIgnoreCase("THREE") || 
						guess[2].equalsIgnoreCase("FOUR") || guess[2].equalsIgnoreCase("FIVE") ||
						guess[2].equalsIgnoreCase("SIX") || guess[2].equalsIgnoreCase("SEVEN") || 
						guess[2].equalsIgnoreCase("EIGHT") || guess[2].equalsIgnoreCase("NINE") ||
						guess[2].equalsIgnoreCase("TEN") || guess[2].equalsIgnoreCase("JACK") || 
						guess[2].equalsIgnoreCase("QUEEN") || guess[2].equalsIgnoreCase("KING") ||
						guess[2].equalsIgnoreCase("ACE"))
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
					System.out.println("Guess the entire card!");
					System.out.println("For example: (Black Six of hearts): ");
					String dissambly = in.next();
					
					//Let's take apart a string!
					dissambly.toLowerCase();				
					
					String[] splitStr = new String[dissambly.split(" ").length];
					splitStr = dissambly.split(" ");
					
					System.out.println(splitStr);
					
					if (splitStr.length > 4)
					{
						System.out.println("That's not a valid guess! Here we go again...");
						guessValid = false;
					}
					else if (
							 //Check Card Color
							 (splitStr[0].equalsIgnoreCase("Red") || splitStr[0].equalsIgnoreCase("Black")) &&
							 //Check Card Suit
							 (splitStr[1].equalsIgnoreCase("Hearts") || splitStr[1].equalsIgnoreCase("Clubs") ||
							  splitStr[1].equalsIgnoreCase("Diamonds") || splitStr[1].equalsIgnoreCase("Spades")) &&
							  //Check Card Type
							 (splitStr[3].equalsIgnoreCase("TWO") || splitStr[3].equalsIgnoreCase("THREE") || 
							  splitStr[3].equalsIgnoreCase("FOUR") || splitStr[3].equalsIgnoreCase("FIVE") ||
							  splitStr[3].equalsIgnoreCase("SIX") || splitStr[3].equalsIgnoreCase("SEVEN") || 
							  splitStr[3].equalsIgnoreCase("EIGHT") || splitStr[3].equalsIgnoreCase("NINE") ||
							  splitStr[3].equalsIgnoreCase("TEN") || splitStr[3].equalsIgnoreCase("JACK") || 
							  splitStr[3].equalsIgnoreCase("QUEEN") || splitStr[3].equalsIgnoreCase("KING") ||
							  splitStr[3].equalsIgnoreCase("ACE"))
							)
							
					{
						System.out.println("Alright! Now let's see...");
						
						guess[0] = splitStr[0];
						guess[1] = splitStr[1];
						guess[2] = splitStr[3];
						guessValid = true;
					}
					else
					{
						System.out.println("That's not a good answer...try again!");
						guessValid = false;
					}
					
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
