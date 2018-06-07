import java.util.ArrayList;
import java.util.Scanner;


public class ButtonArrayJake7 {
	public static void main(String[] args)
	{
		ArrayList<Character> buttons = new ArrayList<Character>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter any characters seperated by spaces, then press enter: ");
		in.useDelimiter("\n");
		String input = in.next();
		in.reset();
		
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) != ' ')
			{
				buttons.add(input.charAt(i));
			}
		}
		
		System.out.println("The inputed array: ");
		System.out.println(buttons);
		
		buttons.add(0, '+');
		
		double middle = Math.floor(buttons.size() / 2) + 1;
		
		buttons.add((int)middle, '?');
		
		char temp = buttons.get(1);
		buttons.set(1, buttons.get(buttons.size() - 1));
		buttons.set(buttons.get(buttons.size() - 1), temp);
		
		for (int i = 0; i < buttons.size(); i++)
		{
			if (buttons.get(i) == Character.toLowerCase('a') || buttons.get(i) == Character.toLowerCase('e') ||
					buttons.get(i) == Character.toLowerCase('i') || buttons.get(i) == Character.toLowerCase('o') ||
					Character.toLowerCase(buttons.get(i)) == 'u')
			{
				buttons.set(i, 'V');
			}
		}
		
		System.out.println("New Array: ");
		System.out.println(buttons);
	}
}
