import java.util.ArrayList;
import java.util.Scanner;


public class PigLatinMaker {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word = "";
		String pigword = "";
		
		System.out.println("Oink, oink! It's the English to Pig Latin Translater!");
		System.out.println("What word would you like to translate?: ");
		word = in.next();
		
		System.out.println("\nIt's translating time! Let's see...");
		
		pigword = word;
		
		if (isVowel(pigword.charAt(0)) == true)
		{
			pigword += "way";
		}
		else if (isVowel(word.charAt(0)) == false)
		{
			int i = 0;
			while (isVowel(word.charAt(i)) == false && i < 3)
			{
				char temp = pigword.charAt(i);
				pigword = pigword.substring(i + 1);
				pigword += temp;
				i++;
			}
			
			pigword += "ay";
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
