import java.util.Random;
import java.util.Scanner;

/*Example
import java.util.Scanner;
public class DoubleArray
{
   public static void main (String[] args)
    {   int z=0;
        Scanner in = new Scanner(System.in);
        
        int [][] LotteryNos = new int [3][4];  // create array; 3 rows, 4 columns
        
        LotteryNos [1][2] = 75;  // assign value to location row 1, column 2
        LotteryNos [2][0] = LotteryNos[1][2] + 5;
        
        for ( int x=0;x<=3;x++)
          LotteryNos[0][x]= 99;    // assign '99' to every value in row 0
          
        for (int r=0;r<=2;r++)     // print out the 2D array
         {for (int c=0; c<=3;c++)
              {  if (LotteryNos[r][c] < 10)
                   System.out.print( " " + LotteryNos[r][c] + " ");
                 else
                   System.out.print( LotteryNos[r][c] + " " ); 
              }
          System.out.println();       
         }
   }
}


//     Assignment:


//  Create a square matrix  (ie. 4 x 4 or 5 x 5) loaded with 0's
//  Randomly place some non-zero value at an [i][j] location
//  Prompt user to guess location
//      if incorrect, place a '1' at that location, and print matrix
//      if correct, let user know!
//
//  Create some type of scoring game

// Extensions:  A)  Give user 'clues' if row correct or column correct
//                      B)  Make game more like Battleship 
//                                 (2 or 3 cells together need to be identified)
//
*/

public class DoubleArray {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		char [][] gameGrid = new char[5][5];
		int xGuess = 0;
		int yGuess = 0;
		int xActual = 0;
		int yActual = 0;
		char again = 'n';
		char tryAgain = 'n';
		int points = 300;
		int counter = 0;
		
		for (int y = gameGrid.length - 1 ; y >= 0; y--)
		{
			for (int x = 0; x < gameGrid.length; x++)
			{
				gameGrid[x][y] = '0';
			}
		}
		
		System.out.println("Welcome to Find The Target!");
		System.out.println("You must guess a point from the grid below in (x,y) coordinates:");
		printArray(gameGrid);
		System.out.println("You start with " + points + " points, and for every round that you fail, you lose 10 points.");
		System.out.println();
		
		do
		{
			System.out.println("Let's go!");
			counter = 0;
			xActual = r.nextInt(gameGrid.length) + 1;
			yActual = r.nextInt(gameGrid.length) + 1;
			do
			{
				counter++;
				do
				{
					System.out.println("Enter your guess for the x coordinate!: ");
					xGuess = in.nextInt();
					
					if (xGuess > gameGrid.length || xGuess < 1)
					{
						System.out.println("That's...uh...not a point on the grid.");
						System.out.println("Enter a proper point, got it?");
					}
				} while (xGuess > gameGrid.length || xGuess < 1);
				
				do
				{
					
					System.out.println("Enter your guess for the y coordinate!: ");
					yGuess = in.nextInt();
					
					if (yGuess > gameGrid.length || yGuess < 1)
					{
						System.out.println("That's...uh...not a point on the grid.");
						System.out.println("Enter a proper point, got it?");
					}
				} while (yGuess > gameGrid.length || yGuess < 1);
				
				System.out.println("And....you....are....");
				
				if (xActual == xGuess && yActual == yGuess)
				{
					System.out.println("Correct!");
					System.out.println("Congragulations! You have won the marvelous prize of bragging rights!");
				} else {
					System.out.println("Incorrect... Well, I can give you another shot! (With a hint even)");
					System.out.println("Do you want another shot? (y or n): ");
					tryAgain = in.next().charAt(0);
					if (tryAgain == 'y')
					{
						System.out.println("Would you like a hint? It will cost you 5 points (y or n): ");
						if (in.next().charAt(0) == 'y')
						{
							points -= 5;
							if (counter > 2) {
								System.out.println("Here's your hint: The point is in column " + xActual + "!");
							} else {
								if (xActual == xGuess)
								{
									System.out.println("Your point is in the correct column!");
								} else if (yActual == yGuess) {
									System.out.println("Your point is in the correct row!");
								} else {
									System.out.println("Sorry, but there are no hints I can give you at this time... :(");
								}
								
							}
						}
						
						System.out.println("Goodluck!");
					}
				}
				
			} while((xActual != xGuess || yActual != yGuess) && tryAgain == 'y');
			
			if (xActual != xGuess || yActual != yGuess)
			{
				System.out.println("Well the actual was: ");
				System.out.println("X: " + xActual + " Y: " + yActual);
				System.out.println();
				gameGrid[xActual - 1][yActual - 1] = 'X';
				printArray(gameGrid);
				gameGrid[xActual - 1][yActual - 1] = '0';
			}
			
			points -= (10 * (counter - 1));
			System.out.println();
			System.out.println("You have earned " + points + " points!");
			
			System.out.println("Do you want to play...again?: ");
			again = in.next().charAt(0);
		} while (again == 'y');
		
		System.out.println("Thank you so much for playing my game!");
	
	}
	
	public static void printArray(char[][] array)
	{
		for (int y = array.length - 1; y >= 0; y--)
		{
			for (int x = 0; x < array.length; x++)
			{
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}