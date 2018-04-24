import java.util.Random;
import java.util.Scanner;


public class BubbleSortPart1 {
	public static void main(String[] args)
	{
		//Activity 1
		Random r = new Random();
		int[] numberz = new int[10];
		double sum = 0.0;
		double average = 0.0;
		
		for (int i = 0; i < numberz.length; i++)
		{
			numberz[i] = r.nextInt(30);
		}
		
		System.out.println("The generated array: ");
		printIntArray(numberz);
		
		sortIntArray(numberz);
		System.out.println("\nNew array: ");
		printIntArray(numberz);
		
		for (int i = 0; i < numberz.length; i++)
		{
			sum += numberz[i];
		}
		average = sum / numberz.length;
		
		System.out.println("\nAverage of number in array! : " + average);
		
		
		//Activity 2
		Scanner in = new Scanner(System.in);
		String[] names = new String[5];
		
		System.out.println("Please enter 5 names: ");
		for (int i = 0; i < names.length; i++)
		{
			names[i] = in.next();
		}
		
		System.out.println("Current Names in Array: ");
		printStringArray(names);
		
		sortStringArray(names);
		
		System.out.println("\nSorted Names in Array: ");
		printStringArray(names);
		
		
		String longStr = "";
		
		for (int i = 0; i < names.length; i++)
		{
			if (names[i].length() > longStr.length())
			{
				longStr = names[i];
			}
		}
		
		System.out.println("Longest String: " + longStr);
		
	}
	
	public static void sortStringArray(String[] inArray)
	{
		boolean fullPass = true;
    	
    	do
    	{
    		fullPass = true;
    		for (int i = 0; i < inArray.length - 1; i++)
    		{
    			if (0 < inArray[i].compareTo(inArray[i + 1]))
    			{
    				String temp = inArray[i];
    				inArray[i] = inArray[i + 1];
    				inArray[i + 1] = temp;
    				fullPass = false;
    			}
    		}
    	} while (fullPass == false);
	}
	
	public static void printStringArray(String[] array)
	{
    	for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();		
	}
	
    public static void sortIntArray(int[] inArray)
    {
    	boolean fullPass = true;
    	
    	do
    	{
    		fullPass = true;
    		for (int i = 0; i < inArray.length - 1; i++)
    		{
    			if (inArray[i] > inArray[i + 1])
    			{
    				int temp = inArray[i];
    				inArray[i] = inArray[i + 1];
    				inArray[i + 1] = temp;
    				fullPass = false;
    			}
    		}
    	} while (fullPass == false);
    }
    
    public static void printIntArray(int[] array)
	{
    	for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();		
	}
}
