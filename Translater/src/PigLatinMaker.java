import java.util.ArrayList;
import java.util.Scanner;


public class PigLatinMaker {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String input = "";
		ArrayList<String> splitwords = new ArrayList<String>();
		String pigoutput = "";
		
		System.out.println("Oink, oink! It's the English to Pig Latin Translater!");
		System.out.println("Please enter word or sentence to translate please! : ");
		
		in.useDelimiter("\n");
		input = in.next();
		in.reset();
		
		System.out.println("\nIt's translating time! Let's see...");
		
		int currentIndex = 0;
		String tempword = "";
		boolean more = false;
		do
		{
			
			if (input.charAt(currentIndex) != ' ')
			{
				tempword += input.charAt(currentIndex);
			}
			else
			{
				splitwords.add(tempword);
				tempword = "";
			}
			currentIndex++;
			
			more = true;
			try {
				input.charAt(currentIndex);
			} catch (java.lang.IndexOutOfBoundsException e) {
				more = false;
				splitwords.add(tempword);
				tempword = "";
			}
			
		} while (more == true);
		
		for (int i = 0; i < splitwords.size(); i++)
		{
			System.out.println("\nFound Word: " + splitwords.get(i));
		}

		for (int c = 0; c < splitwords.size(); c++)
		{
			String current = splitwords.get(c);
			
			String pigword = converter(current);
			
			pigoutput += pigword + " ";
		}
		
		System.out.println("\n======================================");
		if (splitwords.size() > 1)
		{
			System.out.println("Your translated sentence is: \n" + pigoutput);
		}
		else
		{
			System.out.println("Your translated word is: \n" + pigoutput);
		}
	}
	
	public static String converter(String englishIn)
	{
		String pigOut = englishIn;
		boolean needsCapital = false;
		
		if (Character.isUpperCase(pigOut.charAt(0)) == true)
		{
			needsCapital = true;
			pigOut = pigOut.toLowerCase();
		}
		
		if (isVowel(pigOut.charAt(0)) == true)
		{
			pigOut += "way";
		}
		else if (pigOut.charAt(0) != 'y' && pigOut.contains("y") == true)
		{
			int ycheck = 0;
			
			for (int i = 0; i < pigOut.indexOf("y"); i++)
			{
				if (isVowel(pigOut.charAt(i)) == false)
				{
					ycheck++;
				}
				else
				{
					continue;
				}
			}
			
			String temp = pigOut.substring(0, ycheck);
			pigOut = pigOut.substring(ycheck);
			pigOut += temp + "ay";
		}
		else if (pigOut.charAt(0) == 'q' && pigOut.charAt(1) == 'u') 
		{
			String temp = pigOut.substring(0, 2);
			pigOut = pigOut.substring(2) + temp + "ay";
		}
		else if (firstVowel(pigOut) < 3)
		{
			int i = 0;
			while ((isVowel(pigOut.charAt(0)) == false) && (i < 3))
			{
				char temp = pigOut.charAt(0);
				pigOut = pigOut.substring(1);
				pigOut += temp;
				i++;
			}
			
			pigOut += "ay";
		}
		else
		{
			pigOut += "way";
		}
		
		if (needsCapital == true)
		{
			char temp = Character.toUpperCase(pigOut.charAt(0));
			pigOut = temp + pigOut.substring(1);
		}
		
		return pigOut;
	}
	
	public static boolean isVowel(char theChar)
	{
		boolean vowel = false;
		
		switch (Character.toLowerCase(theChar))
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel = true;
				break;
			default:
				vowel = false;
				break;
		}
		
		return vowel;
	}
	
	public static int firstVowel(String theString)
	{
		int i = 0;
		boolean vowelFound = false;
		
		while (i < theString.length() && vowelFound == false)
		{
			if (isVowel(theString.charAt(i)) == true)
			{
				vowelFound = true;
			}
			else
			{
				i++;
			}
		}
		
		return i;
	}
	
	
}
