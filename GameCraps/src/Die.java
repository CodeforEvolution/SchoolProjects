import java.util.Random;

public class Die {
	private Random r;
	private int value;
	
	public Die()
	{
		r = new Random();
		value = 0;
	}
	
	public void roll()
	{
		value = r.nextInt(6) + 1;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public int add(Die dieToAdd)
	{
		return this.getValue() + dieToAdd.getValue();
	}
	
	public String toString()
	{
		return Integer.toString(getValue());
	}
	
}
