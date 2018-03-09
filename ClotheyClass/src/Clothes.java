
public class Clothes {
	
	private String name = "";
	private int amount = 0;
	private String color = "";
	
	public Clothes(String theItem, int howMany)
	{
		name = theItem;
		amount = howMany;
		color = "Black";
	}
	
	public Clothes(String theItem, int howMany, String theColor)
	{
		name = theItem;
		amount = howMany;
		color = theColor;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void addAmount(int amountToAdd)
	{
		amount += amountToAdd;
	}
	
	public void setColor(String newColor)
	{
		color = newColor;
	}

}
