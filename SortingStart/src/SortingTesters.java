import java.util.Random;


public class SortingTesters {
	public static void main(String[] args)
	{
		//Activity 1
		Random r = new Random();
		int[] numberz = new int[10];
		
		for (int i = 0; i < numberz.length; i++)
		{
			numberz[i] = r.nextInt();
		}
		
		System.out.println("The generated array: ");
		printArray(numberz);
		
		numberz = sortArray(numberz);
		System.out.println("New array: ");
		printArray(numberz);
	}
	
    public static int[] sortArray(int[] inArray)
    {
    	int[] thearray = inArray;
    	boolean fullPass = true;
    	
    	while (fullPass == false)
    	{
    		fullPass = true;
    		for (int i = 0; i < thearray.length - 2; i++)
    		{
    			if (thearray[i] > thearray[i + 1])
    			{
    				int temp = thearray[i];
    				thearray[i] = thearray[i + 1];
    				thearray[i + 1] = temp;
    				fullPass = false;
    			}
    		}
    	}

    	return thearray; 
    }
    
    public static void printArray(int[] array)
	{				
    	for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();		
	}
}
