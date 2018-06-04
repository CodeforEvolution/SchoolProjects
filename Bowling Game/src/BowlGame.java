import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.util.Random;


public class BowlGame {
	static Canvas bowlGame = new Canvas("The Bowling Game!", 1000, 500, Color.BLACK);
	static int[] pins = new int[10];
	static int[] score = new int[10];
	static Random r = new Random();
	
	public static void main(String[] args)
	{
		
		boolean gameEnd = false;
		int currentFrame = 0;
		
		bowlGame.setVisible(true);
		
		resetPins();
/*		
		drawCanvasString("Welcome to the Bowling Game!");
		bowlGame.pause(3000);
		eraseTop();
		drawCanvasString("To bowl, simply click on the bowling ball!");
		bowlGame.pause(3000);
		eraseTop();
		drawCanvasString("Good luck!");
		bowlGame.pause(3000);
		eraseTop();
*/		
		drawScoreBoardFrame();
		drawScore(7, 0, "X");
		drawScore(6, 1, "X");
		drawScore(5, 2, "X");

		do
		{
			bowlTheBall(currentFrame);
			
			if (currentFrame >= 10)
			{
				gameEnd = true;
			}
			currentFrame++;
		} while (gameEnd == false);
	
		
	}
	
	//Backend, score calc methods
	
	public static void bowlTheBall(int frame)
	{
		waitForBallClick();
		
		for (int i = 0; i < pins.length; i++)
		{
			pins[i] = r.nextInt(2);
		}
		
		drawRollBall();
		
		drawBowlingAlley();
	}
	
	public static void waitForBallClick()
	{
		boolean valid;
		Point theClick;
		
		do
		{
			theClick = bowlGame.waitForClick();
			Ellipse2D shape = new Ellipse2D.Double(100, 250, 60, 60);

			if (shape.contains(theClick))
			{
				valid = true;
			}
			else
			{
				valid = false;
			}
			
		} while (valid == false);
	}
	
	public static void resetPins()
	{
		for (int i = 0; i < pins.length; i++)
		{
			pins[i] = 0;
		}
		
		drawBowlingAlley();
	}
	
	//Drawing methods
	
	public static void drawRollBall()
	{
		eraseBowlBall(100, 250);
		
		for (int i = 0; i < 1000; i++)
		{
			drawBowlBall(i, 250 );
			bowlGame.pause(1);
			eraseBowlBall(i, 250);
		}
	}
	
	public static void drawCanvasString(String theString)
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(Color.ORANGE);
		bowlGame.setFont(Font.getFont(Font.SANS_SERIF));
		bowlGame.setFontSize(24);
		bowlGame.drawString(theString, (1000 - theString.length()) / 2, 100);
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void eraseTop()
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(bowlGame.getBackgroundColor());
		bowlGame.drawFilledRectangle(0, 0, 1000, 150);
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void drawScoreBoardFrame()
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(Color.WHITE);
		bowlGame.drawFilledRectangle(0, 0, 1000, 150);
		bowlGame.setInkColor(Color.BLACK);
		bowlGame.drawLine(0, 75, 1000, 75);
		
		for (int i = 0; i < 10; i++)
		{
			bowlGame.drawLine(100 * i, 0, 100 * i, 150);
		}
		
		for (int i = 0; i < 10; i++)
		{
			bowlGame.drawLine(50 + (100 * i), 0, 50 + (100 * i), 75);
		}
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void drawScore(int frame, int pos, String score)
	{
		int x = 100 * frame;
		int y = 0;
		
		switch (pos)
		{
			case 0:
				x += 15;
				y += 50;
				bowlGame.setFontSize(40);
				break;
			case 1:
				x += 65;
				y += 50;
				bowlGame.setFontSize(40);
				break;
			case 2:
				x += 30;
				y += 145;
				bowlGame.setFontSize(80);
				break;
			default:
				System.out.println("Unhandled Case");
				break;
		}
		
		Color lastColor = bowlGame.getBackgroundColor();
		
		bowlGame.setInkColor(Color.BLACK);
		bowlGame.drawString(score, x, y);
		bowlGame.setInkColor(lastColor);
	}
	
	public static void drawBowlingAlley()
	{
		if (pins[0] == 0)
		{
			drawPin(750, 250);
		}
		if (pins[1] == 0)
		{
			drawPin(790, 225);
		}
		if (pins[2] == 0)
		{
			drawPin(790, 275);
		}
		if (pins[3] == 0)
		{
			drawPin(830, 300);
		}
		if (pins[4] == 0)
		{
			drawPin(830, 250);
		}
		if (pins[5] == 0)
		{
			drawPin(830, 200);
		}
		if (pins[6] == 0)
		{
			drawPin(870, 325);
		}
		if (pins[7] == 0)
		{
			drawPin(870, 275);
		}
		if (pins[8] == 0)
		{
			drawPin(870, 230);
		}
		if (pins[9] == 0)
		{
			drawPin(870, 180);
		}
		
		drawBowlBall(100, 250);
	}
	
	public static void eraseBowlingAlley()
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(bowlGame.getBackgroundColor());
		bowlGame.drawFilledRectangle(0, 250, 1000, 250);
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void drawPin(int x, int y)
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(Color.ORANGE);
		bowlGame.drawFilledOval(x, y, 40, 40);
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void drawBowlBall(int x, int y)
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(Color.BLUE);
		bowlGame.drawFilledOval(x, y, 60, 60);
		bowlGame.setInkColor(Color.CYAN);
		bowlGame.drawFilledOval(x + 4, y + 25, 20, 20);
		bowlGame.drawFilledOval(x + 30, y + 35, 20, 20);
		bowlGame.drawFilledOval(x + 30, y + 5, 20, 20);
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void eraseBowlBall(int x, int y)
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(bowlGame.getBackgroundColor());
		bowlGame.drawFilledOval(x, y, 60, 60);
		
		bowlGame.setInkColor(lastColor);
	}
}
