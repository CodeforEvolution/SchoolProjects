import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BacktoArrayLists {
	public static void main(String[] args)
	{
		//Activity 6
		ArrayList<String> concert = new ArrayList<String>(8);
		ArrayList<String> waiters = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		
		char again = 'n';
		
		System.out.println("Please type 5 different musical groups: ");
		
		in.useDelimiter("\n");
		for (int i = 0; i < 5; i++)
		{
			concert.add(in.next());
		}
		in.reset();
		
		System.out.println("\nOur initial array: ");
		System.out.println(concert);
		
		Collections.sort(concert);
		System.out.println("\nThe now sorted array: ");
		System.out.println(concert);
		
		do
		{
			int foundIndex = -1;
			String search = "";
			
			System.out.println("\nAAAAAHHH GOOGLE!!!");
			System.out.println("In other words, what musical group would you like to search for?: ");
			
			in.useDelimiter("\n");
			search = in.next();
			in.reset();
			
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
					System.out.println("\n" + search + " is a goner! >:D");
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
				System.out.println("We can't book your group currently..."); 
				System.out.println("Though, we can add them to a waiting list.");
				
				char hmm = ' ';
				do
				{
					System.out.println("Add to the group to the waiting list? (y or n): ");;
					hmm = in.next().toLowerCase().charAt(0);
					
					if (hmm != 'y' && hmm != 'n')
					{
						System.out.println("Whaddya say sir??? Let me here it again...");
					}
				} while (hmm != 'y' && hmm != 'n');
				
				if (hmm == 'y')
				{
					waiters.add(search);
					System.out.println("\n" + search + " added to the waiting list!");
				}
			}
			
			doWaitCheck(concert, waiters);
			
			System.out.println("\nCurrent concerts scheduled: ");
			System.out.println(concert);
			System.out.println("\nConcerts on waiting list: ");
			System.out.println(waiters);
			
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
		
		int multi = 0;
		for (int i = 0; i < concert.size(); i++)
		{
			if (concert.get(i).trim().contains(" ") == true)
			{
				System.out.print(concert.get(i) + " ");
				multi++;
			}
		}
		
		if (multi == 0)
		{
			System.out.println("\nBut there are none...");
		}
		
		//Welp, goodbye!
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
	
	public static void doWaitCheck(ArrayList<String> current, ArrayList<String> waiting)
	{	
		shiftTrimList(current);
		
		if (!waiting.isEmpty())
		{
			for (int i = 0; i < waiting.size(); i++)
			{
				if (waiting.get(i).equals("") == false)
				{
					for (int c = current.size() - 1; c > -1; c--)
					{
						if (current.get(c).equals("") == false)
						{
							current.set(c + 1, waiting.get(i));
							System.out.println("\nTransferred " + waiting.get(i) + " off the waiting list! Welcome!");
						}
					}
				}
			}
		}
		
		return;
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
