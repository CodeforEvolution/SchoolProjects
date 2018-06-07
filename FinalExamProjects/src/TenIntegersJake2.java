import java.util.Arrays;
import java.util.Random;


public class TenIntegersJake2 {
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] numerals = new int[10];
		double average = 0.0;
		double median = 0.0;
		int evens = 0;
		
		for (int i = 0; i < numerals.length; i++)
		{
			numerals[i] = r.nextInt(100) - r.nextInt(100);
		}
		
		System.out.println("Your array: ");
		for (int i = 0; i < numerals.length; i++)
		{
			System.out.print(numerals[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("Negative Numbers Only Now: ");
		for (int i = 0; i < numerals.length; i++)
		{
			if (numerals[i] < 0)
				System.out.print(numerals[i] + " ");
		}
		System.out.println("\n");
		
		System.out.print("Number of even Integers: ");
		for (int i = 0; i < numerals.length; i++)
		{
			if (numerals[i] % 2 == 0)
				evens++;
		}
		System.out.println(evens + "\n");
		
		for (int i = 0; i < numerals.length; i++)
		{
			average += numerals[i];
		}
		average /= numerals.length;
		
		System.out.println("The average: " + average + "\n");
		
		System.out.println("The numbers above average: ");
		for (int i = 0; i < numerals.length; i++)
		{
			if (numerals[i] > average)
				System.out.print(numerals[i] + " ");
		}
		System.out.println("\n");
		
		Arrays.sort(numerals);
		
		System.out.println("The now sorted array: ");
		for (int i = 0; i < numerals.length; i++)
		{
			System.out.print(numerals[i] + " ");
		}
		System.out.println("\n");
		
		median = (numerals[(numerals.length / 2) - 1] + numerals[(numerals.length / 2)]) / 2;
		
		System.out.println("Median of the array: " + median + "\n");
		
		int indexOne = r.nextInt(numerals.length);
		int indexTwo = r.nextInt(numerals.length);
		
		int temp = numerals[indexOne];
		numerals[indexOne] = numerals[indexTwo];
		numerals[indexTwo] = temp;
		
		System.out.println("Final array: ");
		for (int i = 0; i < numerals.length; i++)
		{
			System.out.print(numerals[i] + " ");
		}
		System.out.println("\n");
	}
}
