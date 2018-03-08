/* Picture 1
public class PrintPictures {
	public static void main(String[] args)
	{
		char theChar = '@';
		for (int i = 0; i < 4; i++)
		{
			for (int c = 0; c < 4; c++)
				System.out.print(theChar);
			System.out.print("\n");
		}
	}
}
*/

/* Picture 2
public class PrintPictures {
	public static void main(String[] args)
	{
		char theChar = '@';
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(theChar);
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < 2; i++)
			System.out.print(theChar + "  " + theChar + "\n");
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(theChar);
		}
	}
}
*/

/* Picture 3
public class PrintPictures {
	public static void main(String[] args)
	{
		char theChar = '$';
		
		for (int i = 0; i < 2; i++)
		{
			for (int c = 0; c < 5; c++)
				System.out.print(theChar + " ");
			System.out.print("\n");
			for (int c = 0; c < 5; c++)
				System.out.print(" " + theChar);
			System.out.print("\n");
		}
		
		for (int c = 0; c < 5; c++)
			System.out.print(theChar + " ");
	}
}
*/

/* Picture 4
public class PrintPictures {
	public static void main(String[] args)
	{
		char theChar = '&';
		
		for (int i = 0; i <= 5; i++)
		{
			for (int c = 0; c < i; c++)
				System.out.print(theChar);
			System.out.print("\n");
		}
	}
}
*/

