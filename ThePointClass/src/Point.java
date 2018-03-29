import java.lang.Math;

public class Point {
	private double x;
	private double y;

	public Point()
	{
		x = 0.0;
		y = 0.0;
	}

	public Point(double XDist, double YAngle, boolean isVector)
	{
        if (isVector == true)
        {
            x = XDist;
            y = YAngle;
        } else {
            x = XDist * Math.acos(YAngle);
            y = XDist * Math.asin(YAngle);

        }
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

	public Point midpoint(Point otherPoint)
	{
		Point a = this;
		Point b = otherPoint;

		double midX = (a.getX() + b.getX()) / 2;
		double midY = (a.getY() + b.getY()) / 2;

		return new Point(midX, midY, false);
	}

	double calcXDist(Point otherPoint)
	{
		return this.getX() - otherPoint.getX();
	}

	double calcYDist(Point otherPoint)
	{
		return this.getY() - otherPoint.getY();
	}

	public double distance(Point otherPoint)
	{
		double xDist = Math.abs(calcXDist(otherPoint));
		double yDist = Math.abs(calcYDist(otherPoint));

		double distance = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));

		return distance;
	}

	public String equation(Point endLinePoint)
	{
		if (endLinePoint.getX() == this.getX())
		{
			return "x = " + this.getX();
		} else if (endLinePoint.getY() == this.getY()) {
			return "y = " + this.getY();
		}

		String finalEquation = "y = mx + b";

		double xDist = calcXDist(endLinePoint);
		double yDist = calcYDist(endLinePoint);

		double interY = endLinePoint.getY() - ((yDist/xDist) * endLinePoint.getX());
		String slope = xDist + "/" + yDist;

		finalEquation.replaceFirst("m", slope);
		finalEquation.replaceFirst("b", Double.toString(interY));

		return finalEquation;
	}

	public void toVector(double outDistance, double outAngle)
	{
		double x = getX();
		double y = getY();

		outDistance = distance(new Point(0,0,false));
		outAngle = Math.sin(calcYDist(new Point(0,0,false)) / calcXDist(new Point(0,0,false)));

        return;
	}

	public Point vectorToPoint(double distance, double angle)
	{
        double outX = distance * Math.acos(angle);
        double outY = distance * Math.asin(angle);
        
		return new Point(outX, outY, false);
	}

	public void addVectors(double inDist, double inAngle, double outDist, double outAngle)
	{
        Point onePoint = this;
        Point otherPoint = new Point(inDist, inAngle, true);
        
        Point addedPoint = new Point(onePoint.getX() + otherPoint.getX(), onePoint.getY() + otherPoint.getY(), false);
        
        addedPoint.toVector(outDist, outAngle);
        
		return;
	}
}
