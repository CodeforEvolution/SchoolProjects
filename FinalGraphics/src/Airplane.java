import java.awt.Color;
import java.awt.Point;

public class Airplane {
	Point myPos = new Point(0,0);
	Color color = Color.GRAY;
	Canvas drawSurface = null;
	boolean visible = false;
	
	public Airplane(Canvas surfaceToDraw, Point startpos, Color rainbow)
	{
		drawSurface = surfaceToDraw;
		myPos = startpos;
		color = rainbow;
		visible = true;
		
		draw(myPos);
		airplaneStart();
	}
	
	private void draw(Point where)
	{
		Color prevState = drawSurface.getInkColor();
		
		drawSurface.setInkColor(color);
		
		drawSurface.drawOval(where.x, where.y, 100, 100);
		
		drawSurface.setInkColor(prevState);
	}
	
	private void erase(Point where)
	{
		Color prevState = drawSurface.getInkColor();
		drawSurface.setInkColor(drawSurface.getBackgroundColor());
		
		drawSurface.drawFilledOval(where.x - 10, where.y - 10, 125, 125);
		
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
		
	}
	
	public void setColor(Color theColor)
	{
		color = theColor;
	}
	
	public void airplaneStart()
	{
		AudioPlayer play = new AudioPlayer();
		play.play("/Users/secunjac000/Desktop/airplanes.wav");
	}
	
}
