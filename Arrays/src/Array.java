import java.util.Scanner;


/**
 * This is a Review of Arrays.
 * An 'array' is a list of related information, such as a large database.
 * We locate a value by its 'Index' 
 */
/* Example Project
import java.util.Scanner; 

public class Array
{
    public static void main (String []args )
    {
        Scanner in = new Scanner(System.in);
        
        int numArray [] = new int [10];  // define an array of integers, size 10
                                         // array is 'INDEXED' from 0 to 9
        for ( int x = 0; x<10 ; x++)
            System.out.print(numArray[x] + " ");  // print out original array
        System.out.println();
        
        numArray[0]= 4;         // assign values to a particular index
        numArray[3]= 7;
        numArray[6]= 18;
        numArray[8]= numArray[3] + numArray[6];
        
        for ( int x = 0; x<10 ; x++)
            System.out.print(numArray[x] + " ");  // print out changed array
        System.out.println();
        
         for ( int x = 9; x>=0 ; x--)
            System.out.print(numArray[x] + " ");  // print in REVERSE order
        System.out.println();
        
        String color[] = new String [5]; // define an array of Strings, size 5
      
        for (int g = 0; g <= 4 ; g++)
            {System.out.print(" Enter color "); // prompt user to enter a color
             color[g] = in.next();}
             
        for ( int x = 0; x < 5 ; x++)
            System.out.print(color [x] + " ");  // print out color array
        System.out.println();
        
        for ( int r = 0; r< 5 ; r++)
            { System.out.print(" ");    
             if (color[r].length() < 5 )  // print out color if length < 5
                System.out.print(color[r]);
             else                         // else print first character only  
                System.out.print( color[r].charAt(0) );}     
        
    }     
}
*/

/* Array of Integers
public class Array {
	public static void main(String[] args)
	{
		int currentNumber = 3;
		
		int[] intArray = new int[7];
		
		//Step 1
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = currentNumber;
			currentNumber += 2;
		}
		
		//Step 2
		for (int i = 0; i < intArray.length; i++)
		{
			if (i % 2 == 0)
			{
				intArray[i] = 99;
			}
		}
		
		//Step 3
		int temp = 0;
		temp = intArray[3];
		intArray[3] = intArray[6];
		intArray[6] = temp;
		
		//Step 4
		int greatestNum = 0;
		int greatestPos = 0;
		int currentPos = 0;
		
		for (int i = 0; i < intArray.length; i++)
		{
			currentPos = i;
			if (intArray[currentPos] > greatestNum)
			{
				greatestNum = intArray[currentPos];
				greatestPos = currentPos;
			}
		}
		System.out.println("Greatest: " + greatestNum + " At: "  + greatestPos);
		
		//Step 5
		int sumOArray = 0;
		double average = 0;
		
		for (int i = 0; i < intArray.length; i++)
		{
			sumOArray += intArray[i]; 
		}
		average = sumOArray / intArray.length;
		System.out.println("Sum of array: " + sumOArray + " Average of array: " + average);
		
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
}
*/

public class Array {
	public static void main(String[] args)
	{		
		Scanner in = new Scanner(System.in);
		char[] charArray = new char[6];
		String currentInput = "";
		
		char searchFor = ' ';
		int foundIndex = 0;
		boolean found = false;
		
		//Step 1
		for (int i = 0; i < charArray.length; i++)
		{
			charArray[i] = 'Q';
		}
		
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.print(charArray[i] + " ");
		}
		System.out.println();
		
		//Step 2
		System.out.println("Please input " + charArray.length + " characters please: ");
		currentInput = in.next();
		
		for (int i = 0; i < charArray.length; i++)
		{
			charArray[i] = currentInput.charAt(i);
		}
		
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.print(charArray[i] + " ");
		}
		System.out.println();
		
		//Step 3
		charArray[0] = 'X';
		charArray[charArray.length - 1] = 'X';
		
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.print(charArray[i] + " ");
		}
		System.out.println();
		
		//Step 4
		char temp = ' ';
		
		temp = charArray[1];
		charArray[1] = charArray[4];
		charArray[4] = temp;
		
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.print(charArray[i] + " ");
		}
		System.out.println();
		
		//Accelerated
		System.out.println("\nIt's the all new Google!...for arrays....");
		System.out.print("Enter a single character to search for in the array: ");
		searchFor = in.next().charAt(0);
		
		System.out.println("\nSearching for: " + searchFor);
		
		for (int i = 0; i < charArray.length; i++)
		{
			if (found == true)
				break;
			
			if (searchFor == charArray[i])
			{
				found = true;
				foundIndex = i;
			}
		}
		
		if (found == true)
		{
			System.out.println("HOORAYYYYY!! We found your character at index " + foundIndex + " in the array!");
		} else {
			System.out.println("Sorry, but no matches found.");
		}
		
		//Extra Credit - Currently Broken
/*		System.out.println("Now searching for duplicates in the array, because why not? :D");
		
		int duplicateCount = 0;
		String alreadyFound = " ";
		char currentChar = ' ';
		
		for (int index = 0; index < charArray.length; index++)
		{
			for (int i = 0; i < charArray.length; i++)
			{
				for (int r = 0; r < charArray.length; i++)
				{
					try {
						currentChar = alreadyFound.charAt(i);
					} catch (Exception e) {
						currentChar = ' ';
						e.printStackTrace();
					}
					if (charArray[index] == currentChar)
					{
						break;
					} else if (charArray[index] == charArray[i]) {
						duplicateCount += 1;
						alreadyFound += charArray[i];
					}
				}
			}
		}
		System.out.println("Found " + duplicateCount + " duplicates in the array!"); */
	}
}

