
public class CardGameTester {
	public static void main(String[] args)
	{
		Card test1 = new Card();
		Card test2 = new Card(Card.CColor.BLACK, Card.Type.ACE, Card.Suit.CLUBS);
		
		System.out.println("First: \n" + test1);
		System.out.println("Second: \n" + test2);
	}
}
