import java.util.Scanner;


public class SimilarTrianglesJake5 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		boolean again = false;
		int[] tri1 = new int[3];
		int[] tri2 = new int[3];
		
		System.out.println("This program calculates if two triangles are similar.");
		System.out.println("When you are done using this program, just enter 0 for a side");
		
		while (true)
		{
			System.out.println("The first triange: ");
			System.out.println("Side 1: ");
			tri1[0] = in.nextInt();
			if (tri1[0] == 0) return;
			System.out.println("Side 2: ");
			tri1[1] = in.nextInt();
			if (tri1[1] == 0) return;
			System.out.println("Side 3: ");
			tri1[2] = in.nextInt();
			if (tri1[2] == 0) return;
			
			System.out.println("\n Now for the second triange: ");
			System.out.println("Side 1: ");
			tri2[0] = in.nextInt();
			if (tri2[0] == 0) return;
			System.out.println("Side 2: ");
			tri2[1] = in.nextInt();
			if (tri2[1] == 0) return;
			System.out.println("Side 3: ");
			tri2[2] = in.nextInt();
			if (tri2[2] == 0) return;
			
			System.out.println("\nNow are they similar...\n");
		}
		
		//System.out.println("\nGoodbye!");
	}
}
