import java.util.Scanner;


public class PhoneNumbersJake6 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word = "";
		String number = "";
		
		System.out.println("You will enter a word for a phone number, type 'end' when done entering words.");
		
		while (true)
		{
			boolean valid = false;
			
			do
			{
				System.out.println("\nEnter a word to look up please: ");
				word = in.next().toLowerCase();
				
				if (word.equals("end"))
				{
					return;
				}
				else if (word.length() == 7 && word.contains("q") == false && word.contains("z") == false)
				{
					valid = true;
				}
				else
				{
					System.out.println("That's not a valid number, try again...");
					valid = false;
				}
			} while (valid == false);
			
			char[] split = word.toCharArray();
			
			for (int i = 0; i < split.length; i++)
			{
				if (i == 3)
				{
					number += "-";
				}
				
				switch (split[i])
				{
					case 'a':
					case 'b':
					case 'c':
						number += "2";
						break;
					case 'd':
					case 'e':
					case 'f':
						number += "3";
						break;
					case 'g':
					case 'h':
					case 'i':
						number += "4";
						break;
					case 'j':
					case 'k':
					case 'l':
						number += "5";
						break;
					case 'm':
					case 'n':
					case 'o':
						number += "6";
						break;
					case 'p':
					case 'r':
					case 's':
						number += "7";
						break;
					case 't':
					case 'u':
					case 'v':
						number += "8";
						break;
					case 'w':
					case 'x':
					case 'y':
						number += "9";
						break;
					default:
						System.out.println("\nSomething is here that shouldn't be...\n");
						break;
				}
			}
			
			System.out.println("\nYour number has been found: " + number);
		}
		
	}
}
