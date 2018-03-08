import java.text.NumberFormat;
import java.util.Scanner;


public class ArbysOrderUp {
	static double cost = 0.0;
	static Scanner in = new Scanner(System.in);
	static int meatChoice = 0;
	static int sideChoice = 0;
	static int drinkChoice = 0;
	static int dessertChoice = 0;
	
	public static void main(String[] args)
	{
		String costString = "";
		String name = "";
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.println("Hello! What is your name?: ");
		name = in.next();
		System.out.println("Welcome " + name + " to Arby's! We have the meats!");
		
		if (meatPhase() == false)
			return;
		
		if (sidePhase() == false)
			return;
		
		if (drinkPhase() == false)
			return;
		
		if (dessertPhase() == false)
			return;
		
		System.out.println();
		System.out.println("So, your order is: ");
		
		switch (meatChoice)
		{
			case 1:
				System.out.println("\t" + "Roast Beef");
				break;
			case 2:
				System.out.println("\t" + "Chicken");
				break;
			case 3:
				System.out.println("\t" + "Ham");
				break;
			case 4:
				System.out.println("\t" + "Cornbeef");
				break;
			default:
				System.out.println("\t" + "Meat Error?!??! Bbbut we have the meats!");
		}
		
		switch (sideChoice)
		{
			case 1:
				System.out.println("\t" + "Mozerella Sticks");
				break;
			case 2:
				System.out.println("\t" + "Onion Rings");
				break;
			case 3:
				System.out.println("\t" + "Curly Fries");
				break;
			case 4:
				System.out.println("\t" + "Potato Cakes");
				break;
			default:
				System.out.println("\t" + "Error, where's my sidekick?");

		}
		
		switch (drinkChoice)
		{
			case 1:
				System.out.println("\t" + "Pepsi MAX");
				break;
			case 2:
				System.out.println("\t" + "Ultimate Chocolate Shake");
				break;
			case 3:
				System.out.println("\t" + "Moutain Dew");
				break;
			case 4:
				System.out.println("\t" + "Dr Pepper");
				break;
			default:
				System.out.println("\t" + "Error, I'm not drunk??");

		}
		
		switch (dessertChoice)
		{
			case 1:
				System.out.println("\t" + "Cherry Turn Over");
				break;
			case 2:
				System.out.println("\t" + "Oreo Bites");
				break;
			case 3:
				System.out.println("\t" + "Salted Caramel and Chocolate Cookie");
				break;
			case 4:
				System.out.println("\t" + "Apple Turnover");
				break;
			default:
				System.out.println("\t" + "Error, no dessert?!?!? D:<");	
		}
		
		System.out.println();
		System.out.println("Ok, let's see...your total is: ");
		costString = formatter.format(cost);
		System.out.println(costString);
		System.out.println("Have a nice day!");
	}
	
	public static boolean meatPhase()
	{
		boolean ok = false;
		
		System.out.println("First of all, what MEAT would you like?");
		System.out.println("0) No MEAT?!?!? 1) Roast Beef 2) Chicken 3) Ham 4) Cornbeef");
		meatChoice = in.nextInt();
		
		switch (meatChoice)
		{
			case 0:
			{
				System.out.println("I'll ask again, what MEAT do you want? >:V");
				System.out.println("1) Roast Beef 2) Chicken 3) Ham 4) Cornbeef");
				
				meatChoice = in.nextInt();
				switch (meatChoice)
				{
					case 0:
						System.out.println("But I even removed the option from the list D: ...huh...GOODBYE!!!!");
						System.out.println("YOU ARE FORBIDDEN FROM ARBY'S! BECAUSE WE HAVE THE MEATS!!!!!!!");
						ok = false;
						break;
					case 1:
						System.out.println("Not bad of a choice! :D");
						ok = true;
						cost += 2.00;
						break;
					case 2:
						System.out.println("It seems you're not a chicken! :D");
						ok = true;
						cost += 2.50;
						break;
					case 3:
						System.out.println("That's hamtastic! :D");
						ok = true;
						cost += 1.50;
						break;
					case 4:
						System.out.println("Experimental I see... :P");
						ok = true;
						cost += 3.00;
						break;
					default:
						System.out.println("Seems like meat isn't serious enough for you...welp, goodbye!!");
						ok = false;
				}
				break;
			}
			case 1: 
				System.out.println("You just got roasted!!! How delicious! :D");
				ok = true;
				cost += 2.00;
				break;
			case 2:
				System.out.println("Served up golden! :)");
				ok = true;
				cost += 2.50;
				break;
			case 3:
				System.out.println("It's hamerific!");
				ok = true;
				cost += 1.50;
				break;
			case 4:
				System.out.println("What did the beef say to the corn? I'm feeling corny! XD");
				ok = true;
				cost += 3.00;
				break;
			default:
				System.out.println("Baaaaaaaa!!!!!! Wrong Answer! Bye Now!");
				ok = false;
		}
		
		return ok;
	}
	
