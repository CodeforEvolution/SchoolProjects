import java.util.Scanner;

/* Histogram 1
public class Histograms {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int currentNumber = 0;
		char printerChar = '*';
		
		System.out.print("Please type 4 Integers in the Range of 0-5: ");

		for(int i = 0; i < 4; i++)
		{
			currentNumber = in.nextInt();
			for (int c = 0; c < currentNumber; c++)
			{
				System.out.print(printerChar + " ");
			}
			System.out.print("\n");
		}
	}
}
*/


public class Histograms {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int currentNumber = 0;
		char printerChar = '*';
		char column1[] = new char[6];
		char column2[] = new char[6];
		char column3[] = new char[6];
		char column4[] = new char[6];

		System.out.print("Please type 4 Integers in the Range of 0-5: ");

		currentNumber = in.nextInt();
		for (int c = 0; c < currentNumber; c++)
		{
			column1[c] = printerChar;
		}
		
		currentNumber = in.nextInt();
		for (int c = 0; c < currentNumber; c++)
		{
			column2[c] = printerChar;
		}
			
		currentNumber = in.nextInt();
		for (int c = 0; c < currentNumber; c++)
		{
			column3[c] = printerChar;
		}
			
		currentNumber = in.nextInt();
		for (int c = 0; c < currentNumber; c++)
		{
			column4[c] = printerChar;
		}
			
		for (int i = 4; i >= 0; i--)
		{
			System.out.print(column1[i]);
			System.out.print(column2[i]);
			System.out.print(column3[i]);
			System.out.print(column4[i]);

			System.out.print("\n");
		}
	}
}

