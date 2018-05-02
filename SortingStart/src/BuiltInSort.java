import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class BuiltInSort {
	public static void main(String[] args)
	{
		/*Activity 4
		Random r = new Random();
		double[] trouble = new double[9];
		
		for (int i = 0; i < trouble.length; i++)
		{
			trouble[i] = r.nextDouble();
		}

		System.out.println("The current array: ");
		System.out.println(Arrays.toString(trouble));
		
		Arrays.sort(trouble);
		System.out.println("\nIntroducing your sorted array: ");
		System.out.println(Arrays.toString(trouble));
		
		for (int i = trouble.length - 1; i >= 0; i--)
		{
			System.out.print(trouble[i] + " ");
		}
		
		for (int i = 0; i < trouble.length; i++)
		{
			trouble[i] = r.nextDouble();
		}
		
		Arrays.sort(trouble, 0, 2);
		Arrays.sort(trouble, 3, 5);
		Arrays.sort(trouble, 6, 8);
		
		System.out.println("\nHere is your odd sorted array: ");
		System.out.println(Arrays.toString(trouble));
		*/
		
		//Activity 5
		boolean full = false;
		char again = 'n';
		String friends[] = new String[7];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 4 friend names: ");
		
		for (int i = 0; i < 4; i++)
		{
			friends[i] = in.next();
		}
		
		System.out.println("\nHere is your name array: ");
		System.out.println(Arrays.toString(friends));
		
		Arrays.sort(friends, 0, 3);
		
		System.out.println("\nHere is your name array sorted: ");
		System.out.println(Arrays.toString(friends));
		
		
		do
		{
			String name = "";
			int currentIndex = 0;
			int foundIndex = -1;
			
			System.out.println("\nWelcome to the even newer Google! (For arrays...)");
			System.out.println("Please enter a name to find in the array: ");
			name = in.next().toLowerCase();
			
			System.out.println("\nSearching!!");
			
			while (friends[currentIndex] != null)
			{
				if (friends[currentIndex].equals(name) == true)
				{
					foundIndex = currentIndex;
					break;
				}
				else
				{
					currentIndex++;
				}
			}
			
			if (foundIndex != -1)
			{
				System.out.println("Found " + name + " at index " + foundIndex);
			}
			else if (isArrayFull(friends) != true)
			{
				System.out.println("\nCouldn't find " + name + "! :(");
				
				boolean valid = false;
				String response = "";
				do
				{
					System.out.println("Would you like to add " + name + " to the array? (yes or no): ");
					response = in.next().toLowerCase();
					
					if (response.equals("yes") || response.equals("no"))
					{
						valid = true;
					}
					else
					{
						System.out.println("\nThat was not a yes or no, GASP!");
						System.out.println("I'll just ask again...");
					}
				} while (valid == false);
				
				if (in.next().equalsIgnoreCase("yes"))
				{
					friends[nextOpenIndex(friends)] = name;
				}
			}
			else
			{
				System.out.println("\nCouldn't find " + name + " in the array! D:");
			}
			
			System.out.println("Would you like to continue searching? (y or n): ");
			again = in.next().toLowerCase().charAt(0);
			
			if (again == 'y')
			{
				System.out.println("\nHere we go again!!!\n");
			}
			
		} while (again == 'y');
		
		System.out.println("\nThank you for using me!!");
	}
	
	public static boolean isArrayFull(String[] thearray)
	{
		boolean arrayfull = true;
		
		for(int i = 0; i < thearray.length; i++)
		{
			if (thearray[i] != null)
			{
				arrayfull = false;
			}
		}
		
		return arrayfull;
	}
	
	public static int nextOpenIndex(String[] thearray)
	{
		int nextIndex = 0;
		
		while (thearray[nextIndex].isEmpty() == false)
			nextIndex++;
		
		return nextIndex;
	}
}
