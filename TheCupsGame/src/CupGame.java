import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;


public class CupGame {
	final static int CUPWIDTH = 100;
	final static int CUPHEIGHT = 150;
	final static int BALLWIDTH = 40;
	final static int BALLHEIGHT = 40;
	
	public static void main(String[] args)
	{
		char again = 'n';
		int[] ballpos = new int[3];
		int[] cuppos = new int[3];
		
		boolean win = false;
		int curBallPos = 0;
		int level = 1;
		int guess = 0;
		int cupSpeed = 1;
		
		ballpos[0] = 125;
		cuppos[0] = 100;
		
		ballpos[1] = 325;
		cuppos[1] = 300;
		
		ballpos[2] = 525;
		cuppos[2] = 500;
		
		Canvas thegame = new Canvas("The Hidden Ball Guessing Game", 750, 500, Color.BLACK);
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		Font thefont = new Font(Font.DIALOG_INPUT, Font.ITALIC, 40);
		
		thegame.setFont(thefont);
		thegame.setInkColor(Color.WHITE);
		thegame.drawString("Please look at commandline", 100, 200);
		thegame.setVisible(true);
		
		System.out.println("Welcome to the guessing game!");
		System.out.println("A ball will be placed in a cup, and the cups will be shuffled around.");
		System.out.println("Your goal is to guess which cup the ball is covered by after shuffling the cups.");
		System.out.println("\nClick on the canvas to continue.");
		thegame.waitForClick();
		
		do
		{
			System.out.println("\nOk, Now, let's get to it!!!");
			
			System.out.println("Level: " + level);
			
			System.out.println("\n=======================================================================");
			System.out.println("Look back at the canvas, you will now see the ball's initial position!");
			
			thegame.erase();

			drawCup(thegame, cuppos[0], 100);
			drawCup(thegame, cuppos[1], 100);
			drawCup(thegame, cuppos[2], 100);
			
			curBallPos = r.nextInt(3);
			drawBall(thegame, ballpos[curBallPos], 300);
			
			System.out.println("\n========================================");
			System.out.println("Click on the canvas when ready to play!");
			thegame.waitForClick();
			
			eraseBall(thegame, ballpos[curBallPos], 300);
			
			System.out.println("\nShuffling cups...");
			
			cupSpeed = level * 4;
			for (int i = 0; i < 5; i++)
			{
				swapCups(thegame, cuppos[r.nextInt(3)], 100, cuppos[r.nextInt(3)], 100, cupSpeed);
			}
			
			
			do
			{
				System.out.println("\nLook at the window to see how the cups are numbered.");
				System.out.println("Alright now which cup is the ball under?: ");
				guess = in.nextInt();
			
				if (guess > 2 || guess < 0)
				{
					System.out.println("That's not a cup...did you actually look? :), I'll ask again...\n");
				}
			} while(guess > 2 || guess < 0);
			
			thegame.erase();
			drawCup(thegame, cuppos[0], 100);
			drawCup(thegame, cuppos[1], 100);
			drawCup(thegame, cuppos[2], 100);
			
			if (guess == curBallPos)
			{
				moveUpCup(thegame, cuppos[guess], 100);
				win = true;
				System.out.println("You did it!!!! Congrats!");
			}
			else
			{
				moveUpCup(thegame, cuppos[guess], 100);
				win = false;
				System.out.println("Welp, that wasn't the cup...game over!\n");
			}
			
			if (win == true)
			{
				System.out.println("If you opt to play again, the difficulty will increase! :D");
			}
			System.out.println("So, would you like to play again?: ");
			again = in.next().charAt(0);
			
			if (again == 'y' && win == true)
			{
				level++;
				System.out.println("\nLevel UP!!!");
			}
			else if (again == 'y' && win == false)
			{
				level = 1;
			}	
		} while (again == 'y');
		
		System.out.println("\nThank you for playing the hidden ball guessing game!");
		System.out.println("You finished at level: " + level + "!");
		System.out.println("Goodbye!");
		
	}
	
	public static void drawCup(Canvas thecanvas, int thex, int they)
	{
		Color prevColor = thecanvas.getInkColor();
		thecanvas.setInkColor(Color.RED);
		thecanvas.drawFilledRectangle(thex, they, CUPWIDTH, CUPHEIGHT);
		thecanvas.setInkColor(prevColor);
	}
	
	public static void eraseCup(Canvas thecanvas, int thex, int they)
	{
		Color prevColor = thecanvas.getInkColor();
		thecanvas.setInkColor(thecanvas.getBackgroundColor());
		thecanvas.drawFilledRectangle(thex, they, CUPWIDTH, CUPHEIGHT);
		thecanvas.setInkColor(prevColor);
	}
	
	public static void drawBall(Canvas thecanvas, int thex, int they)
	{
		Color prevColor = thecanvas.getInkColor();
		thecanvas.setInkColor(Color.BLUE);
		thecanvas.drawFilledOval(thex, they, BALLWIDTH, BALLHEIGHT);
		thecanvas.setInkColor(prevColor);
	}
	
	public static void eraseBall(Canvas thecanvas, int thex, int they)
	{
		Color prevColor = thecanvas.getInkColor();
		thecanvas.setInkColor(thecanvas.getBackgroundColor());
		thecanvas.drawFilledRectangle(thex, they, BALLWIDTH, BALLHEIGHT);
		thecanvas.setInkColor(prevColor);
	}
	
	public static void swapCups(Canvas thecanvas, int cup1x, int cup1y, int cup2x, int cup2y, int swapSpeed)
	{
		int current1x = cup1x;
		int target1x = cup2x;
		int current2x = cup2x;
		int target2x = cup1x;
		
		if (cup1x == cup2x)
			return; //No cup switching this time...
		
		while(current1x != cup2x && current2x != cup1x)
		{
			//Start the draw cycle!
			drawCup(thecanvas, current1x, cup1y);
			drawCup(thecanvas, current2x, cup2y);
			
			thecanvas.pause(10 * swapSpeed);
			
			eraseCup(thecanvas, current1x, cup1y);
			eraseCup(thecanvas, current2x, cup2y);
			
			if (current1x > target1x)
			{
				current1x--;
			}
			else
			{
				current1x++;
			}
			
			if (current2x > target2x)
			{
				current2x--;
			}
			else
			{
				current2x++;
			}
		}
		drawCup(thecanvas, current1x, cup1y);
		drawCup(thecanvas, current2x, cup2y);
		
		return;
	}
	
	public static void moveUpCup(Canvas thecanvas, int thex, int they)
	{
		
	}
	
}
