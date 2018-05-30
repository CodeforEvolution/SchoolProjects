import java.awt.Color;
import java.awt.Font;
import java.awt.Point;


public class NormalDay {
	public static void main(String[] args)
	{
		Canvas scene = new Canvas("My World", 1000, 1000, Color.BLACK);
		scene.setVisible(true);
		
		scene.setInkColor(Color.GREEN);
		scene.setFontSize(30);
		scene.setFont(Font.getFont(Font.SERIF));
		scene.drawString("Welcome to My World", 350, 50);
		
		Person bob = new Person(scene, new Point(500, 500), Color.BLUE);
		Airplane jim = new Airplane(scene, new Point(500, 800), Color.ORANGE);
		
		bob.moveLR(600, 2);
		jim.moveLR(100, 2);
		bob.moveLR(300, 2);
		jim.moveLR(900, 2);
	}
}
