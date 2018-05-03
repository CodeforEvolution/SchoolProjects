import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BacktoArrayLists {
	public static void main(String[] args)
	{
		//Activity 6
		ArrayList<String> concert = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		
		char again = 'n';
		
		concert.add("Woodwinds");
		concert.add("Percussion");
		concert.add("Trombones");
		concert.add("Clarinets");
		concert.add("Trumpets");
		
		System.out.println("Our initial array: ");
		System.out.println(concert);
		
		Collections.sort(concert);
		System.out.println("\nThe now sorted array: ");
		System.out.println(concert);
		
		do
		{
			boolean found = false;
			int foundIndex = -1;
			String search = "";
			
			System.out.println("AAAAAHHH GOOGLE!!!");
			System.out.println("In other words, what musical group would you like to search for?: ");
			search = in.next();
			
			System.out.println("\nSearching.....searching...zzzzzzz...wha, what?!? Oh, searching...");
			for (int i = 0; i < concert.size(); i++)
			{
				if (concert.get(i).equals(search) == true)
				{
					foundIndex = i;
					break;
				}
			}
			
			if (foundIndex != -1)
			{
				System.out.println("Found it!!!!");
				System.out.println("Your musical group, " + search + " is at index " + foundIndex + "!");
				
				char hmm = ' ';
				do
				{
					System.out.println("\nWould you like to be dirty and remove this group? :) (y or n): ");
					hmm = in.next().toLowerCase().charAt(0);
					
					if (hmm != 'y' && hmm != 'n')
					{
						System.out.println("Whaddya say sir??? Let me here it again...");
					}
				} while (hmm != 'y' && hmm != 'n');
				
				if (hmm == 'y')
				{
					concert.remove(foundIndex);
					System.out.println("\n" + search + " added in to schedule!");
				}
			}
			else if (isArrayFull(concert) == false)
			{
				System.out.println("Could not find the musical group: " + search);
				
				char hmm = ' ';
				do
				{
					System.out.println("\nWould you like to book and schedule this group? (y or n): ");
					hmm = in.next().toLowerCase().charAt(0);
					
					if (hmm != 'y' && hmm != 'n')
					{
						System.out.println("Whaddya say sir??? Let me here it again...");
					}
				} while (hmm != 'y' && hmm != 'n');
				
				if (hmm == 'y')
				{
					concert.add(search);
					System.out.println("\n" + search + " added in to schedule!");
				}
			}
			else
			{
				System.out.println("Could not find the musical group: " + search);
				System.out.println("Annnndddd our concert schedule is full, sorry about that :(");
			}
			
	
			do
			{
				System.out.println("\nWell, would you like to continue searching? (y or n): ");
				again = in.next().toLowerCase().charAt(0);
				
				if (again != 'y' && again != 'n')
				{
					System.out.println("That's not a yes or no, I'll ask again...\n");
				}
			} while (again != 'y' && again != 'n');
		} while (isArrayFull(concert) == false && again == 'y');
		
		System.out.println("Thank you for searching!!!!\n");
		
		System.out.println("The cooler musical groups always have multi-word names!!!!: ");
		
		for (int i = 0; i < concert.size(); i++)
		{
			if (concert.get(i).contains(" ") == true)
			{
				System.out.print(concert.get(i) + " ");
			}
		}
	}
	
	public static <T> boolean isArrayFull(ArrayList<T> thearray)
	{
		boolean arrayfull = true;
		
		for(int i = 0; i < thearray.size(); i++)
		{
			if (thearray.get(i) != null)
			{
				arrayfull = false;
			}
		}
		
		return arrayfull;
	}
}
