
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
	
	public void addRadius(Circle otherCircle)
	{
		int radiusSum = this.getRadius() + otherCircle.getRadius();
		
		this.radius = radiusSum - 1;
		otherCircle.radius = 1;
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
		return (degrees / 360.0) * circumf();
	}
	
	public double sector_area(int degrees)
	{
		return (degrees / 360.0) * area();
	}
	
	public double rotations(int feet)
	{
		return (feet * 12.0) / circumf();
	}
	
	public String toString()
	{
		return "Radius: " + radius;
	}

}
