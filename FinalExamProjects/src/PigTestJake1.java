
public class PigTestJake1 {
	public static void main(String[] args)
	{
		PigJake bob = new PigJake("Bob", "Feisty", 5);
		PigJake fred = new PigJake("Fred", "Laid Back", 10);
		
		bob.eat();
		fred.eat();
		
		System.out.println(bob);
		System.out.println(fred);
		
		fred.play();
		bob.play();
		
		System.out.println(bob);
		System.out.println(fred);
		
		bob.party(fred);
		
		System.out.println(bob);
		System.out.println(fred);
	}
}
