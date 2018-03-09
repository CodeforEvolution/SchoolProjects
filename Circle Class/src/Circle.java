
public class Circle {

	private int radius = 0;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle(int radiusInInches)
	{
		radius = radiusInInches;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double circumf()
	{
		return 2 * (Math.PI * radius);
	}
	
	public double arc_length(int degrees)
	{
		return (degrees/360) * circumf();
	}
	
	public double sector_area(int degrees)
	{
		return (degrees/360) * area();
	}
	
	public double rotations(int feet)
	{
		return feet / circumf();
	}

}
