import java.util.Random;


public class Card {
	enum Suit
	{HEARTS, DIAMONDS, CLUBS, SPADES, UNSETS}
	
	enum Type
	{TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, UNSETT}
	
	enum CColor
	{RED, BLACK, UNSETC}
	
	private Suit ourSuit = Suit.UNSETS;
	private Type ourType = Type.UNSETT;
	private CColor ourColor = CColor.UNSETC;
	
	private Random r = new Random();
	
	//Generates Randomly
	public Card()
	{
		int suitIndex = r.nextInt(4) + 1;
		int typeIndex = r.nextInt(13) + 1;
		
		ourSuit = Suit.valueOf(Integer.toString(suitIndex));
		ourType = Type.valueOf(Integer.toString(typeIndex));
	}
	
	//Sets Card Directly
	public Card(CColor theColor, Type theType, Suit theSuit)
	{
		ourSuit = theSuit;
		ourType = theType;
		ourColor = theColor;
	}
	
	
	
	public String toString()
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
}
