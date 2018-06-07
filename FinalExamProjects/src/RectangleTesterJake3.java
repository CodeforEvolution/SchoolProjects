import java.awt.Color;
import java.awt.Point;
import java.util.Random;


public class RectangleTesterJake3 {
	public static void main(String[] args)
	{
		Random r = new Random();
		Canvas world = new Canvas("Rectangles", 500, 500, Color.BLACK);
		RectangleJake small;
		RectangleJake middle;
		RectangleJake large;
		world.setVisible(true);
		
		System.out.println("Please click in 3 different places around the screen.");
	
		RectangleJake jim = new RectangleJake(world, r.nextInt(100), r.nextInt(100), world.waitForClick());
		RectangleJake bob = new RectangleJake(world, r.nextInt(100), r.nextInt(100), world.waitForClick());
		RectangleJake man = new RectangleJake(world, r.nextInt(100), r.nextInt(100), world.waitForClick());
		
		System.out.println("Jim's Area: " + jim.getArea());
		System.out.println("Bob's Area: " + bob.getArea());
		System.out.println("Man's Area: " + man.getArea());
		
		if (jim.getArea() < bob.getArea() && jim.getArea() < man.getArea())
		{
			small = jim;
		}
		else if (bob.getArea() < man.getArea())
		{
			small = bob;
		}
		else
		{
			small = man;
		}
		
		if (jim.getArea() > bob.getArea() && jim.getArea() > man.getArea())
		{
			large = jim;
		}
		else if (bob.getArea() > man.getArea())
		{
			large = bob;
		}
		else
		{
			large = man;
		}
		
		if ((small == bob && large == jim) || (small == jim && large == bob))
		{
			middle = man;
		}
		else if ((small == man && large == jim) || (small == jim && large == man))
		{
			middle = bob;
		}
		else
		{
			middle = jim;
		}
		
		world.setInkColor(Color.ORANGE);
		world.drawOval(small.getPos().x, small.getPos().y, small.getWidth() + 10, small.getHeight() + 10);
		
		world.setInkColor(Color.BLUE);
		world.drawLine(small.getPos(), large.getPos());
		
		middle.move(new Point(500 - middle.ourWidth, 0));
	}
}
