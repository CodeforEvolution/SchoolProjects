import java.util.Scanner;


public class ThreeDSolids {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double cylheight = 0.0;
		double conheight = 0.0;
		
		Circle cylcircle;
		Circle concircle;
		Circle sphcircle;
		
		System.out.println("Please enter a radius and height for a cylinder: ");
		cylcircle = new Circle(in.nextInt());
		cylheight = in.nextDouble();
		
		double cylvolume = cylcircle.area() * cylheight;
		double cylarea = 2 * cylcircle.area() + 2 * (Math.PI * Math.pow(cylcircle.getRadius(), 2) * cylheight);
		
		System.out.println("Cylinder Volume: " + cylvolume);
		System.out.println("Cylinder Area: " + cylarea);
		System.out.println();
		
		System.out.println("Please enter a radius and height for a cone: ");
		concircle = new Circle(in.nextInt());
		conheight = in.nextDouble();
		
		double convolume = concircle.area() * (conheight / 3);
		double conarea = (Math.PI * concircle.getRadius()) * (concircle.getRadius() + Math.sqrt(Math.pow(conheight, 2) + Math.pow(concircle.getRadius(), 2)));
		
		System.out.println("Cone Volume: " + convolume);
		System.out.println("Cone Area: " + conarea);
		System.out.println();
		
		System.out.println("Please enter a radius for a sphere: ");
		sphcircle = new Circle(in.nextInt());
		
		double sphvolume = (4.0/3.0) * Math.PI * Math.pow(sphcircle.getRadius(), 3);
		double spharea = 4 * (sphcircle.area());
		
		System.out.println("Sphere Volume: " + sphvolume);
		System.out.println("Sphere Area: " + spharea);
		System.out.println();
		
	}
}
