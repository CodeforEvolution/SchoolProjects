import java.util.Random;


public class PigJake {
	static Random r = new Random();
	
	private String name;
	private double weight;
	private String personality;
	private int age;
	
	public PigJake()
	{
		name = "Piggy";
		weight = 0;
		personality = "None";
		age = r.nextInt(20);
	}
	
	public PigJake(String theName, String thePersonality, int theAge)
	{
		name = theName;
		personality = thePersonality;
		age = theAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String getPersonality()
	{
		return personality;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void eat()
	{
		weight += r.nextInt(100);
	}
	
	public void play()
	{
		weight -= r.nextInt(20);
	}
	
	public void party(PigJake playMate)
	{
		String temp = this.personality;
		this.personality = playMate.personality;
		playMate.personality = temp;
		
		this.age++;
		playMate.age++;
	}
	
	public String toString()
	{
		String out = "";
		
		out += "Pig: " + getName();
		out += "\n\tWeight: " + getWeight();
		out += "\n\tPersonality: " + getPersonality();
		out += "\n\tAge: " + getAge();
		
		return out;
	}
	
	
}
