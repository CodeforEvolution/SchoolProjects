import java.util.Scanner;


public class PigLatinMaker {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word = "";
		String pigword = "";
		boolean ycheck = false;
		
		System.out.println("Oink, oink! It's the English to Pig Latin Translater!");
		System.out.println("What word would you like to translate?: ");
		word = in.next();
		
		System.out.println("\nIt's translating time! Let's see...");
		
		pigword = word;
		
		if (pigword.charAt(0) != 'y' && pigword.charAt(0))
		{
			for (int i = 0; i < pigword.length(); i++)
			{
				if (pigword.charAt(i) == 'y')
				{
					
				}
			}
		}
		
		if (isVowel(pigword.charAt(0)) == true)
		{
			pigword += "way";
		}
		else if (ycheck == true)
		{
			String 
		}
		else if (pigword.charAt(0) == 'q' && pigword.charAt(1) == 'u') 
		{
			String temp = pigword.substring(0, 2);
			pigword = pigword.substring(2) + temp + "ay";
		}
		else if (isVowel(word.charAt(0)) == false && isVowel(word.charAt(1)) == false
					&& isVowel(word.charAt(2)) == false && isVowel(word.charAt(3)) == true)
		{
			int i = 0;
			while (isVowel(word.charAt(i)) == false && i < 3)
			{
				char temp = pigword.charAt(0);
				pigword = pigword.substring(1);
				pigword += temp;
				i++;
			}
			
			pigword += "ay";
		}
		else
		{
			pigword += "way";
		}
		
		System.out.println("\nYour translated word is: " + pigword);
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
