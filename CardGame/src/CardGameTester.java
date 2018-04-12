import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CardGameTester {
	private static Scanner in = new Scanner(System.in);
	private static NumberFormat toMoney = NumberFormat.getCurrencyInstance(Locale.getDefault());
	private static int difficulty = 0;
	
	public static void main(String[] args)
	{
		//Instantiate all of our variables
		boolean valid = false;
		char again = 'n';
		int modeChoice = 0; 
		double outCome = 0.0;
		double bet = 0.0;
		double myMoney = 1000.0;
		Card guessCard1;
		Card guessCard2;
		
		System.out.println("====================================");
		System.out.println(" Welcome to the card guessing game!");
		System.out.println("====================================\n");
		
		System.out.println("Here, you will try to guess different qualities \nof a random card from a standard card deck.");
		System.out.println("On to the game!\n");
		
		do
		{
			System.out.println("First of all, do you want to play an easy or hard mode?");
			System.out.println("Easy mode has two cards meaning twice the chance to win!");
			System.out.println("You can't guess a color easy mode though, not to mention you will earn less money than in hard.");
			System.out.println("Hard has one card to guess at.");
			
			System.out.println("\nSo, (0) easy or (1) hard?: ");
			difficulty = in.nextInt();
			
			if (difficulty > 1 || difficulty < 0)
			{
				System.out.println("That's not a mode...");
				System.out.println("I'll ask again...\n");
			}
		} while (difficulty > 1 || difficulty < 0);
		
		do
		{
			System.out.println("You now have: " + toMoney.format(myMoney));
			
			valid = true;
			
			do
			{
				if (difficulty == 1)
				{
					System.out.println("The Odds: Card Color = 2:1, Suit = 4:1, Type: 13:1, Exact Card: 52:1");
					System.out.println("Money in return: Card Color = bet * 2, Suit = bet * 3, Type = bet * 5, Exact Card = bet * 10");
					System.out.println("\nI'd like to ask you, what do you want to guess?");
					System.out.println("Guess: (0) Card Color, (1) Card Suit, (2) Card Type, (3) Exact Card ");
				}
				else
				{	
					System.out.println("The Odds: Suit = 4:1, Type: 13:1, Exact Card: 52:1");
					System.out.println("Money in return: Suit = bet * 2, Type = bet * 4, Exact Card = bet * 8");
					System.out.println("\nI'd like to ask you, what do you want to guess?");
					System.out.println("Guess: (0) Card Suit, (1) Card Type, (2) Exact Card ");
				}
				
				modeChoice = in.nextInt();
				
				if (difficulty == 1)
				{
					if (modeChoice < 0 || modeChoice > 3)
					{
						System.out.println("That's not a option...");
						System.out.println("I'll ask again...\n");
						valid = false;
					}
				}
				else
				{
					if (modeChoice < 0 || modeChoice > 2)
					{
						System.out.println("That's not a option...");
						System.out.println("I'll ask again...\n");
						valid = false;
					}
				}
				
			} while (valid == false);
			
			System.out.println("Now how much money is on the table? ;D : ");
			bet = in.nextDouble();
			
			myMoney -= bet;
			
			System.out.println("\nAlright, here, we, GO!!!");
			
			guessCard1 = null;
			guessCard1 = new Card();
			guessCard2 = null;
			guessCard2 = new Card();
			
			outCome = checkRulesForMoney(askGuessForMode(modeChoice), guessCard1, guessCard2, bet, modeChoice);
			
			if (outCome > 0)
			{
				System.out.println("\nYou did it!!! You've got money!");
			}
			else if (outCome == 0)
			{
				System.out.println("\nIt seems your pockets are a bit emptier, you've lost in other words. :(");
			}
			else
			{
				System.out.println("\nUh, error with detecting outcome!");
			}
			
			myMoney += outCome;
			
			System.out.println("You now have " + toMoney.format(myMoney) + "!");
			System.out.println("Would you like to play, again? (y or n):");
			again = in.next().charAt(0);
			System.out.println();
		} while (again == 'y' && myMoney > 0);
		
		
		if (myMoney > 0)
		{
			System.out.println();
			System.out.println("==================================================");
			System.out.println(" Thank you for playing the card guessing game! :D");
			System.out.println("==================================================");
		
			System.out.println("\nYou can walk out with: " + toMoney.format(myMoney) + "!");
		} else {
			System.out.println("Yeah...you've gone bankrupt... :/ Oops...");
			System.out.println("Bye now!");
		}
		
		in.close();
	}
	
	private static double checkRulesForMoney(String[] theGuess, Card card1, Card card2, double theBet, int theMode)
	{
		double outMoney = 0.0;
		Card ourCard = Card.fromString(theGuess[0], theGuess[1], theGuess[2]);
		
		if (difficulty == 1)
		{
			switch (theMode)
			{
				case 0:
					if (card1.getColor() == ourCard.getColor())
					{
						outMoney = theBet * 2;
					}
					break;
				case 1:
					if (card1.getSuit() == ourCard.getSuit())
					{
						outMoney = theBet * 3;
					}
					break;
				case 2:
					if (card1.getType() == ourCard.getType())
					{
						outMoney = theBet * 5;
					}
					break;
				case 3:
					if (card1 == ourCard)
					{
						outMoney = theBet * 10;
					}
					break;
				default:
					System.out.println("Invalid mode given!");
					break;
			}
		}
		else
		{
			switch (theMode)
			{
				case 0:
					if (card1.getSuit() == ourCard.getSuit() || card2.getSuit() == ourCard.getSuit())
					{
						outMoney = theBet * 2;
					}
					break;
				case 1:
					if (card1.getType() == ourCard.getType() || card2.getType() == ourCard.getType())
					{
						outMoney = theBet * 4;
					}
					break;
				case 2:
					if (card1 == ourCard || card2 == ourCard)
					{
						outMoney = theBet * 8;
					}
					break;
				default:
					System.out.println("Invalid mode given!");
					break;
			}
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
		
		if (difficulty == 1)
		{
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
						in.useDelimiter("\n");
						String dissambly = in.next();
						in.reset();
						
						//Let's take apart a string!
						dissambly.toLowerCase();				
						
						String[] splitStr = new String[dissambly.split(" ").length];
						
	//					System.out.println("\nArray Length: " + splitStr.length + "\n");
						
						splitStr = dissambly.split(" ");
	/*					
						System.out.println("\nArray Contents:");
						System.out.println(splitStr[0]);
						System.out.println(splitStr[1]);
						System.out.println(splitStr[2]);
						System.out.println(splitStr[3]);
	*/					
						if (splitStr.length > 4)
						{
							System.out.println("That's not a valid guess! Here we go again...");
							guessValid = false;
						}
						else if (
								 //Check Card Color
								 (splitStr[0].equalsIgnoreCase("Red") || splitStr[0].equalsIgnoreCase("Black")) &&
								  //Check Card Type
								 (splitStr[1].equalsIgnoreCase("TWO") || splitStr[1].equalsIgnoreCase("THREE") || 
								  splitStr[1].equalsIgnoreCase("FOUR") || splitStr[1].equalsIgnoreCase("FIVE") ||
								  splitStr[1].equalsIgnoreCase("SIX") || splitStr[1].equalsIgnoreCase("SEVEN") || 
								  splitStr[1].equalsIgnoreCase("EIGHT") || splitStr[1].equalsIgnoreCase("NINE") ||
								  splitStr[1].equalsIgnoreCase("TEN") || splitStr[1].equalsIgnoreCase("JACK") || 
								  splitStr[1].equalsIgnoreCase("QUEEN") || splitStr[1].equalsIgnoreCase("KING") ||
								  splitStr[1].equalsIgnoreCase("ACE")) &&
								 //Check Card Suit
								 (splitStr[3].equalsIgnoreCase("Hearts") || splitStr[3].equalsIgnoreCase("Clubs") ||
								  splitStr[3].equalsIgnoreCase("Diamonds") || splitStr[3].equalsIgnoreCase("Spades"))
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
		}
		else
		{
			switch (mode)
			{
				case 0:
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
				case 1:
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
				case 2:
				{
					do
					{					
						System.out.println("Guess the entire card!");
						System.out.println("For example: (Black Six of hearts): ");
						in.useDelimiter("\n");
						String dissambly = in.next();
						in.reset();
						
						//Let's take apart a string!
						dissambly.toLowerCase();				
						
						String[] splitStr = new String[dissambly.split(" ").length];
						
	//					System.out.println("\nArray Length: " + splitStr.length + "\n");
						
						splitStr = dissambly.split(" ");
	/*					
						System.out.println("\nArray Contents:");
						System.out.println(splitStr[0]);
						System.out.println(splitStr[1]);
						System.out.println(splitStr[2]);
						System.out.println(splitStr[3]);
	*/					
						if (splitStr.length > 4)
						{
							System.out.println("That's not a valid guess! Here we go again...");
							guessValid = false;
						}
						else if (
								 //Check Card Color
								 (splitStr[0].equalsIgnoreCase("Red") || splitStr[0].equalsIgnoreCase("Black")) &&
								  //Check Card Type
								 (splitStr[1].equalsIgnoreCase("TWO") || splitStr[1].equalsIgnoreCase("THREE") || 
								  splitStr[1].equalsIgnoreCase("FOUR") || splitStr[1].equalsIgnoreCase("FIVE") ||
								  splitStr[1].equalsIgnoreCase("SIX") || splitStr[1].equalsIgnoreCase("SEVEN") || 
								  splitStr[1].equalsIgnoreCase("EIGHT") || splitStr[1].equalsIgnoreCase("NINE") ||
								  splitStr[1].equalsIgnoreCase("TEN") || splitStr[1].equalsIgnoreCase("JACK") || 
								  splitStr[1].equalsIgnoreCase("QUEEN") || splitStr[1].equalsIgnoreCase("KING") ||
								  splitStr[1].equalsIgnoreCase("ACE")) &&
								 //Check Card Suit
								 (splitStr[3].equalsIgnoreCase("Hearts") || splitStr[3].equalsIgnoreCase("Clubs") ||
								  splitStr[3].equalsIgnoreCase("Diamonds") || splitStr[3].equalsIgnoreCase("Spades"))
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
		}
		
		return guess;
	}
}
