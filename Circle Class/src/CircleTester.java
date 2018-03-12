
public class CircleTester {

	public static void main(String[] args) {
		Circle smallCircle = new Circle(10);
		Circle bigCircle = new Circle(300);
		
		System.out.println("The small circle takes " + smallCircle.rotations(5280) + " rotations to travel a mile.");
		System.out.println("The big circle takes " + bigCircle.rotations(5280) + " rotations to travel a mile.");
		
		if (smallCircle.arc_length(400) > bigCircle.arc_length(50))
		{
			System.out.println("Who knew something so small could be so big!");
		} else {
			System.out.println("It seems size unfortunately matters! Bigger is better... :(");
		}
		System.out.println("Arc Length of Small: " + smallCircle.arc_length(400));
		System.out.println("Arc Length of Big: " + bigCircle.arc_length(50));
		
		if (smallCircle.sector_area(200) > bigCircle.sector_area(60))
		{
			System.out.println("Small's sector is bigger!");
		} else {
			System.out.println("Big's sector is bigger");
		}
		System.out.println("Sector Area of Small: " + smallCircle.sector_area(200));
		System.out.println("Sector Area of Big: " + bigCircle.sector_area(60));
	}

}
