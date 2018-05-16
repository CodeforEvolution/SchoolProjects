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
		System.out.println("Enter word or sentence to translate please! : ");
		
		input = in.next();
		
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
			}
			
		} while (more == true);
		
		System.out.println(splitwords);
		
		for (int i = 0; i < splitwords.size(); i++)
		{
			System.out.println("word: " + splitwords.get(i));
		}

		for (int c = 0; c < splitwords.size(); c++)
		{
			String current = splitwords.get(c);
			
			if (isVowel(current.charAt(0)) == true)
			{
				current += "way";
			}
			else if (current.charAt(0) != 'y' && current.contains("y") == true)
			{
				int ycheck = 0;
				
				for (int i = 0; i < current.indexOf("y"); i++)
				{
					if (isVowel(current.charAt(i)) == false)
					{
						ycheck++;
					}
					else
					{
						continue;
					}
				}
				
				String temp = current.substring(0, ycheck);
				current = current.substring(ycheck);
				current += temp + "ay";
			}
			else if (current.charAt(0) == 'q' && current.charAt(1) == 'u') 
			{
				String temp = current.substring(0, 2);
				current = current.substring(2) + temp + "ay";
			}
			else if (isVowel(input.charAt(0)) == false /*&& isVowel(word.charAt(1)) == false
						&& isVowel(word.charAt(2)) == false && isVowel(word.charAt(3)) == true*/)
			{
				int i = 0;
				while (isVowel(input.charAt(i)) == false && i < 3)
				{
					char temp = current.charAt(0);
					current = current.substring(1);
					current += temp;
					i++;
				}
				
				current += "ay";
			}
			else
			{
				current += "way";
			}
			
			pigoutput += current + " ";
		}
		
		System.out.println("\nYour translated word/sentence is: " + pigoutput);
	}
	
	public static boolean isVowel(char theChar)
	{
		boolean vowel = false;
		
		switch (theChar)
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
}
