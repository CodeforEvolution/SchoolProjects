import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Person {
	Point myPos = new Point(0,0);
	Color color = Color.GRAY;
	Canvas drawSurface = null;
	
	public Person(Canvas surfaceToDraw, Point startpos, Color rainbow)
	{
		drawSurface = surfaceToDraw;
		myPos = startpos;
		color = rainbow;
		
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
		drawSurface.drawFilledOval(where.x, where.y, 50 + 1, 50 + 1);
		drawSurface.drawLine(new Point(where.x + 25, where.y + 50), new Point(where.x + 25, where.y + 100));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 60), new Point(where.x + 50, where.y + 90));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 60), new Point(where.x, where.y + 90));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 100), new Point(where.x + 50, where.y + 125));
		drawSurface.drawLine(new Point(where.x + 25, where.y + 100), new Point(where.x, where.y + 125));
		
		drawSurface.setInkColor(prevState);
	}
	
	public void jump(Point to, int jumpHeight)
	{
		
		
		myPos = to;
	}
	
	public void move(Point to, int seconds)
	{
		if (myPos == to)
			return;
		
		if (myPos.x > to.y)
		{
			for (int i = myPos.x; i > to.y; i--)
			{
				erase(new Point(i, myPos.y));
				draw(new Point(i, myPos.y));
				drawSurface.pause(10);
			}
		}
		else
		{
			for (int i = myPos.x; i > to.y; i--)
			{
				erase(new Point(i, myPos.y));
				draw(new Point(i, myPos.y));
				drawSurface.pause(10);
				
			}
		}
		
		myPos = to;
	}
	
	public void setColor(Color theColor)
	{
		color = theColor;
	}
	
	public void sayHello()
	{
		AudioPlayer play = new AudioPlayer();
		play.play("/Users/secunjac000/Desktop/hello.wav");
	}
	
}
