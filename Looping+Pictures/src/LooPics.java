import java.util.Scanner;

/* 1st
public class LooPics {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int columns = 0;
		int rows = 0;
		char printerChar = '*';
		
		System.out.print("Please Enter 2 Integers, ");
		System.out.print("1 for rows and 1 for columns: ");
		rows = in.nextInt();
		columns = in.nextInt();
		
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < columns; c++)
			{
				System.out.print(printerChar);
			}
			
			System.out.print("\n");
		}
	}
}
*/

/* 2nd
public class LooPics {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int leNumber = 0;
		int countUp = 1;
		char printerChar = ' ';
		
		System.out.print("Please Enter an Integer and a Character: ");
		leNumber = in.nextInt();
		printerChar = in.next().charAt(0);
		
		for (int i = 0; i < leNumber; i++)
		{
			for (int p = 0; p < countUp; p++)
				System.out.print(printerChar);
			System.out.print("\n");
			countUp++;
		}
	}
}
*/

/* 3rd
public class LooPics {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int leNumber = 0;
		int countUp = 0;
		char printerChar = ' ';
		
		System.out.print("Please Enter an Integer and a Character: ");
		leNumber = in.nextInt();
		countUp = leNumber;
		printerChar = in.next().charAt(0);
		
		for (int i = 0; i < leNumber; i++)
		{
			for (int p = 0; p < countUp; p++)
				System.out.print(" ");
			System.out.print(printerChar);
			System.out.print("\n");
			countUp--;
		}
	}
}
*/

public class LooPics {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean even = false;
		boolean extra = false;
		int leNumber = 0;
		int countUpA = 0;
		double countUpB = 0;
		double halfWay = 0;
		char printerChar = ' ';
		
		System.out.print("Please Enter an Integer Greater than 2 and a Character: ");
		leNumber = in.nextInt();
		printerChar = in.next().charAt(0);
		
		if ( leNumber % 2 == 0 )
			even = true;
		
		if (even == true)
		{
			System.out.print("Use the extra? (Enter as a Boolean): ");
			extra = in.nextBoolean();
			
			if (extra == false)
			{
				countUpB = leNumber;
				
				for (int i = 0; i < leNumber; i++)
				{
					for (int p = 0; p < countUpA; p++)
						System.out.print(" ");
					System.out.print(printerChar);
					countUpA++;
					
					for (int p = 0; p < (countUpB - 1); p++)
						System.out.print("  ");
					System.out.print(printerChar);
					countUpB--;
				
					System.out.print("\n");
				}
			} else {
				countUpA = 0;
				halfWay = leNumber / 2;
				countUpB = halfWay;
				
				for (int i = 0; i < halfWay; i++)
				{
					for (int p = 0; p < countUpA; p++)
					{
						System.out.print(" ");
					}
					System.out.print(printerChar);
					countUpA++;
					
					for (int p = 0; p < (countUpB - 1); p++)
					{
						System.out.print("  ");
					}
					System.out.print(printerChar);
					countUpB--;
				
					System.out.print("\n");
				}
				
				countUpA = 0;
				halfWay = leNumber / 2;
				countUpB = halfWay;
				
				for (int i = 0; i < halfWay; i++)
				{
					for (int p = 0; p < (countUpB - 1); p++)
					{
						System.out.print(" ");
					}
					System.out.print(printerChar);
					countUpB--;
					
					for (int p = 0; p < countUpA; p++)
					{
						System.out.print("  ");
					}
					System.out.print(printerChar);
					countUpA++;
				
					System.out.print("\n");
				}
			}
		} else {
			halfWay = Math.floor((leNumber / 2));
			
			for (int i = 0; i < halfWay; i++)
			{
				for (int h = 0; h < halfWay; h++)
				{
					System.out.print(" ");
				}
				System.out.print(printerChar);
				System.out.print("\n");
			}
				
			for (int i = 0; i < leNumber; i++)
			{
				System.out.print(printerChar);
			}
			
			System.out.print("\n");
			
			for (int i = 0; i < halfWay; i++)
			{
				for (int h = 0; h < halfWay; h++)
				{
					System.out.print(" ");
				}
				System.out.print(printerChar);
				System.out.print("\n");
			}
		}
	}	
}