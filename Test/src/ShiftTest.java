import java.util.ArrayList;


public class ShiftTest {
	public static void main(String[] args)
	{
		ArrayList<String> test = new ArrayList<String>(10);
		
		test.add("Help");
		test.add("Cake");
		test.add("Lake");
		test.add("Jake");
		test.add("Main");
		test.add("Insane");
		test.add("My brain");
		test.add("Hey");
		test.add("Test");
		test.add("Best");
		test.trimToSize()
	
		System.out.println("Array Full: " + isArrayFull(test));
	}
	
	public static <T> boolean isArrayFull(ArrayList<T> thearray)
	{
		boolean arrayfull = true;
		
		for (int i = 0; i < thearray.size(); i++)
		{
			if (thearray.get(i).equals("") || thearray.get(i).equals(null));
			{
				arrayfull = false;
			}
		}
		
		return arrayfull;
	}
}
