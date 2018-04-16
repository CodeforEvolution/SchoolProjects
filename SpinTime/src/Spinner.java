import java.util.Random;


public class Spinner {
	private static int currentSpin = 0;
	private static String currentColor = "";
	
	public Spinner(int number)
	{	
		currentSpin = number;
		currentColor = getColorFromSpin(currentSpin);
		
	}
	
	public void spinIt()
	{
		Random r = new Random();
		
		currentSpin = r.nextInt(9) + 1;
		currentColor = getColorFromSpin(currentSpin);
		
		
	}
	
	public String getColorFromSpin(int spin)
	{
		String theColor = "";
		
		switch (spin)
		{
			case 1:
			case 2:
			case 3:
				theColor = "Red";
				break;
			case 4:
			case 5:
			case 9:
				theColor = "Yellow";
				break;
			case 6:
			case 7:
			case 8:
				theColor = "Green";
				break;
			default:
				theColor = "Error";
				break;
		}
		
		return theColor;
	}
	
	public String getColor()
	{
		return currentColor;
	}
	
	public int getNumber()
	{
		return currentSpin;
	}
	
	public String getEvenOdd()
	{
		if (currentSpin % 2 == 0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
	}
	
	public String toString()
	{
		String outStr = "";
		
		outStr += "Spin: " + currentSpin + "  ";
		outStr += "Color: " + currentColor;
		
		return outStr;
	}
}
