import java.util.Scanner;

public class WelcomeRecursion {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int finalInt = 0;
		
		/*
		int theInt = 0;
		
		/*Part 1
		System.out.println("Why hello! Please enter an integer: ");
		theInt = in.nextInt();
		
		System.out.println("\nHere we go!");
		finalInt = sumSquares(theInt);
		
		System.out.println("\nThe square sum is " + finalInt);
		*/
		
		/*Part 2
		System.out.println("Now, please enter an integer: ");
		theInt = in.nextInt();
		
		System.out.println("\nHere we go!");
		finalInt = sumEven(theInt);
		
		System.out.println("\nThe sum of even numbers is " + finalInt);
		*/
		
		int oneInt = 0;
		int twoInt = 0;
		
		//Part 3
		System.out.println("Now, please enter two odd integers: ");
		oneInt = in.nextInt();
		twoInt = in.nextInt();
		
		System.out.println("\nHere we go!");
		finalInt = sumOdd(oneInt, twoInt);
		
		System.out.println("\nThe sum of odd numbers is " + finalInt);
		
	}
	
	public static int sumSquares(int inInt)
	{
		if (inInt == 1)
		{
			return 1;
		}
		else
		{
			return (inInt * inInt) + sumSquares(inInt - 1);
		}
	}
	
	public static int sumEven(int inInt)
	{
		if (inInt <= 0)
		{
			return 0;
		}
		else 
		{
			return (inInt * 2) + sumEven(inInt - 1);
		}
	}
	
	public static int sumOdd(int oneInt, int twoInt)
	{
		if (oneInt > twoInt)
		{
			return 0;
		}
		else
		{
			return oneInt + sumOdd(oneInt + 2, twoInt);
		}
	}
}
