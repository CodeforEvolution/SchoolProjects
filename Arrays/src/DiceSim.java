import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class DiceSim {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int diceSidesAmount = 0;
		int rollAmount = 0;
		int rollCount = 0;
		int currentRoll = 0;
		int mode = 0;
		double sum = 0.0;
		double mean = 0.0;
		double median = 0.0;
		char again = 'f';
		boolean pass = false;
		
		System.out.println("Welcome to the dice simulator!");
		System.out.println("How many sides on the dice would you like to have?: ");
		diceSidesAmount = in.nextInt();
		while (pass == false)
		{
			System.out.println("How many dice rolls would like to have? (1-20): ");
			rollAmount = in.nextInt();
			if (1 <= rollAmount && rollAmount <= 20)
			{
				pass = true;
			} else {
				pass = false;
				System.out.println("BAAAAHH! You can't roll that much!");
				System.out.println("I'll ask again: ");
			}
		}	
		int[] frequency = new int[diceSidesAmount];
		int[] rolls = new int[rollAmount];
		
		do
		{
			rollCount++;
			in.useDelimiter("\n");
			System.out.println("It's time to roll! Are you ready? (Enter when ready!): ");
			in.next();
			in.reset();
			
			currentRoll = r.nextInt(diceSidesAmount) + 1;
			System.out.println("You rolled a " + currentRoll + "!");
			rolls[rollCount - 1] = currentRoll;
			frequency[currentRoll - 1] += 1;
			sum += currentRoll;
			
			if (rollCount < rollAmount)
			{
				System.out.println();
				System.out.println("You have " + (rollAmount - rollCount) + " rolls remaing.");
				System.out.println("Would you like to continue playing? (y or n): ");
				again = in.next().charAt(0);
			} else {
				System.out.println();
				System.out.println("You are through!");
			}
		} while(again == 'y' && rollCount < rollAmount);
		
		System.out.println("You are Finished! Thank you for playing!");
		System.out.println("Your rolls: ");
		
		for (int i = 0; i < rollCount; i++)
		{
			System.out.print(rolls[i] + " ");
		}
		System.out.println();
		
		System.out.println("The sum of your rolls is: " + sum);
		System.out.println("The Frequency of your rolls were: ");
		
		for(int i = 1; i < diceSidesAmount + 1; i++)
		{
			System.out.println("Side: " +  i + " Frequency: " + frequency[i - 1]);
		}
		
		mean = sum / rollAmount;
		System.out.println("The mean of your rolls is: " + mean);
		
		for(int i = 0; i < frequency.length; i++)
		{
			if (frequency[i] > frequency[mode])
			{
				mode = i;
			}
		}
		
		System.out.println("The mode of your rolls is: " + (mode + 1));
		
		Arrays.sort(rolls);
		
		if (rollAmount == 1)
		{
			median = rolls[rollAmount];
		} else if (rollAmount % 2 == 0) {
			int low = rollAmount / 2;
			int high = (rollAmount / 2) - 1;
			median = (rolls[low] + rolls[high]) / 2.0;
		} else {
			median = rolls[rollAmount / 2];
		}
		
		System.out.println("The median of your rolls is: " + median);
	}
	
	public static void printArray(int[] array, boolean backwards)
	{				
		if (backwards == false)
		{
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = array.length - 1; i >= 0; i--)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
			
	}
}
