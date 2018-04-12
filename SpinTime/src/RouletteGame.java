import java.util.Scanner;


public class RouletteGame {
	public static void main(String[] args)
	{
		char again = 'n';
		Scanner in = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println(" Welcome to the roulette game!");
		System.out.println("===============================\n");
		
		System.out.println("Simply, you will spin a spinner and attempt to guess where it will land!");
		System.out.println("Afterwards, based on what you are guessing, \n");
		System.out.println("you will also roll a die that will affect how much money you earn.");
		
		System.out.println("It's time to start!!!\n");
		
		do
		{
			
			System.out.println("Would you like to play...again? (y or n): ");
			again = in.next().charAt(0);
			if (again == 'y')
			{
				System.out.println("\nThe fun continues!\n");
			}
		} while (again == 'y');
		
	}
}
