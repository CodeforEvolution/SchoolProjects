
public class BubbleSortPart2 {
	public static void main(String[] args)
	{
		//Activity 3
		Die dieCup[] = new Die[8];
		
		for (int i = 0; i < dieCup.length; i++)
		{
			dieCup[i] = new Die();
			dieCup[i].roll();
		}
		
		System.out.println("Current rolls in array: ");
		printDiceArray(dieCup);
		
		sortDiceArray(dieCup);
		
		System.out.println("Now sorted rolls in array: ");
		printDiceArray(dieCup);
		
		//Avg + Median
		double median = (dieCup[3].getValue() + dieCup[4].getValue()) / 2.0;
		double sum = 0.0;
		
		for (int i = 0; i < dieCup.length; i++)
		{
			sum += dieCup[i].getValue();
		}
		
		double average = sum / dieCup.length;
		
		System.out.println("Average of Values in Array: " + average);
		System.out.println("Median of Values in Array: " + median);
	}
	
	public static void sortDiceArray(Die[] inArray)
	{
		boolean fullPass = true;
    	
    	do
    	{
    		fullPass = true;
    		for (int i = 0; i < inArray.length - 1; i++)
    		{
    			if (inArray[i].getValue() > inArray[i + 1].getValue())
    			{
    				Die temp = inArray[i];
    				inArray[i] = inArray[i + 1];
    				inArray[i + 1] = temp;
    				fullPass = false;
    			}
    		}
    	} while (fullPass == false);
	}
	
	public static void printDiceArray(Die[] inarray)
	{
		for (int i = 0; i < inarray.length; i++)
		{
			System.out.print(inarray[i] + " ");
		}
		System.out.println();
	}
}