	public static boolean sidePhase()
	{
		boolean ok = false;
		
		System.out.println("Now, choose a side.");
		System.out.println("0) Side Salad??? >:)))))) 1) Mozerella Sticks 2) Onion Rings 3) Curly Fries 4) Potato Cakes");
		sideChoice = in.nextInt();
		
		switch (sideChoice)
		{
			case 0:
			{
				System.out.println(">:) AHHHHHHHHHHHHHHHHH! It's too healthy!!!!! Again please?");
				System.out.println("1) Mozerella Sticks 2) Onion Rings 3) Curly Fries 4) Potato Cakes");
				
				sideChoice = in.nextInt();
				switch (sideChoice)
				{
					case 0:
						System.out.println("But I even removed the option from the list D: ...huh...GOODBYE!!!!");
						System.out.println("YOU ARE FORBIDDEN FROM ARBY'S! BECAUSE WE HAVE THE MEATS!!!!!!!");
						ok = false;
						break;
					case 1:
						System.out.println("You're quite cheesy :D");
						ok = true;
						cost += 1.00;
						break;
					case 2:
						System.out.println("This conflict of interest will go round like a ring! :D");
						ok = true;
						cost += 1.00;
						break;
					case 3:
						System.out.println("Who needs curves when you got curls? :D");
						ok = true;
						cost += 0.50;
						break;
					case 4:
						System.out.println("Po, Po, Potato! XD");
						ok = true;
						cost += 1.50;
						break;
					default:
						System.out.println("Seems like you're too healthy...welp, goodbye!!");
						ok = false;
				}
				break;
			}
			case 1: 
				System.out.println("Ok Sir!! Parcheesy!!!!");
				ok = true;
				cost += 1.00;
				break;
			case 2:
				System.out.println("More like ring a ding ding! ;)");
				ok = true;
				cost += 1.00;
				break;
			case 3:
				System.out.println("Curls always win against curves! >:)");
				ok = true;
				cost += 0.50;
				break;
			case 4:
				System.out.println("Classy! My mouth is watering! :d");
				ok = true;
				cost += 1.50;
				break;
			default:
				System.out.println("Baaaaaaaa!!!!!! Wrong Answer! Bye Now!");
				ok = false;
		}
		
		return ok;
	}

