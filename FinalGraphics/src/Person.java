import java.awt.Color;
import java.awt.Point;


public class Person {
	Point pos = new Point(0,0);
	Color color = Color.GRAY;
	Canvas drawSurface = null;
	
	public Person(Canvas surfaceToDraw, Point startpos, Color rainbow)
	{
		drawSurface = surfaceToDraw;
		pos = startpos;
		color = rainbow;
		
		draw(pos);
	}
	
	private void draw(Point where)
	{
		Color prevState = drawSurface.getInkColor();
		
		drawSurface.setInkColor(color);
		drawSurface.drawOval(where.x, where.y, 50, 50);
		drawSurface.drawLine(new Point(where.x + 25, where.y + 50), new Point(where.x + 25, where.y + 100));
		
		drawSurface.setInkColor(prevState);
	}
	
	private void erase(Point where)
	{
		
	}
	
	public void jump(Point to, int jumpHeight)
	{
		
	}
	
	public void move(Point to, int seconds)
	{
		
	}
	
	public void setColor(Color theColor)
	{
		color = theColor;
	}
	
}
