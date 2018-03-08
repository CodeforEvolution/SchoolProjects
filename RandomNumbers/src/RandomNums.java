
import java.awt.Color;
import java.util.Random; // library with random number methods
import java.util.Scanner;

/* Version 1 Coin Flip
public class RandomNums
{
     public static void main (String []args )
    {      
        String name; 
        System.out.print("Enter name: ");
        Scanner in = new Scanner(System.in); 
        name = in.next();  
        
        Random r = new Random();  // define a variable 'r' as a random value    
       
         // FLIP A COIN
         char coin;
         char choice;
         char again;
         
         System.out.print("Hello " + name + "!\n");
         
         do
         {
        	System.out.print("Time to Flip the Coin! (H or T) Bud?: \n");
         	choice = in.next().charAt(0);
         
         	int flip = r.nextInt(2);  //   random integer 0 or 1
         	if ( flip == 0)
         		coin = 'H';
         	else
         		coin = 'T';
         
         	if (coin == choice)
         	{
             	System.out.print("It's " + coin + "!\n");
         		System.out.print("Wow! You Guessed It! :D\n");
         	} else {
             	System.out.print("It's " + coin + "...\n");
         		System.out.print("Awww Mannnnn! This reminds me of the time I flipped off a coin.\n");
         		System.out.print("Get it? XD\n");
         	}
         
         	System.out.print("Well, be a good sport, why not go again? It's FWEEEEEEEE! (y or n): \n");
         	again = in.next().charAt(0);
         	if (again == 'y')
         	{
         		System.out.print("Yay!!!!!\n");
         	} else {
         		System.out.print("Welp, GBye " + name + "!");
         	}
         } while (again == 'y');
     }
 }
 */

/* Version 2 Coin Flip
public class RandomNums
{
     public static void main (String []args )
    {      
        String name; 
        System.out.print("Enter name: ");
        Scanner in = new Scanner(System.in); 
        name = in.next();  
        
        Random r = new Random();  // define a variable 'r' as a random value    
       
         // FLIP A COIN
         char coin;
         char choice;
         int amountInARow;
         
         System.out.print("Hello " + name + "!\n");
         System.out.print("Win by guessing correctly 5 times in a row!\n");
         
         amountInARow = 0;
         do
         {
        	System.out.print("Time to Flip the Coin! (H or T) Bud?: \n");
         	choice = in.next().charAt(0);
         
         	int flip = r.nextInt(2);  //   random integer 0 or 1
         	if ( flip == 0)
         		coin = 'H';
         	else
         		coin = 'T';
         
         	if (coin == choice)
         	{
             	System.out.print("It's " + coin + "!\n");
         		System.out.print("Wow! You Guessed It! :D\n");
         		amountInARow++;
         		System.out.print("You've won " + amountInARow + " flip(s) in A Row!\n");
         	} else {
             	System.out.print("It's " + coin + "...\n");
         		System.out.print("Awww Mannnnn! This reminds me of the time I flipped off a coin.\n");
         		System.out.print("Get it? XD\n");
         		System.out.print("You're streak has vanished like your sense of happiness.\n");
         		amountInARow = 0;
         	}
         
         	System.out.print("You need to win " + (5 - amountInARow) + " more flip(s) in a row!\n");
         } while (amountInARow <= 5);
         System.out.print("You did it, You did it, You did it, Yeah!");
     }
 }
*/

