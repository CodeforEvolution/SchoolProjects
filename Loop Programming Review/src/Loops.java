import java.util.Scanner;

/* Loop A
public class Loops {
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 0; i <= 20; i += 2)
		{
			System.out.print(i + "\n");
			sum += i;
		}
		
		System.out.print(sum + "\n");
	}
	
}
*/

/* Loop B
public class Loops {
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 23; i >= 1; i -= 2)
		{
			System.out.print(i + "\n");
			sum += i;
		}
		
		System.out.print(sum + "\n");
	}
	
}
*/

/* Loop C
public class Loops {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int greatest = 0;
		int current = 0;
		
		System.out.print("Enter 6 Integers Please:" + "\n");
		
		for (int i = 0; i < 6; i++)
		{
			current = in.nextInt();
			if (current > greatest)
			{
				greatest = current;
			}
		}
		
		System.out.print("The Greatest Number is: " + greatest);
	}
}
*/

/* Loop D
public class Loops {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean found = false;
		double sum = 0.0;
		int count = 0;
		int current = 0;
		double average = 0.0;
		
		do
		{
			System.out.print("Enter a Number Please!" + "\n");
			current = in.nextInt();
			if (current == -99)
			{
				found = true;
			} else {
				sum += current;
				count++;
			}
		} while (found == false);
		
		System.out.print("Sum = " + sum + "\n");
		
		average = sum / count;
		System.out.print("Average = " + average + "\n");
	}
}
*/

/* Loop E
public class Loops {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		char currentChar;
		int currentInt = 0;
		
		System.out.print("Enter a Character and Integer in Order Please!" + "\n");
		currentChar = in.next().charAt(0);
		currentInt = in.nextInt();
		
		for (int i = 0; i < currentInt ; i++)
			System.out.print(currentChar);
		
		System.out.print("\n");
		
		for (int i = 0; i < currentInt ; i++)
			System.out.print(currentChar + "\n");
	}
}
*/

/* Loop F
public class Loops {
	public static void main(String[] args)
	{
		char theChar = 'E';
		
		for (int i = 0; i < 8; i++)
			System.out.print(theChar);
		
		System.out.print("\n");
		
		for (int i = 0; i < 5 ; i++)
			System.out.print(theChar + "\n");
		
		for (int i = 0; i < 8; i++)
			System.out.print(theChar);
		
		System.out.print("\n");
		
		for (int i = 0; i < 5 ; i++)
			System.out.print(theChar + "\n");
		
		for (int i = 0; i < 8; i++)
			System.out.print(theChar);
	}
}
*/
