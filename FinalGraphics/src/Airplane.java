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
		drawSurface.drawLine(where.x + 20, where.y + 10, where.x - 60, where.y + 50);
		drawSurface.drawLine(where.x - 60, where.y + 50, where.x + 20, where.y + 90);
		drawSurface.drawLine(where.x + 80, where.y + 10, where.x + 130, where.y + 50);
		drawSurface.drawLine(where.x + 130, where.y + 50, where.x + 80, where.y + 90);
		drawSurface.drawFilledOval(where.x + 30, where.y + 20, 70, 30);
		
		int[] tailX = new int[3];
		tailX[0] = where.x + 90;
		tailX[1] = where.x - 10;
		tailX[2] = where.x;
		
 		int[] tailY = new int[3];
		tailY[0] = where.y + 20;
		tailY[1] = where.y + 5;
		tailY[2] = where.y - 55;
		
		drawSurface.drawFilledPolygon(tailX, tailY, 3);
		
		drawSurface.setInkColor(prevState);
	}
	
	private void erase(Point where)
	{
		Color prevState = drawSurface.getInkColor();
		drawSurface.setInkColor(drawSurface.getBackgroundColor());
		
		drawSurface.drawFilledRectangle(where.x - 65, where.y - 60, 205, 180);
		
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
	
	public void setColor(Color theColor)
	{
		color = theColor;
		draw(myPos);
	}
	
	public void airplaneStart()
	{
		AudioPlayer play = new AudioPlayer();
		play.play("/Users/secunjac000/Desktop/airplanes.wav");
	}
	
}
