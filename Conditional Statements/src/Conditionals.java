/*
public class Conditionals {

}
*/

/**  Computer Programming 2         Conditional Statements
 *      Form:       if ( logical expression )   ACTION
 *                          or
 *                  if ( logical expression )
 *                  {   ACTION1
 *                      ACTION2...}
 */

import java.util.Scanner;

/* Example
public class Conditionals
{   
    public static void main( String[] args )
    {     
        int num;
        Scanner in = new Scanner(System.in);
        
        for ( int y = 0; y<=3;y++)
            {  System.out.print("Enter an integer ");
               num = in.nextInt(); 
               if (num > 10)                                // single actions with each "if"
                    System.out.println( " Big Number");
               if (num < 0 )
                    System.out.println( " Below Zero");
               if (num % 2 == 0)                         // % is MODULUS
                    System.out.println( " Even ");  }   // returns REMAINDER from Integer Div.      
               
        int x = 5;
        String name;
        System.out.print( "Name? ");
        name = in.next();
        while ( x > 0)
        {
            System.out.println( x + " " + name );
            if ( x == 2)
            {  System.out.print( " apple\n");   // multiple actions when "if" true 'bracketed'
               System.out.println(" streudel");
               System.out.print( " or pies \n\n");
            }
            x--;
        }
        
        System.out.println();
        int sumeven = 0, sumodd = 0;    
        for ( int j =10; j>0; j--)
        {                                           // If..else Structure
            if ( (j%2) == 0)                                // if EVEN
             {  System.out.println( j + " potato");
                sumeven = sumeven + j;   }
            else                                            //  'else' ODD
             {
                System.out.println("\ttomato " + j);        // built in 'tab' : use \t
                sumodd +=j;
             }
         }
          System.out.println( "even total = " + sumeven );
          System.out.println( "odd total = " + sumodd );
   }
}
*/              

/* PROG 1
public class Conditionals
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String oneName;
		int oneScore;
		String twoName;
		int twoScore;
		
		System.out.print("Please enter two names and two matching integer scores: \n");
		oneName = in.next();
		twoName = in.next();
		oneScore = in.nextInt();
		twoScore = in.nextInt();
		
		if (oneScore > twoScore)
		{
			System.out.print("High: " + oneName + "\t");
			System.out.print(oneScore + "\n");
			System.out.print("Low: " + twoName + "\t");
			System.out.print(twoScore + "\n");
		} else {
			System.out.print("High: " + twoName + "\t");
			System.out.print(twoScore + "\n");
			System.out.print("Low: " + oneName + "\t");
			System.out.print(oneScore + "\n");
		}
	}
}
*/

/* PROG 2
public class Conditionals
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String oneName;
		int oneScore;
		String twoName;
		int twoScore;
		String threeName;
		int threeScore;
		
		String highName = "";
		int highScore = 0;
		String middleName = "";
		int middleScore = 0;
		String lowName = "";
		int lowScore = 0;
		
		char again = 'n';
		
		do
		{	
			System.out.print("Please enter three names \nand two matching integer scores: \n");
			oneName = in.next();
			twoName = in.next();
			threeName = in.next();
			oneScore = in.nextInt();
			twoScore = in.nextInt();
			threeScore = in.nextInt();

			if (oneScore > twoScore && oneScore > threeScore)
			{
				highName = oneName;
				highScore = oneScore;
				if (twoScore > threeScore)
				{
					middleName = twoName;
					middleScore = twoScore;
					lowName = threeName;
					lowScore = threeScore;
				} else {
					middleName = threeName;
					middleScore = threeScore;
					lowName = twoName;
					lowScore = twoScore;
				}
			} else if (twoScore > oneScore && twoScore > threeScore) {
				highName = twoName;
				highScore = twoScore;
				if (oneScore > threeScore)
				{
					middleName = oneName;
					middleScore = oneScore;
					lowName = threeName;
					lowScore = threeScore;
				} else {
					middleName = threeName;
					middleScore = threeScore;
					lowName = oneName;
					lowScore = oneScore;
				}
			} else if (threeScore > oneScore && threeScore > twoScore) {
				highName = threeName;
				highScore = threeScore;
				if (oneScore > twoScore)
				{
					middleName = oneName;
					middleScore = oneScore;
					lowName = twoName;
					lowScore = twoScore;
				} else {
					middleName = twoName;
					middleScore = twoScore;
					lowName = oneName;
					lowScore = oneScore;
				}
			}
			
			System.out.print("High: " + highName + "\t");
			System.out.print(highScore + "\n");
			System.out.print("Middle: " + middleName + "\t");
			System.out.print(middleScore + "\n");
			System.out.print("Low: " + lowName + "\t");
			System.out.print(lowScore + "\n");
			
			System.out.print("\n");
			System.out.print("Want to Play Again? (y/n): \n");
			
			again = in.next().charAt(0);
			System.out.print("\n");
			
		} while (again == 'y');
		
		System.out.print("Goodbye! Have a great Day! :D");
	}
}
*/               
               
public class Conditionals
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String students[] = new String[100];
		int currentStudent = -1;
		
		double scores[] = new double[100];
		int currentScore = -1;
		int amountOfScores = 0;
		
		double averageCalc = 0.0;
		
		do
		{
			currentStudent++;
			System.out.print("Please enter a student name: \n");
			students[currentStudent] = in.next();
			if (students[currentStudent].equals("DONE"))
			{
				break;
			}
			
			amountOfScores = 0;
			System.out.print("Now, please enter as many test scores as you want!\n");
			System.out.print("When you are done, enter -1 as the test score: \n");
			do
			{
				currentScore++;
				scores[currentScore] = in.nextDouble();
				amountOfScores++;
			} while (scores[currentScore] != -1);
			amountOfScores--;
			
			System.out.print("Name: " + students[currentStudent] + "\n");
			System.out.print("Scores: \n");
			
			currentScore = 0;
			for (int i = 0; i < amountOfScores; i++)
			{
				System.out.print("\t" + scores[currentScore] + "\n");
				averageCalc += scores[currentScore];
				currentScore += 1;
			}
			
			averageCalc /= amountOfScores;
			System.out.print("Average: " + averageCalc + "\n");
			System.out.print("Grade: " + getLetterGrade(averageCalc) + "\n");
				
		} while (students[currentStudent] != "DONE");
		
		System.out.print("Goodbye! Have a great Day! :D");
	}
	
	public static String getLetterGrade(double percentScore)
	{
		String letterGrade = "";
		
		if (percentScore >= 90) {
			letterGrade = "A";
		} else if (percentScore >= 80) {
			letterGrade = "B";
		} else if (percentScore >= 70) {
			letterGrade = "C";
		} else if (percentScore >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
}               
	