	public static boolean drinkPhase()
	{
		boolean ok = false;
		
		System.out.println("Drink or else!");
		System.out.println("0) Water in a BOTTLE?!? >:O 1) PEPSI MAX (Chef Kyle Recommends) 2) ULTIMATE CHOCOLATE SHAKE 3) Dew of Moutains 4) Dr Pepper");
		drinkChoice = in.nextInt();
		
		switch (drinkChoice)
		{
			case 0:
			{
				System.out.println("I'll ask again what MEAT do you want?");
				System.out.println("1) PEPSI MAX (Chef Kyle Recommends) 2) ULTIMATE CHOCOLATE SHAKE 3) Dew of Moutains 4) Dr Pepper");
				
				drinkChoice = in.nextInt();
				switch (drinkChoice)
				{
					case 0:
						System.out.println("But I even removed the option from the list D: ...huh...GOODBYE!!!!");
						System.out.println("YOU ARE FORBIDDEN FROM ARBY'S! BECAUSE WE HAVE THE MEATS!!!!!!!");
						ok = false;
						break;
					case 1:
						System.out.println("(Kyle gives you a thumbs up from the kitchen.) :D");
						ok = true;
						cost += 0.50;
						break;
					case 2:
						System.out.println("YEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHH!!! It's too ultimate! XDDDDDDDDDD");
						ok = true;
						cost += 3.00;
						break;
					case 3:
						System.out.println("Fresh from a mountain, coming up! :D");
						ok = true;
						cost += 1.50;
						break;
					case 4:
						System.out.println("What did the doctor say too some pepper? Stop tricking people into thinking they're sneezing! (I tried...) ;)");
						ok = true;
						cost += 1.00;
						break;
					default:
						System.out.println("Well than, no drinks for drunks than...Bye!!");
						ok = false;
				}
				break;
			}
			case 1: 
				System.out.println("(Kyle gives you a thumbs up from the kitchen.) :D");
				ok = true;
				cost += 0.50;
				break;
			case 2:
				System.out.println("Get ready for the best heart attack of your life!!!! :DDDDDDD");
				ok = true;
				cost += 3.00;
				break;
			case 3:
				System.out.println("That choice was soooooo dew! :P");
				ok = true;
				cost += 1.50;
				break;
			case 4:
				System.out.println("FEELING IT TOO I SEE?!? DOCTORS UNITES! AAAAAAAAHHHHHHHHHHH!!");
				ok = true;
				cost += 1.00;
				break;
			default:
				System.out.println("Baaaaaaaa!!!!!! Wrong Answer! Bye Now!");
				ok = false;
		}
		
		return ok;
	}
	
	public static boolean dessertPhase()
	{
		boolean ok = false;
		
		System.out.println("It's the grande finale!!! What dessert would you like (Homer Simpson: MMMMMMMMM, desserts (gargle) (gargle))");
		System.out.println("0) PHOTOSYNTHESIS???? 1) Cherry Turn Over 2) Oreo Bites 3) Salted Carmel and Chocolate Cookie 4) Apple Turnover");
		dessertChoice = in.nextInt();
		
		switch (dessertChoice)
		{
			case 0:
			{
				System.out.println("Are you high? Let's see, i'll ask again: ");
				System.out.println("1) Cherry Turn Over 2) Oreo Bites 3) Salted Carmel and Chocolate Cookie 4) Apple Turnover");
				
				dessertChoice = in.nextInt();
				switch (dessertChoice)
				{
					case 0:
						System.out.println("But I even removed the option from the list D: ...huh...GOODBYE!!!!");
						System.out.println("YOU ARE FORBIDDEN FROM ARBY'S! BECAUSE WE HAVE THE MEATS!!!!!!!");
						ok = false;
						break;
					case 1:
						System.out.println("More like cherry turnon! :P");
						ok = true;
						cost += 2.00;
						break;
					case 2:
						System.out.println("Orealeo fantastic choice! :D");
						ok = true;
						cost += 1.50;
						break;
					case 3:
						System.out.println("Just don't get toooo salty! :D");
						ok = true;
						cost += 1.00;
						break;
					case 4:
						System.out.println("More like apple turnon! :P");
						ok = true;
						cost += 2.00;
						break;
					default:
						System.out.println("Well seems you are high, goodbye!! (RHYMES OH SNAP, TOO OP FOR YOU!)");
						ok = false;
				}
				break;
			}
			case 1: 
				System.out.println("MMMMMMMMMM Cherryyyyy!");
				ok = true;
				cost += 2.00;
				break;
			case 2:
				System.out.println("Oreo, OREO!");
				ok = true;
				cost += 1.50;
				break;
			case 3:
				System.out.println("Enough salt to fill the ocean!");
				ok = true;
				cost += 1.00;
				break;
			case 4:
				System.out.println("APPLE");
				ok = true;
				cost += 2.00;
				break;
			default:
				System.out.println("Baaaaaaaa!!!!!! Wrong Answer! Bye Now!");
				ok = false;
		}
		
		return ok;
	}
	
}
