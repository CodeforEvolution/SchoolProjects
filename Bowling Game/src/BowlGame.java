import java.awt.Color;
import java.awt.Font;


public class BowlGame {
	static Canvas bowlGame = new Canvas("The Bowling Game!", 1000, 500, Color.BLACK);
	static int[] pins = new int[10];
	
	public static void main(String[] args)
	{
		bowlGame.setVisible(true);
		
		resetPins();
		
		drawCanvasString("Welcome to the Bowling Game!");
		
	}
	
	public static void drawCanvasString(String theString)
	{
		Color lastColor = bowlGame.getInkColor();
		
		bowlGame.setInkColor(Color.ORANGE);
		bowlGame.setFont(Font.getFont(Font.SANS_SERIF));
		bowlGame.setFontSize(24);
		bowlGame.drawString(theString, 400 - theString.length(), 100);
		
		bowlGame.setInkColor(lastColor);
	}
	
	public static void drawBowlingAlley()
	{
		if (pins[0] == 0)
		{
			drawPin(100, 100);
		}
		if (pins[1] == 0)
		{
			drawPin(150, 100);
		}
		if (pins[2] == 0)
		{
			drawPin(200, 100);
		}
		if (pins[3] == 0)
		{
			drawPin(250, 100);
		}
		if (pins[4] == 0)
		{
			drawPin(300, 100);
		}
		if (pins[5] == 0)
		{
			drawPin(350, 100);
		}
		if (pins[6] == 0)
		{
			drawPin(400, 100);
		}
		if (pins[7] == 0)
		{
			drawPin(450, 100);
		}
		if (pins[8] == 0)
		{
			drawPin(500, 100);
		}
		if (pins[9] == 0)
		{
			drawPin(550, 100);
		}
		
		drawBowlBall(500, 300);
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
	
	public static void resetPins()
	{
		for (int i = 0; i < pins.length; i++)
		{
			pins[i] = 0;
		}
		
		drawBowlingAlley();
	}
	
	public static void bowlTheBall()
	{
		
	}
}
