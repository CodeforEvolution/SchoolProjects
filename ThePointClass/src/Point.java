
public class Point {
	private double x;
	private double y;
	
	public Point()
	{
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double theX, double theY)
	{
		x = theX;
		y = theY;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	public int quadrant()
	{
		if (x == 0 || y == 0)
		{
			return -1;
		} else if (y > 0) {
			if (x > 0)
			{
				return 1;
			} else if (x < 0) {
				return 2;
			}
		} else if (y < 0) {
			if (x < 0)
			{
				return 3;
			} else if (x > 0) {
				return 4;
			}
		}
		
		return -1;
	}
}
