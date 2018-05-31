import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.Random;


public class NormalDay {
	public static void main(String[] args)
	{
		Canvas scene = new Canvas("My World", 1000, 1000, Color.BLACK);
		scene.setVisible(true);
		Random r = new Random();
		
		scene.setInkColor(Color.GREEN);
		scene.setFontSize(30);
		scene.setFont(Font.getFont(Font.SERIF));
		scene.drawString("Welcome to My World", 350, 50);
		
		Person bob = new Person(scene, new Point(500, 500), Color.BLUE);
		Airplane jim = new Airplane(scene, new Point(500, 800), Color.ORANGE);
/*		
		bob.moveLR(600, 2);
		jim.moveLR(300, 2);
		bob.moveUD(200, 2);
		jim.moveUD(900, 2);
		bob.moveUD(500, 2);
		jim.moveUD(200, 2);
*/		
		for (int i = 0; i < 100; i++)
		{
			bob.setColor(colorAtIndex(r.nextInt(12)));
			jim.setColor(colorAtIndex(r.nextInt(13)));
			scene.pause(100);
		}
	}
	
	public static Color colorAtIndex(int in)
	{
		switch (in)
		{
			case 0:
				return Color.BLACK;
			case 1:
				return Color.BLUE;
			case 2:
				return Color.CYAN;
			case 3:
				return Color.DARK_GRAY;
			case 4:
				return Color.GRAY;
			case 5:
				return Color.GREEN;
			case 6:
				return Color.LIGHT_GRAY;
			case 7:
				return Color.MAGENTA;
			case 8:
				return Color.ORANGE;
			case 9:
				return Color.PINK;
			case 10:
				return Color.RED;
			case 11:
				return Color.WHITE;
			case 12:
				return Color.YELLOW;
			default:
				return Color.BLACK;
		}
	}
}