/* Dice Game
public class RandomNums
{
     public static void main (String []args )
    {      
         Scanner in = new Scanner(System.in);
    	 Random r = new Random();
    	 String name = null;
    	 String reason = null;
    	 String opinion = null;
         boolean win = false;
    	 int[] diceSet = new int[3];
         int games = 0;
         int rerollChoice = 0;
         char again = 'n';
         
         System.out.print("Please enter your name: \n");
    	 name = in.next(); 
         
         System.out.print("Hello " + name + "!\n");
         System.out.print("You will be rolling three dice\n");
         System.out.print("Win by: 3-of-a-kind, 2-of-a-kind,\nor rolling greater than 15.\n");
         
         do
         {
        	do
        	{
        		games++;
        		System.out.print("Time to Roll! Feeling Lucky?\n");
        		System.out.print("Type Anything and Press Enter When Ready!: ");
        		in.next();
        		for (int i = 0; i < 3; i++)
        		{
        			diceSet[i] = r.nextInt(7);
        		}
        		
        		System.out.print("You Rolled: \n");
        		System.out.print("\tDice 0: " + diceSet[0]);
        		System.out.print("\tDice 1: " + diceSet[1]);
        		System.out.print("\tDice 2: " + diceSet[2]);
        		System.out.print("\n");
        		System.out.print("Now, choose a dice to reroll (0, 1, or 2): \n");
        		rerollChoice = in.nextInt();
        		
        		System.out.print("Alright! Let's See...");
        		diceSet[rerollChoice] = r.nextInt(7);
        		
        		System.out.print("You Now Have: \n");
        		System.out.print("\tDice 0: " + diceSet[0]);
        		System.out.print("\tDice 1: " + diceSet[1]);
        		System.out.print("\tDice 2: " + diceSet[2]);
        		System.out.print("\n");
        		
        		reason = checkRules(diceSet);
        		opinion = checkRanking(games);
        		
        		if (reason == null)
        		{
        			System.out.print("BAAAAAA, Sorry, but, no dice!\n");
        			win = false;
        		} else {
        			System.out.print("YOU HAVE WON!!!! Why you ask: \n" + reason + "\n");
        			System.out.print("Your Ranking:\n" + opinion + "\n");
        			win = true;
        		}
        		
        	} while (win == false);

        	
        	System.out.print("Do you want to play...again? (y or n)\n");
         	again = in.next().charAt(0);
         	
         } while (again == 'y');
         System.out.println("Come again soon! (The camera faces towards me as it backs away, ending in a bittersweet goodbye)");
    }

	public static String checkRules(int[] checkDice)
	{
		int dice1 = checkDice[0];
		int dice2 = checkDice[1];
		int dice3 = checkDice[2];
		String winReason = "";
		
		if ((dice1 == dice2) || (dice2 == dice3) || (dice3 == dice1))
		{
			winReason += "\t 2 of a kind, not big surprise,\n\t though not bad either...\n";
		}
		if (dice1 == dice2 && dice2 == dice3 && dice3 == dice1)
		{
			winReason += "\t3 OF A KIND!!! OH MY GOSH!\n";
		}
		if ((dice1 + dice2 + dice3) >= 15)
		{
			winReason += "\tYou must feel greater than 15 now! ;)\n";
		}
		
		if (winReason == "")
			winReason = null;
		
		return winReason;
	}
	
	public static String checkRanking(int howMany)
	{
		String howIFeel = "";
		int fails = howMany;
		
		if (fails >= 10)
			howIFeel = ".....\n.....\n.....\nWell...\nUmmmm....\nIt seems luck is repelled by your presence.../n Sorry. :(";
		else if (fails >= 8)
			howIFeel = "Not bad...bbut, still! I believe in you! You can do better is you just try!";
		else if (fails >= 6)
			howIFeel = "Queue Mariokart Non-1st Place Win Music!\n Wait, we can't play sound yet...\n Umm, Bum Dah, Bum Dah, Bum, Bum, BAAAAAAAAAHHHHHHH!!!!";
		else if (fails >= 4)
			howIFeel = "For your decent win, we have a celebrity!\n Ronragulationtions! -Scooby Doo (:{>)";
		else if (fails >= 2)
			howIFeel = "As my last name is Secunda, I know how it feels to be second, just keep pushing!";
		else if (fails >= 1)
			howIFeel = "Ummm, Wow! You must be a natural! Which seems unnatural ironically...\n Either Way, Congrats! :D";
		
		return howIFeel;
	}
}
*/

