import java.awt.Color;
import java.awt.Font;
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
		
		int curBallPos = 0;
		
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
			
			System.out.println("\n=======================================================================");
			System.out.println("Look back at the canvas, you will now see the ball's initial position!");
			
			thegame.erase();

			drawCup(thegame, cuppos[0], 100);
			drawCup(thegame, cuppos[1], 100);
			drawCup(thegame, cuppos[2], 100);
			
			curBallPos = r.nextInt(3);
			drawBall(thegame, ballpos[curBallPos], 300);
			
			swapCups(thegame, cuppos[r.nextInt(3)], 100, cuppos[r.nextInt(3)], 100);
			
			
			System.out.println("Would you like to play, again?: ");
			again = in.next().charAt(0);
		} while (again == 'y');
		
		System.out.println("\nThank you for playing the hidden ball guessing game!");
		System.out.println("Goodbye!");
		
	}
	
	public static void drawCup(Canvas thecanvas, int thex, int they)
	{
		thecanvas.setInkColor(Color.RED);
		thecanvas.drawFilledRectangle(thex, they, CUPWIDTH, CUPHEIGHT);
	}
	
	public static void eraseCup(Canvas thecanvas, int thex, int they)
	{
		
	}
	
	public static void drawBall(Canvas thecanvas, int thex, int they)
	{
		thecanvas.setInkColor(Color.BLUE);
		thecanvas.drawFilledOval(thex, they, BALLWIDTH, BALLHEIGHT);
	}
	
	public static void eraseBall(Canvas thecanvas, int thex, int they)
	{
		
	}
	
	public static void swapCups(Canvas thecanvas, int cup1x, int cup1y, int cup2x, int cup2y)
	{
		int current1x = cup1x;
		int current2x = cup2x;
		
		thecanvas.eraseRectangle(cup1x, cup1y, CUPWIDTH, CUPHEIGHT);
		thecanvas.eraseRectangle(cup1x, cup1y, CUPWIDTH, CUPHEIGHT);
	}
	
}
