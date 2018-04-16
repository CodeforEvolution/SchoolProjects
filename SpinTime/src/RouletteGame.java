import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class RouletteGame {
	private static NumberFormat toMoney = NumberFormat.getCurrencyInstance(Locale.getDefault());
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean valid = false;
		char again = 'n';
		double bet = 0.0;
		double outcome = 0.0;
		double myMoney = 1000.0;
		int betMode = 0;
		
		System.out.println("===============================");
		System.out.println(" Welcome to the roulette game!");
		System.out.println("===============================\n");
		
		System.out.println("Simply, you will spin a spinner and attempt to guess where it will land!\n");
		System.out.println("Afterwards, based on what you are guessing, ");
		System.out.println("you will also roll a certain amount of dice that will affect how much money you earn.");
		
		System.out.println("\n0It's time to start!!!\n");
		
		do
		{
			do
			{
				System.out.println("First, what would you like to bet on?");
				System.out.println("(0 Even or Odd Numbers (1 Spin Color (2 The number landed on: ");
				betMode = in.nextInt();
				
				if (betMode > 2 || betMode < 0)
				{
					System.out.println("Yeah...that's not an option...");
					System.out.println("I'll give you another chance to answer though.");
					valid = false;
				}
				else
				{
					valid = true;
				}
			} while (valid == false);
			
			System.out.println();
			
			do
			{
				System.out.println("You currently have: " + toMoney.format(myMoney));
				System.out.println("How much would you like to bet? :D : ");
				bet = in.nextDouble();
				
				if (bet > myMoney)
				{
					System.out.println("You don't have that much money...");
					System.out.println("Let's repeat that...\n");
					valid = false;
				}
				else
				{
					valid = true;
				}
			} while (valid == false);
			
			myMoney -= bet;
			
			outcome = playGame(betMode, bet);
			
			if (outcome > 0)
			{
				System.out.println("\nYou did it!!! You got money!");
			}
			else if (outcome == 0)
			{
				System.out.println("\nIt seems your pockets are a bit emptier :(");
			}
			else
			{
				System.out.println("\nUh, error with detecting outcome!");
			}
			
			myMoney += outcome;
			
			System.out.println("You now have " + toMoney.format(myMoney) + "!\n");
			
			System.out.println("Would you like to play...again? (y or n): ");
			again = in.next().charAt(0);
			if (again == 'y')
			{
				System.out.println("\nThe fun continues!\n");
			}
		} while (again == 'y');
		
		System.out.println("\nThank you for Playing!!!!!\n");
		
		System.out.println("You can walk out with: " + toMoney.format(myMoney) + "!");
		
	}
	
	public static double playGame(int betMode, double moneyBet)
	{
		boolean valid = false;
		double outMoney = 0.0;
		String guess = "";
		
		Spinner spinny = new Spinner(0);
		Die dieUn = new Die();
		Die dieDeux = new Die();
		Die dieTrois = new Die();
		
		
		switch (betMode)
		{
			case 0:
				do
				{
					System.out.println("\nNow, will the number the spinner lands on be (even or odd)?: ");
					guess = in.next();
					
					if (guess.equalsIgnoreCase("even") || guess.equalsIgnoreCase("odd"))
					{
						valid = true;
					}
					else
					{
						System.out.println("That is not what I asked for...I'll ask again.\n");
						valid = false;
					}
				} while (valid == false);
					
				System.out.println("Let's spin the spinner!\n");
				spinny.spinIt();
					
				System.out.println("And............");
					
				if (spinny.getEvenOdd().toLowerCase().equals(guess.toLowerCase()))
				{
					System.out.println("It landed on: " + spinny.getEvenOdd() + "!");
					System.out.println("Congragulations!");
					
					System.out.println("We'll now roll a die to see how much money you've earned!");
					System.out.println("And you have earned...");
					dieUn.roll();
					outMoney = moneyBet * dieUn.getValue();
					System.out.println(toMoney.format(outMoney) + "!");
				}
				else
				{
					System.out.println("It, uh, landed on: " + spinny.getEvenOdd() + "...");
					System.out.println("Sorry about that...");
				}
				break;
			case 1:
				do
				{
					System.out.println("\nNow, will the spinner land on (green, red, or yellow)?: ");
					guess = in.next();
					
					if (guess.equalsIgnoreCase("green") || guess.equalsIgnoreCase("red") || guess.equalsIgnoreCase("yellow"))
					{
						valid = true;
					}
					else
					{
						System.out.println("That is not what I asked for...I'll ask again.");
						valid = false;
					}
				} while (valid == false);
					
				System.out.println("Let's spin the spinner!\n");
				spinny.spinIt();
					
				System.out.println("And............");
					
				if (spinny.getColor().toLowerCase().equals(guess.toLowerCase()))
				{
					System.out.println("It landed on: " + spinny.getColor() + "!");
					System.out.println("Congragulations!");
					
					System.out.println("We'll now roll two dice to see how much money you've earned!");
					System.out.println("And you have earned...");
					dieUn.roll();
					dieDeux.roll();
					outMoney = moneyBet * (dieUn.getValue() + dieDeux.getValue());
					System.out.println(toMoney.format(outMoney) + "!");
				}
				else
				{
					System.out.println("It, uh, landed on: " + spinny.getColor() + "...");
					System.out.println("Sorry about that...");
				}
				break;
			case 2:
				int intGuess;
				
				do
				{
					System.out.println("\nNow, will the spinner land on (1-9)?: ");
					intGuess = in.nextInt();
					
					if (intGuess > 0 && intGuess < 10)
					{
						valid = true;
					}
					else
					{
						System.out.println("That is not what I asked for...I'll ask again.\n");
						valid = false;
					}
				} while (valid == false);
					
				System.out.println("Let's spin the spinner!\n");
				spinny.spinIt();
					
				System.out.println("And............");
					
				if (spinny.getNumber() == intGuess)
				{
					System.out.println("It landed on: " + spinny.getNumber() + "!");
					System.out.println("Congragulations!");
					
					System.out.println("We'll now roll three dice to see how much money you've earned!");
					System.out.println("And you have earned...");
					dieUn.roll();
					dieDeux.roll();
					outMoney = moneyBet * (dieUn.getValue() + dieDeux.getValue() + dieTrois.getValue());
					System.out.println(toMoney.format(outMoney) + "!");
				}
				else
				{
					System.out.println("It, uh, landed on: " + spinny.getNumber() + "...");
					System.out.println("Sorry about that...");
				}
				break;
			default:
				System.out.println("Not a mode!!!");
				break;
		}
		
		return outMoney;
	}
}
