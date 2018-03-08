import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Int Arrays
public class MoreArrays {
	public static void main (String[] args)
	{
		int[] firstInt = new int[5];
		int[] secondInt = new int[5];
		int[] sumInt = new int[5];
		int[] largerInt = new int[5];
		int [] combineInt = new int[15];
		int combinePos = 0;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		//Step (a
		for (int i = 0; i < firstInt.length; i++)
		{
			firstInt[i] = r.nextInt(51);
		}
		printArray(firstInt, false);
		
		//Step (b
		for (int i = 0; i < secondInt.length; i++)
		{
			System.out.println("Please enter a number to go into slot " + i + " of the array: ");
			secondInt[i] = in.nextInt();
		}
		printArray(secondInt, false);
		
		//Step (c
		System.out.println("Printing Index Sum Pairs:");
		for (int i = 0; i < sumInt.length; i++)
		{
			sumInt[i] = firstInt[i] + secondInt[i];
		}
		printArray(sumInt, false);
		
		//Step (d
		System.out.println("Printing Larger of 2 Index Pairs:");
		for (int i = 0; i < largerInt.length; i++)
		{
			if (firstInt[i] > secondInt[i])
			{
				largerInt[i] = firstInt[i];
			} else if (secondInt[i] > firstInt[i]){
				largerInt[i] = secondInt[i];
			} else {
				largerInt[i] = firstInt[i];
			}
		}
		printArray(largerInt, false);
		
		//Step (e
		System.out.println("Time for a massive array!");
		
		combinePos = 0;
		for (int i = 0; i < 5; i++)
		{
			combineInt[combinePos] = firstInt[i];
			combinePos++;
		}
		
		for (int i = 0; i < 5; i++)
		{
			combineInt[combinePos] = secondInt[i];
			combinePos++;
		}
		
		for (int i = 0; i < 5; i++)
		{
			combineInt[combinePos] = sumInt[i];
			combinePos++;
		}
		
		printArray(combineInt, false);
		printArray(combineInt, true);

				
	}
	
	
	public static void printArray(int[] array, boolean backwards)
	{
		if (backwards == false)
		{
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = array.length - 1; i >= 0; i--)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
			
	}
}
*/

public class MoreArrays {
	public static void main (String[] args)
	{
		String[] food = new String[6];
		Scanner in = new Scanner(System.in);
		
		
		//Step a)
		for (int i = 0; i < food.length; i++)
		{
			System.out.println("Please enter a type of food to go into the array at index " + i + ": ");
			food[i] = in.next();
		}
		printArray(food, false);
		
		//Step b)
		for (int i = 0; i < food.length; i++)
		{
			if (food[i].compareTo("noodles") < 0)
			{
				System.out.print(food[i] + " ");
			}
		}
		System.out.println();
		
		//Step c)
		for (int i = 0; i < food.length; i++)
		{
			if (food[i].length() > 6)
			{
				System.out.print(food[i] + " ");
			}
		}
		System.out.println();
		
		//Step d)
		for (int i = 0; i < food.length; i++)
		{
			System.out.print(food[i].charAt(food[i].length() - 1) + " ");
		}
		System.out.println();
		
		//Step e)
		boolean found = false;
		int foundIndex = 0;
		String searchFor = "";
		String backwards = "";
		System.out.println("\nIt's the all new Google!...for arrays....");
		System.out.print("Enter a food to search for in the array (Don't use spaces please): ");
		searchFor = in.next();
		
		System.out.println("\nSearching for: " + searchFor);
		
		for (int i = 0; i < food.length; i++)
		{
			if (found == true)
				break;
			
			if (searchFor.equals(food[i]))
			{
				found = true;
				foundIndex = i;
			}
		}
		
		if (found == true)
		{
			//Bonus 
			for (int i = searchFor.length() -1 ; i > -1; i--)
			{
				backwards += searchFor.charAt(i);
			}
			//End Bonus
			
			System.out.println("HOORAYYYYY!! We found your character at index " + foundIndex + " in the array!");
			System.out.println("It's " + backwards + "! (Your food is coming back to you...in reverse order?)");
		} else {
			System.out.println("Sorry, but no matches found.");
		}
		
		//Super Double Bonus
		String[] reverseFood = new String[food.length];
		
		System.out.println("All the foods are coming back to you! (Backwards...just, why?)");
		
		for (int f = 0; f < food.length; f++)
		{
			reverseFood[f] = "";
			for (int i = food[f].length() -1 ; i > -1; i--)
			{
				reverseFood[f] += food[f].charAt(i);
			}
		}
		printArray(reverseFood, false);
	}
	
	
	public static void printArray(String[] array, boolean backwards)
	{				
		if (backwards == false)
		{
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = array.length - 1; i >= 0; i--)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
			
	}
}