public class RandomNums
{
     public static void main (String []args )
    {      
         Scanner in = new Scanner(System.in);
    	 Random r = new Random();
    	 Canvas myVisual = new Canvas("It's Game Time!");
    	 String name = null;
    	 String outCome = null;
    	 String opinion = null;
    	 boolean gameOver = false;
         boolean win = false;
    	 int die = 0;
    	 String spin = null;
    	 int colorIndex = 0;
         int games = 0;
         int wins = 0;
         int losses = 0;
         int pushes = 0;
         char again = 'n';
         char deal = 'n';
         double bet = 0.00;
         double betTotal = 0.00;
         double money = 19.99;
         double netMoney = 0.00;
         
         myVisual.setSize(600, 400);
         myVisual.fillBackground(Color.BLACK);
         myVisual.setInkColor(Color.GREEN);
         myVisual.setFontSize(20);
         myVisual.drawString("Look at Console Please", 175, 180);
         myVisual.setVisible(true);
         
         System.out.print("Please enter your name: \n");
    	 name = in.next(); 
         
         System.out.println("Hello " + name + "!");
         //System.out.println("Do you want to play Guess or Take Your Luck?");
         
         System.out.println("You will be rolling a die, and spinning a spinner");
         System.out.println("To win, spin green or blue and roll an even number");
         System.out.println("Just don't spin red and roll a 1!!!");
         
         do
         {
        	System.out.println("Time to show your luck, how much do you bet?");
        	System.out.println("You have currently $" + money);
        	do
        	{
            	bet = in.nextDouble();
            	if (bet > money)
            	{
            		System.out.print("You can't bet more than you have!\n");
            		System.out.print("I'll ask you again, how much do you want to bet?\n");
            	}
        	} while (bet > money);
        	
        	betTotal += bet;
        	money =- bet;
        	netMoney =- bet;
        	System.out.print("You have bet $" + bet + " this round.\n");
        	
        	do
        	{
        		games++;
        		System.out.print("Time to Start! Feeling Lucky?\n");
        		System.out.print("Type Anything and Press Enter When Ready!: ");
        		in.next();
        		
        		for (int i = 0; i < 100; i++)
        		{
               		myVisual.erase();
            		myVisual.fillBackground(Color.BLACK);
        			drawDice(r.nextInt(5), myVisual);
        			drawSpinner(r.nextInt(3), myVisual);
        			
        			if (i > 90)
        			{
        				System.out.println("are in!");
        			}
        			else if (i > 60)
        			{
        				System.out.println("the results...");
        			}
        			else if (i > 30)
        			{
        				System.out.println("And...");
        			}
        			
					myVisual.pause(20);
        		}
        		
        		myVisual.erase();
        		myVisual.fillBackground(Color.BLACK);
				myVisual.pause(2000);
        		
        		die = r.nextInt(5);
        		colorIndex = r.nextInt(3);
        		
        		myVisual.erase();
        		myVisual.fillBackground(Color.BLACK);
        		drawDice(die, myVisual);
        		drawSpinner(colorIndex, myVisual);
        		
        		switch (colorIndex)
        		{
        			case 0:
        				spin = "Red";
        				break;
        			case 1:
        				spin = "Green";
        				break;
        			case 2:
        				spin = "Yellow";
        				break;
        			case 3:
        				spin = "Blue";
        				break;
        		}
        		
        		System.out.print("You Rolled: \n");
        		System.out.println("\t" + die);
        		System.out.print("You Spun: \n");
        		System.out.println("\t" + spin);
        		
        		outCome = checkRules(die, spin);
        		opinion = checkRanking(games);
        		
        		if (outCome.startsWith("0"))
        		{
        			wins++;
        			System.out.print("YOU HAVE WON!!!! Congrats you awesome person!\n");
        			System.out.print("Your Ranking:\n" + opinion + "\n");
        			money =+ (bet * 2);
        			netMoney =+ (bet * 2);
        			bet = 0.00;
        			System.out.print("You now have $" + money + "!\n");
        			win = true;
        			gameOver = false;
        		}
        		else if (outCome.startsWith("1"))
        		{
        			losses++;
        			System.out.print("You did the nuh-uh of this game, :(\n");
        			System.out.print("At least you still have $" + money + "\n");
        			bet = 0.00;
        			netMoney =+ bet;
        			win = false;
        			gameOver = true;
        		}
        		else if (outCome.startsWith("2")) 
        		{
        			pushes++;
        			money =+ bet;
        			netMoney =+ bet;
        			System.out.print("No dice this time bud, but it's not over yet!\n");
        			win = false;
        			gameOver = false;
        		}
        		
        		if (win == true)
        		{
        			System.out.print("Deal or no deal? (y or n): \n");
        			deal = in.next().charAt(0);
        		}
        		
        	} while ((win == false) && (gameOver == false) || (deal == 'n'));

        	
        	System.out.print("Do you want to play...again? (y or n)\n");
         	again = in.next().charAt(0);
         	
         } while ((again == 'y') && (money > 0.00));
 
         if (money <= 0.00)
         {
        	 System.out.println("Game Over! You have no more money!!");
         }
         else
         {
        	 System.out.println("You have $" + money + "!\n");
         }
         
         System.out.print("You have bet a total of $" + betTotal + " throughout all your games.\n");
         if (Math.signum(netMoney) == 1.0)
         {
        	 System.out.print("You have gained $" + netMoney + "!\n");
        	 System.out.print("Mr Crabs wants to hire ye! Arg,Arg,arg!!!\n");
         }
         else if (Math.signum(netMoney) == 0.0)
         {
        	 System.out.print("Huh, it seems you haven't lost or gained any money...\n");
        	 System.out.print("Welp :|, this hasn't benefitted either of us...");
         }
         else if (Math.signum(netMoney) == -1.0)
         {
        	 System.out.print("Whatcha doing with my money boyoh! You lost $" + -netMoney + " of my Money!\n");
        	 System.out.print("(It seems as if your money was stolen from Mr Crabs)");
         }
         System.out.println("You won " + wins + " games");
         System.out.println("You lost " + losses + " games");
         System.out.println("You pushed " + pushes + " games");
         System.out.println("Come again soon! (The camera faces towards me as it backs away, ending in a bittersweet goodbye)");
    }

