import java.util.ArrayList;


public class ShiftTest {
	public static void main(String[] args)
	{
		ArrayList<String> test = new ArrayList<String>();
		
		test.add("Help");
		test.add("");
		test.add("Cake");
		test.add("Lake");
		
		System.out.println("Old: ");
		System.out.println(test);
		
		shiftTrimList(test);
		
		System.out.println("New: ");
		System.out.println(test);
	}
	
	public static void shiftTrimList(ArrayList<String> theList)
	{
		for (int i = 1; i < theList.size(); i++)
		{
			if (theList.get(i - 1).equals("") == true)
			{
				theList.set(i - 1, theList.get(i));
				theList.set(i, "");
			}
		}
		
		theList.trimToSize();
	}
}
