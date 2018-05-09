import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ArrayForString {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> inputStorage = new ArrayList<String>();
		
		System.out.println("Welcome to the concept of strings as arrays!!!");
		System.out.println("If you may, please enter two words! (I know sort of simple...): ");
		inputStorage.add(in.next());
		inputStorage.add(in.next());
		
		System.out.println();
		if (inputStorage.get(0).length() == inputStorage.get(1).length())
		{
			System.out.println("It seems " + inputStorage.get(0) + " is the same length as " + inputStorage.get(1) + ".");
			System.out.println("How about that?!?");
		}
		else if (inputStorage.get(0).length() > inputStorage.get(1).length())
		{
			System.out.println("It seems " + inputStorage.get(0) + " was the longer word!" );
		}
		else
		{
			System.out.println("It seems " + inputStorage.get(1) + " was the longer word!" );
		}
		
		inputStorage.removeAll(inputStorage);
		
		System.out.println("\nNow, enter a whole phrase, please with a cherry on top: ");
		in.useDelimiter("\n");
		inputStorage.add(in.next());
		in.reset();
		
		System.out.println("\nLet's see it backwards, shall we?: ");
		for (int i = inputStorage.get(0).length() - 1; i > -1; i--)
		{
			System.out.print(inputStorage.get(0).charAt(i));
		}
		
		inputStorage.removeAll(inputStorage);
		
		System.out.println("\nAlright, now, I guess just enter another phrase if you will: ");
		in.useDelimiter("\n");
		inputStorage.add(in.next());
		in.reset();
		
		System.out.println("\nNow, let's find all the vowels: ");
		
		
		//For Extension
		HashMap<Character, Integer> hashbrowns = new HashMap<Character, Integer>();
		
		for (int i = 0; i < inputStorage.get(0).length(); i++)
		{
			switch (inputStorage.get(0).toLowerCase().charAt(i))
			{
				case 'a':
					hashbrowns.put('a', hashbrowns.get('a') + 1);
					System.out.print(inputStorage.get(0).charAt(i) + " ");
					break;
				case 'e':
					hashbrowns.put('e', hashbrowns.get('e') + 1);
					System.out.print(inputStorage.get(0).charAt(i) + " ");
					break;
				case 'i':
					hashbrowns.put('i', hashbrowns.get('i') + 1 );
					System.out.print(inputStorage.get(0).charAt(i) + " ");
					break;
				case 'o':
					hashbrowns.put('o', hashbrowns.get('o') + 1);
					System.out.print(inputStorage.get(0).charAt(i) + " ");
					break;
				case 'u':
					hashbrowns.put('u', hashbrowns.get('u') + 1);
					System.out.print(inputStorage.get(0).charAt(i) + " ");
					break;
				default:
					break;
			}

		}
		
		System.out.println("\nNow, how often did we see these vowels?: ");
		System.out.println("A: " + hashbrowns.get('a'));
		System.out.println("E: " + hashbrowns.get('e'));
		System.out.println("I: " + hashbrowns.get('i'));
		System.out.println("O: " + hashbrowns.get('o'));
		System.out.println("U: " + hashbrowns.get('u'));
	}
}
