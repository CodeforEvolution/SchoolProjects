import java.util.Scanner;


public class TimetoSwitch {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		double radius = 0.0;
		double height = 0.0;
		double answer = 0.0;
		
		System.out.println("Hello! What shape's volume would you like to calculate?");
		System.out.println("(1 Cyliner (2 Cone (3 Sphere (4 Silo (5 Ice Cream Cone");
		choice = in.nextInt();
		
		System.out.println("Enter a radius for this shape please: ");
		radius = in.nextDouble();
		
		System.out.println("Finally, enter a height for this shape please: ");
		height = in.nextDouble();
		
		System.out.println("Calculating...");
		
		switch (choice)
		{
			case 1:
				answer = calcCylinder(radius, height);
				break;
			case 2:
				answer = calcCone(radius, height);
				break;
			case 3:
				answer = calcSphere(radius, height);
				break;
			case 4:
				answer = calcSilo(radius, height);
				break;
			case 5:
				answer = calcIceCreamCone(radius, height);
				break;
			default:
				System.out.println("Ummm that's not an available choice, goodbye!");
				return;
		}
		
		System.out.println("And the results are in, the volume is: " + answer);
		return;
	}
	
	public static double calcCylinder(double radius, double height)
	{
		double result = 0.0;
		
		result = Math.PI * Math.pow(radius, 2) * height;
		
		return result;
	}
	
	public static double calcCone(double radius, double height)
	{
		double result = 0.0;
		
		result = (1.0/3.0) * (Math.PI * Math.pow(radius, 2) * height);
		
		return result;
	}
	
	public static double calcSphere(double radius, double height)
	{
		double result = 0.0;
		
		result = (4.0/3.0) * (Math.PI * Math.pow(radius, 3) * height);
		
		return result;
	}
	
	public static double calcSilo(double radius, double height)
	{
		double result = 0.0;
		
		result = calcCylinder(radius, height) + (calcSphere(radius, height) / 2);
		
		return result;
	}
	
	public static double calcIceCreamCone(double radius, double height)
	{
		
		double result = 0.0;
		
		result = calcCone(radius, height) + (calcSphere(radius, height) / 2);
		
		return result;
	}
}
