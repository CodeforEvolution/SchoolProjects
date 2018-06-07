import java.awt.Color;
import java.awt.Point;


public class RectangleJake {
	int ourWidth;
	int ourHeight;
	Canvas ourSurface;
	Point currentPos;
	
	public RectangleJake(Canvas thesurface, int thewidth, int theheight, Point where)
	{
		ourSurface = thesurface;
		ourWidth = thewidth;
		ourHeight = theheight;
		currentPos = where;
		
		draw(currentPos);
	}
	
	public void move(Point where)
	{
		if (where == currentPos)
			return;
		
		if (where.x > currentPos.x)
		{
			while (where.x > currentPos.x)
			{
				erase(currentPos);
				currentPos.x++;
				draw(currentPos);
				ourSurface.pause(5);
			}
		}
		else
		{
			while (where.x < currentPos.x)
			{
				erase(currentPos);
				currentPos.x--;
				draw(currentPos);
				ourSurface.pause(5);
			}
		}
		
		if (where.y > currentPos.y)
		{
			while (where.y > currentPos.y)
			{
				erase(currentPos);
				currentPos.y++;
				draw(currentPos);
				ourSurface.pause(5);
			}
		}
		else
		{
			while (where.y < currentPos.y)
			{
				erase(currentPos);
				currentPos.y--;
				draw(currentPos);
				ourSurface.pause(5);
			}
		}
	}
	
	public void draw(Point where)
	{
		Color lastColor = ourSurface.getInkColor();
		
		ourSurface.setInkColor(Color.BLUE);
		ourSurface.drawFilledRectangle(where.x, where.y, ourWidth, ourHeight);
		
		ourSurface.setInkColor(lastColor);
	}
	
	public void erase(Point where)
	{
		Color lastColor = ourSurface.getInkColor();
		
		ourSurface.setInkColor(ourSurface.getBackgroundColor());
		ourSurface.drawFilledRectangle(where.x, where.y, ourWidth, ourHeight);
		
		ourSurface.setInkColor(lastColor);
	}
	
	public Point getPos()
	{
		return currentPos;
	}
	
	public int getWidth()
	{
		return ourWidth;
	}
	
	public int getHeight()
	{
		return ourHeight;
	}
	
	public double getArea()
	{
		return ourWidth * ourHeight;
	}
	
	
}
