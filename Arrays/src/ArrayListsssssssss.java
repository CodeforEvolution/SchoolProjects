import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//ArrayList Program 1 - Integers
//public class ArrayListsssssssss {
//	public static void main(String[] args)
//	{
//		Random r = new Random();
//		Scanner in = new Scanner(System.in);
//		int input = 0;
//		
//		//Step 1
//		ArrayList<Integer> numberz = new ArrayList<Integer>();
//		
//		//Step 2
//		numberz.add(30);
//		numberz.add(50);
//		numberz.add(35);
//		numberz.add(55);
//		System.out.println(numberz);
//		
//		//Step 3
//		numberz.set(3, 99);
//		System.out.println(numberz);
//		
//		//Step 4
//		numberz.set(1, 100);
//		System.out.println(numberz);
//		
//		//Step 5
//		do
//		{
//			System.out.println("Please enter a number from 3 to 5: ");
//			input = in.nextInt();
//			
//			if (input > 5 || input < 3)
//			{
//				System.out.println("But, I just told you the range of numbers! D:");
//				System.out.println("Let's try this again...");
//			}
//		} while (input > 5 || input < 3);
//		
//		
//		int lowerbound = 20;
//		int upperbound = 100;
//		for (int i = input; i > 0; i--)
//		{
//			numberz.add(r.nextInt(upperbound-lowerbound) + lowerbound);
//		}
//		System.out.println(numberz);
//		
//		//Step 6
//		int count = 0;
//		do
//		{
//			if (numberz.get(count) % 2 == 0)
//			{
//				numberz.remove(count);
//			} else {
//				count++;
//			}
//		} while (numberz.size() > count);
//		System.out.println(numberz);
//		
//		//Step 7
//		int temp = numberz.get(numberz.size() - 1);
//		numberz.set(numberz.size() - 1, numberz.get(0));
//		numberz.set(0, temp);
//		System.out.println(numberz);	
//	}
//}

//ArrayList Program 2 - Strings
public class ArrayListsssssssss {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Step 1
		ArrayList <String> animals = new ArrayList <String> ();
		
		//Step 2
		animals.add("Penguin");
		animals.add("Koala");
		animals.add("Dog");
		animals.add("Wallaby");
		System.out.println(animals);
		
		//Step 3
		System.out.println("Please type two animals to add to the array! :D : ");
		animals.add(0, in.next());
		animals.add(0, in.next());
		System.out.println(animals);
		
		//Step 4
		int count = 0;
		String shortest = animals.get(count);
		do
		{
			if (animals.get(count).length() < shortest.length())
			{
				shortest = animals.get(count);
			}
			count++;
		} while (animals.size() > count);	
		animals.set(animals.indexOf(shortest), "Skunk");
		System.out.println(animals);
		
		//Step 5
		System.out.println();
		System.out.println("Array Searcher time!");
		
		char again = 'n';
		String search = "";
		do
		{
			System.out.println();
			System.out.println("Type an animal you'd like to find in the array! (Is Case-sensitive): ");
			search = in.next();
			System.out.println();
			System.out.println("Searching for " + search + ".");
			
			if (animals.contains(search))
			{
				System.out.println("Found " + search + " at index " + animals.indexOf(search) + "!");
				System.out.println("Would you like to remove this animal from the list? (y or n): ");
				if (in.next().charAt(0) == 'y')
				{
					System.out.println("Say goodbye to the " + search + "!");
					animals.remove(search);
					System.out.println(animals);
				} else {
					System.out.println("It seems the " + search + " will live another day...");
				}
				
				
			} else {
				System.out.println("Can't find your animal...");
				System.out.println("Adding "  + search + " to the list! Because why not?");
				animals.add(search);
				System.out.println();
			}
			
			System.out.println("Would you like to search...again? (y or n): ");
			again = in.next().charAt(0);
		} while (again == 'y');
		
		System.out.println("Thank you for searching! :D");
		System.out.println();
		
		//Step 6
		System.out.println("Have some first letters!");
		for (int i = 0; i < animals.size(); i++)
		{
			System.out.print(animals.get(i).charAt(0) + " ");
		}
		System.out.println();
		
		//Accelerated
		System.out.println("Now, have some last letters!");
		for (int i = 0; i < animals.size(); i++)
		{
			System.out.print(animals.get(i).charAt(animals.get(i).length() - 1) + " ");
		}
		System.out.println();
		
		//Challenge
		for (int i = 0; i < animals.size(); i++)
		{
			System.out.println("Finding vowels in " + animals.get(i) + "!");
			System.out.print("\t");
			for (int c = 0; c < animals.get(i).length(); c++)
			{
				if (isVowel(animals.get(i).charAt(c)))
				{
					System.out.print(animals.get(i).charAt(c) + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Thank you for using my program!");
		
	}
	
	public static boolean isVowel(char character)
	{
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
		{
			return true;
		} else {
			return false;
		}
	}
}
