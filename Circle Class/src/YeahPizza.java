import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class YeahPizza {	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		NumberFormat toMoney = NumberFormat.getCurrencyInstance(Locale.getDefault());
		
		Circle pizza;
		Circle pizzaSmall;
		Circle pizzaBig;
		int diameter = 0;
		int slices = 0;
		double price = 0.0;
		
		System.out.println("It's time to make some pizza! ;)");
		
		System.out.println("First, what should the diameter of the pizza be? (inches): ");
		diameter = in.nextInt();
		
		System.out.println("Next, how many slices should this delicious pizza have? :D :");
		slices = in.nextInt();
		
		System.out.println("Finally, how much should this pizza cost????: ");
		price = in.nextDouble();
		
		pizza = new Circle(diameter / 2);
		
		System.out.println();
		System.out.println("The pizza should have an area of: " + pizza.area());
		
		double costsq = price / pizza.area();
		System.out.println("The pizza costs " + toMoney.format(costsq) + " per square inch.");
		
		double bites = Math.ceil(pizza.area() / 2.5);
		System.out.println("It will take " + bites + " bites to finish this pizza!");
		
		double sliceArea = pizza.area() / slices;
		
		int angle = 360 / slices;
		double sliceCrustLength = pizza.arc_length(angle);
		
		System.out.println("Slice Area: " + sliceArea);
		System.out.println("Crust Length of 1 Slice: " + sliceCrustLength);
		
		System.out.println("\nMore pizzas!!!!!!!!!!!\n");
		
		pizzaSmall = new Circle(5);
		pizzaBig = new Circle(10);
		
		pizzaBig.addRadius(pizzaSmall);
		
		System.out.println("Your small pizza: " + pizzaSmall);
		System.out.println("Your large pizza: " + pizzaBig);
		
	}
}
