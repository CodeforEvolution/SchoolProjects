import java.util.Arrays;


public class ArraysIIForStringsII {
	public static void main(String[] args)
	{
		//Step 1
		double[] number = new double[8];
		
		for (int i = 0; i < number.length; i++)
		{
			number[i] = i;
		}
		
		System.out.println("\n" + Arrays.toString(number));
		
		//Step 2
		for (int i = 0; i < number.length; i++)
		{
			number[i] += 4;
		}
		
		System.out.println("\n" + Arrays.toString(number));
		
		//Step 3
		for (int i = 0; i < number.length; i++)
		{
			if (i % 2 != 0)
			{
				number[i] -= 0.65;
			} 
		}
		
		System.out.println("\n" + Arrays.toString(number));
		
		//Step 4
		number[6] = -33;
		
		System.out.println("\n" + Arrays.toString(number));
		
		//Step 5
		
		
		
		
	}
}
