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
		
		switch (inColor.toLowerCase())
		{
		case "red":
			color = CColor.RED;
			break;
		case "black":
			color = CColor.BLACK;
			break;
		default:
			color = CColor.UNSETC;
			break;
		}
		
		switch (inType.toLowerCase())
		{
		case "ace":
			type = Type.ACE;
			break;
		case "eight":
			type = Type.EIGHT;
			break;
		case "five":
			type = Type.FIVE;
			break;
		case "four":
			type = Type.FOUR;
			break;
		case "jack":
			type = Type.JACK;
			break;
		case "king":
			type = Type.KING;
			break;
		case "nine":
			type = Type.NINE;
			break;
		case "queen":
			type = Type.QUEEN;
			break;
		case "seven":
			type = Type.SEVEN;
			break;
		case "six":
			type = Type.SIX;
			break;
		case "ten":
			type = Type.TEN;
			break;
		case "three":
			type = Type.THREE;
			break;
		case "two":
			type = Type.TWO;
			break;
		default:
			type = Type.UNSETT;
			break;
		}
		
		switch (inSuit.toLowerCase())
		{
		case "clubs":
			suit = Suit.CLUBS;
			break;
		case "diamonds":
			suit = Suit.DIAMONDS;
			break;
		case "hearts":
			suit = Suit.HEARTS;
			break;
		case "spades":
			suit = Suit.SPADES;
			break;
		default:
			suit = Suit.UNSETS;
			break;		
		}
		
		return new Card(color, type, suit);
	}
}