	public static String checkRules(int die, String spin)
	{
		int dice = die;
		String spinColor = spin;
		
		String outCome = "";
		
		if ((dice % 2 == 0) && ((spinColor == "Blue") || spinColor == "Green"))
		{
			outCome = "0";
		}
		else if ((dice == 1) && (spinColor == "Red"))
		{
			outCome = "1";
		}
		else
		{
			outCome = "2";
		}
		
		return outCome;
	}
	
	public static String checkRanking(int howMany)
	{
		String howIFeel = "";
		int fails = howMany;
		
		if (fails >= 10)
			howIFeel = ".....\n.....\n.....\nWell...\nUmmmm....\nIt seems luck is repelled by your presence.../n Sorry. :(";
		else if (fails >= 8)
			howIFeel = "Not bad...bbut, still! I believe in you! You can do better if you just try!";
		else if (fails >= 6)
			howIFeel = "Queue Mariokart Non-1st Place Win Music!\n Wait, we can't play sound yet...\n Umm, Bum Dah, Bum Dah, Bum, Bum, BAAAAAAAAAHHHHHHH!!!!";
		else if (fails >= 4)
			howIFeel = "For your decent win, we have a celebrity!\n Ronragulationtions! -Scooby Doo (:{>)";
		else if (fails >= 2)
			howIFeel = "As my last name is Secunda, I know how it feels to be second, just keep pushing!";
		else if (fails >= 1)
			howIFeel = "Ummm, Wow! You must be a natural! Which seems unnatural ironically...\nEither Way, Congrats! :D";
		
		return howIFeel;
	}
	
	public static void drawDice(int side, Canvas drawWhere)
	{
		drawWhere.setInkColor(Color.GREEN);
		drawWhere.drawFilledRectangle(25, 100, 200, 200);
		drawWhere.setInkColor(Color.BLACK);
		switch (side)
		{
			case 1:
				drawWhere.drawFilledOval(95, 145, 75, 75);
				break;
			case 2:
				drawWhere.drawFilledOval(50, 125, 60, 60);
				drawWhere.drawFilledOval(150, 220 , 60, 60);
				break;
			case 3:
				drawWhere.drawFilledOval(50, 125, 50, 50);
				drawWhere.drawFilledOval(100, 180, 50, 50);
				drawWhere.drawFilledOval(150, 225, 50, 50);
				break;
			case 4:
				drawWhere.drawFilledOval(50, 125, 50, 50);
				drawWhere.drawFilledOval(160, 125, 50, 50);
				drawWhere.drawFilledOval(50, 230, 50, 50);
				drawWhere.drawFilledOval(160, 230, 50, 50);
				break;
			case 5:
				drawWhere.drawFilledOval(50, 125, 40, 40);
				drawWhere.drawFilledOval(160, 125, 40, 40);
				drawWhere.drawFilledOval(50, 230, 40, 40);
				drawWhere.drawFilledOval(160, 230, 40, 40);
				drawWhere.drawFilledOval(105, 175, 40, 40);
				break;
			case 6:
				drawWhere.drawFilledOval(50, 125, 40, 40);
				drawWhere.drawFilledOval(160, 125, 40, 40);
				drawWhere.drawFilledOval(50, 230, 40, 40);
				drawWhere.drawFilledOval(160, 230, 40, 40);
				drawWhere.drawFilledOval(160, 175, 40, 40);
				drawWhere.drawFilledOval(50, 175, 40, 40);
				break;
		}
	}
	
	public static void drawSpinner(int pointingTo, Canvas drawWhere)
	{
		drawWhere.setInkColor(Color.RED);
		drawWhere.drawFilledRectangle(275, 25, 150, 150);
		drawWhere.setInkColor(Color.GREEN);
		drawWhere.drawFilledRectangle(425, 25, 150, 150);
		drawWhere.setInkColor(Color.BLUE);
		drawWhere.drawFilledRectangle(275, 175, 150, 150);
		drawWhere.setInkColor(Color.YELLOW);
		drawWhere.drawFilledRectangle(425, 175, 150, 150);
		drawWhere.setInkColor(Color.BLACK);
		switch (pointingTo)
		{
			case 0:
				drawWhere.drawLine(425, 175, 275, 25);
				break;
			case 1:
				drawWhere.drawLine(425, 175, 575, 25);
				break;
			case 2:
				drawWhere.drawLine(425, 175, 575, 325);
				break;
			case 3:
				drawWhere.drawLine(425, 175, 275, 325);
				break;
		}
	}
}