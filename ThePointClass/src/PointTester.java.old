import java.util.Scanner;
import java.util.Vector;


public class PointTester {
	public static void main(String[] args)
	{
		double theX = 0.0;
		double theY = 0.0;
		double otherX = 0.0;
		double otherY = 0.0;

		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to the Point Tester!");
		System.out.println("Please enter a point by entering an x, than a y:");
		theX = s.nextDouble();
		theY = s.nextDouble();

		Point thePoint = new Point(theX, theY, false);

		System.out.println("Please enter another point by entering another x, than another y:");
		otherX = s.nextDouble();
		otherY = s.nextDouble();

		Point otherPoint = new Point(otherX, otherY, false);
        
        double aDist = 0.0;
        double aAng = 0.0;
        double bDist = 0.0;
        double bAng = 0.0;
        
        thePoint.toVector(aDist, aAng);
        otherPoint.toVector(bDist, bAng);
        
		System.out.println("1st Point: " + thePoint);
        System.out.println("Combined Vectors: Distance: " + aDist + " Angle: " + aAng);
		System.out.println("2nd Point: " + otherPoint);
        System.out.println("Combined Vectors: Distance: " + bDist + " Angle: " + bAng);

		double xDist = thePoint.calcXDist(otherPoint);
		double yDist = thePoint.calcYDist(otherPoint);
		double lineDist = thePoint.distance(otherPoint);
		String lineEquation = thePoint.equation(otherPoint);
		Point theMid = thePoint.midpoint(otherPoint);
        
        double addDist = 0.0;
        double addAng = 0.0;
        
        thePoint.addVectors(addDist, addAng, bDist, bAng);

		System.out.println("Distance Between Point's Xs: " + xDist);
		System.out.println("Distance Between Point's Ys: " + yDist);
		System.out.println("Distance Between Points: " + lineDist);
		System.out.println("Equation of the line: " + lineEquation);
		System.out.println("Midpoint of the line: " + theMid);
        System.out.println("Combined Vectors: Distance: " + addDist + " Angle: " + addAng);
        
        s.close();
	}
}
