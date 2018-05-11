import java.util.ArrayList;
import java.util.Arrays;


public class ArraysIIForStringsII {
	public static void main(String[] args)
	{
		//Activity A
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
		int sum = 0;
		for (int i = 0; i < number.length; i++)
		{
			sum += number[i];
		}
		
		number[0] = sum;
		
		System.out.println("\n" + Arrays.toString(number));
		
		//Step 6
		for (int i = 0; i < number.length; i++)
		{
			number[i] -= (i * 2);
		}	
			
		System.out.println("\n" + Arrays.toString(number));
		
		//Step 7
		for (int i = 0; i < (number.length / 2); i++)
		{
			double temp = number[i];
			number[i] = number[number.length - (1 + i)];
			number[number.length - (1 + i)] = temp;
		}
		
		System.out.println("\n" + Arrays.toString(number));
		
		
		//Activity B
		System.out.println("\n\nStart Part B!");		
		//Step 1
		String[] words = new String[10];
		for (int i = 0; i < words.length; i++)
		{
			words[i] = "mountain";
		}
		
		System.out.println("\n" + Arrays.toString(words));
		
		//Step 2
		for (int i = 0; i < words.length; i++)
		{
			double sr = Math.sqrt(i);
		    
	        if ((sr - Math.floor(sr)) == 0)
			{
				words[i] += "dew";
			}
		}
		
		System.out.println("\n" + Arrays.toString(words));
		
		//Step 3 + 4
		for (int i = 0; i < words.length; i++)
		{
			if (i % 2 == 0)
			{
				words[i] = words[i].toUpperCase();
			}
			else
			{
				char[] temp = words[i].toCharArray();
				temp[temp.length - 1] = Character.toUpperCase(temp[temp.length - 1]);
				words[i] = new String(temp);
			}
		}
		
		System.out.println("\n" + Arrays.toString(words));
		
		//Step 5
		for (int i = 0; i < words.length - 1; i++)
		{
			words[i] = words[i + 1];
		}
		
		System.out.println("\n" + Arrays.toString(words));
		
		//Step 6
		char[] temp2 = words[2].toCharArray();
		temp2[5] = 'e';
		temp2[6] = 'e';
		words[2] = new String(temp2);
		
		char[] temp3 = words[3].toCharArray();
		temp3[5] = 'e';
		temp3[6] = 'e';
		words[3] = new String(temp3);
		
		System.out.println("\n" + Arrays.toString(words));
		
		//Step 7
		for (int i = 0; i < words.length; i++)
		{
			char[] splitup = words[i].toCharArray();
			ArrayList<Integer> vowelpos = new ArrayList<Integer>();
			
			for (int v = 0; v < splitup.length; i++)
			{
				switch (Character.toLowerCase(splitup[i]))
				{
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowelpos.add(v);
						break;
					default:
						break;
				}
			}
			
			for (int s = 0; s < (vowelpos.size() / 2); s++)
			{
				
			}
			
			
			
			words[i] = new String(splitup);
		}
		
		System.out.println("\n" + Arrays.toString(words));
	}
}
