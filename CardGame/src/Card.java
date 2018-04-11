import java.util.Random;


public class Card {
	enum Suit
	{
		HEARTS, DIAMONDS, CLUBS, SPADES, UNSETS;
		public static Suit getRandomSuit() {
			Random random = new Random();
			return values()[random.nextInt(values().length - 1)];
		}
	}
	
	enum Type
	{
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, UNSETT;
		public static Type getRandomType() {
			Random random = new Random();
	        return values()[random.nextInt(values().length - 1)];
		}
	}
	
	enum CColor
	{
		RED, BLACK, UNSETC;
		public static CColor getRandomCColor() {
			Random random = new Random();
			return values()[random.nextInt(values().length - 1)];
		}
	}
	
	private Suit ourSuit = Suit.UNSETS;
	private Type ourType = Type.UNSETT;
	private CColor ourColor = CColor.UNSETC;
	
	//Generates Randomly
	public Card()
	{		
		ourSuit = Suit.getRandomSuit();
		ourType = Type.getRandomType();
		ourColor = CColor.getRandomCColor();
	}
	
	//Sets Card Directly
	public Card(CColor theColor, Type theType, Suit theSuit)
	{
		ourSuit = theSuit;
		ourType = theType;
		ourColor = theColor;
	}
	
	public Suit getSuit()
	{
		return ourSuit;
	}
	
	public CColor getColor()
	{
		return ourColor;
	}
	
	public Type getType()
	{
		return ourType;
	}
	
	public String getCard()
	{
		String outStr = "The ";
		
		switch (ourColor)
		{
			case BLACK:
				outStr += "Black ";
				break;
			case RED:
				outStr += "Red ";
				break;
			case UNSETC:
				outStr += "Unknown ";
				break;
			default:
				outStr += "Unknown ";
				break;
		}
		
		switch (ourType)
		{
		case ACE:
			outStr += "Ace ";
			break;
		case EIGHT:
			outStr += "Eight ";
			break;
		case FIVE:
			outStr += "Five ";
			break;
		case FOUR:
			outStr += "Four ";
			break;
		case JACK:
			outStr += "Jack ";
			break;
		case KING:
			outStr += "King ";
			break;
		case NINE:
			outStr += "Nine ";
			break;
		case QUEEN:
			outStr += "Queen ";
			break;
		case SEVEN:
			outStr += "Seven ";
			break;
		case SIX:
			outStr += "Six ";
			break;
		case TEN:
			outStr += "Ten ";
			break;
		case THREE:
			outStr += "Three ";
			break;
		case TWO:
			outStr += "Two ";
			break;
		case UNSETT:
			outStr += "Unknown ";
			break;
		default:
			outStr += "Unknown ";
			break;
		}
		
		outStr += "of ";
		
		switch (ourSuit)
		{
		case CLUBS:
			outStr += "Clubs";
			break;
		case DIAMONDS:
			outStr += "Diamonds";
			break;
		case HEARTS:
			outStr += "Hearts";
			break;
		case SPADES:
			outStr += "Spades";
			break;
		case UNSETS:
			outStr += "Unknowns";
			break;
		default:
			outStr += "Unknowns";
			break;		
		}
		
		return outStr;
	}
	
	public String toString()
	{
		return getCard();
	}
	
	public static Card fromString(String inColor, String inType, String inSuit)
	{
		CColor color = CColor.UNSETC;
		Type type = Type.UNSETT;
		Suit suit = Suit.UNSETS;
		
		String colorStr = inColor.toLowerCase(); 
		String typeStr = inType.toLowerCase();
		String suitStr = inSuit.toLowerCase();
		
		if (colorStr.equals("red"))
		{
			color = CColor.RED;
		}
		else if (colorStr.equals("black"))
		{
			color = CColor.BLACK;
		}
		else
		{
			color = CColor.UNSETC;
		}
		
		if (typeStr.equals("ace"))
		{
			type = Type.ACE;
		}
		else if (typeStr.equals("eight"))
		{
			type = Type.EIGHT;
		}
		else if (typeStr.equals("five"))
		{
			type = Type.FIVE;
		}
		else if (typeStr.equals("four"))
		{
			type = Type.FOUR;
		}
		else if (typeStr.equals("jack"))
		{
			type = Type.JACK;
		}
		else if (typeStr.equals("king"))
		{
			type = Type.KING;
		}
		else if (typeStr.equals("nine"))
		{
			type = Type.NINE;
		}
		else if (typeStr.equals("queen"))
		{
			type = Type.QUEEN;
		}
		else if (typeStr.equals("seven"))
		{
			type = Type.SEVEN;
		}
		else if (typeStr.equals("six"))
		{
			type = Type.SIX;
		}
		else if (typeStr.equals("ten"))
		{
			type = Type.TEN;
		}
		else if (typeStr.equals("three"))
		{
			type = Type.THREE;
		}
		else if (typeStr.equals("two"))
		{
			type = Type.TWO;
		}
		else
		{
			type = Type.UNSETT;
		}
		
		if (suitStr.equals("clubs"))
		{
			suit = Suit.CLUBS;
		}
		else if (suitStr.equals("diamonds"))
		{
			suit = Suit.DIAMONDS;
		}
		else if (suitStr.equals("hearts"))
		{
			suit = Suit.HEARTS;
		}
		else if (suitStr.equals("spades"))
		{
			suit = Suit.SPADES;
		}
		else
		{
			suit = Suit.UNSETS;
		}
		
		return new Card(color, type, suit);
	}
}
