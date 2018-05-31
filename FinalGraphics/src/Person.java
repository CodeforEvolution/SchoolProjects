import java.awt.Color;
import java.awt.Point;

public class Person {
	Point myPos = new Point(0,0);
	Color color = Color.GRAY;
	Canvas drawSurface = null;
	boolean visible = false;
	
	public Person(Canvas surfaceToDraw, Point startpos, Color rainbow)
	{
		drawSurface = surfaceToDraw;
		myPos = startpos;
		color = rainbow;
		visible = true;
		
		draw(myPos);
		sayHello();
	}
	
	private void draw(Point where)
	{
		Color prevState = drawSurface.getInkColor();
		
		drawSurface.setInkColor(color);
		drawSurface.drawOval(where.x, where.y, 50, 50);
		drawSurface.drawLine(new Point(where.x + 25, where.y + 50), new Point(where.x + 25, where.y + 100));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 60), new Point(where.x + 50, where.y + 90));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 60), new Point(where.x, where.y + 90));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 100), new Point(where.x + 50, where.y + 125));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 100), new Point(where.x, where.y + 125));
		
		drawSurface.setInkColor(prevState);
	}
	
	private void erase(Point where)
	{
		Color prevState = drawSurface.getInkColor();
		drawSurface.setInkColor(drawSurface.getBackgroundColor());
		
		drawSurface.drawFilledOval(where.x - 10, where.y - 10, 55, 65);		
		drawSurface.drawFilledRectangle(where.x - 10, where.y, 70, 130);
		
		drawSurface.setInkColor(prevState);
	}
	
	public void jump(Point to, int jumpHeight)
	{
		
		
		myPos = to;
	}
	
	public void moveLR(int toX, int seconds)
	{
		if (myPos.x == toX)
			return;
		
		if (myPos.x > toX)
		{
			for (int i = myPos.x; i > toX; i--)
			{
				erase(new Point(i, myPos.y));
				draw(new Point(i, myPos.y));
				drawSurface.pause(5);
			}
		}
		else
		{
			for (int i = myPos.x; i < toX; i++)
			{
				erase(new Point(i, myPos.y));
				draw(new Point(i, myPos.y));
				drawSurface.pause(5);
			}
		}
		
		myPos = new Point(toX, myPos.y);
	}
	
	public void moveUD(int toY, int seconds)
	{
		if (myPos.y == toY)
			return;
		
		if (myPos.y > toY)
		{
			for (int i = myPos.y; i > toY; i--)
			{
				erase(new Point(myPos.x, i));
				draw(new Point(myPos.x, i));
				drawSurface.pause(5);
			}
		}
		else
		{
			for (int i = myPos.y; i < toY; i++)
			{
				erase(new Point(myPos.x, i));
				draw(new Point(myPos.x, i));
				drawSurface.pause(5);
			}
		}
		
		myPos = new Point(myPos.x, toY);
	}
	
	public void move(Point to, int seconds)
	{
		
	}
	
	public void setColor(Color theColor)
	{
		color = theColor;
		draw(myPos);
	}
	
	public void sayHello()
	{
		AudioPlayer play = new AudioPlayer();
		play.play("/Users/secunjac000/Desktop/hello.wav");
	}
	
}
