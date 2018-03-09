
public class ClothesTester {

	public static void main(String[] args) {
		Clothes pants = new Clothes("Pants", 5, "Beige");
		Clothes shirts = new Clothes("Shirts", 10, "Orange");
		
		System.out.println("Clothing: " + pants.getName() + " Amount: " + pants.getAmount() + " Color: " + pants.getColor());
		System.out.println("Clothing: " + shirts.getName() + " Amount: " + shirts.getAmount() + " Color: " + shirts.getColor());
		System.out.println();
		
		pants.addAmount(10);
		shirts.addAmount(6);
		pants.setColor("Blue");
		shirts.setColor("Red");
		
		System.out.println("Clothing Item: " + pants.getName() + " Amount: " + pants.getAmount() + " Color: " + pants.getColor());
		System.out.println("Clothing Item: " + shirts.getName() + " Amount: " + shirts.getAmount() + " Color: " + shirts.getColor());
		System.out.println();
		
		if(pants.getAmount() > shirts.getAmount())
		{
			System.out.println("More pants than shirts!");
		} else if (shirts.getAmount() > pants.getAmount()) {
			System.out.println("More shirts than pants!");
		} else {
			System.out.println("It seems like all clothes are equal today.");
		}
	}
}
