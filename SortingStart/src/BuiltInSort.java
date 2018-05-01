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
		
		Arrays.sort(friends);
		
		System.out.println("\nHere is your name array sorted: ");
		System.out.println(Arrays.toString(friends));
		
		
		do
		{
			String name = "";
			int foundIndex = -1;
			
			System.out.println("\nWelcome to the even newer Google! (For arrays...)");
			System.out.println("Please enter a name to find in the array: ");
			name = in.next();
			
			System.out.println("\nSearching!!");
			
			for (int i = 0; i < friends.length; i++)
			{
				if (friends[i] == name)
				{
					foundIndex = i;
					break;
				}
			}
			
			if (foundIndex != -1)
			{
				System.out.println("Found " + name + " at index " + foundIndex);
			}
			else
			{
				System.out.println("Couldn't find " + name + "! :(");
				System.out.println("Would you like to add " + name + " to the array?");
			}
			
		} while (full == false && again == 'y');
	}
}
