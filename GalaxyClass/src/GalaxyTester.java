
public class GalaxyTester {
	public static void main(String[] args)
	{
		Galaxy milkyway = new Galaxy("Milky Way", 100, 980);
		Galaxy mez = new Galaxy("The Mez", 200, 2040);
		Galaxy gallony = new Galaxy("The Gallony", 300, 100);
		
		Galaxy lowVel;
		Galaxy highMass;
		
		System.out.println("Introducing our galaxies!: ");
		System.out.println(milkyway);
		System.out.println(mez);
		System.out.println(gallony);
		
		System.out.println("\nAfter some solar events!: ");
		milkyway.solarFlare();
		System.out.println(milkyway);
		mez.kligonRay();
		System.out.println(mez);
		gallony.solarFlare();
		System.out.println(gallony);
		
		milkyway.collide(mez);
		gallony.collide(milkyway);
		mez.collide(gallony);
		
		System.out.println("\nAfter a terrible collision: ");
		System.out.println(milkyway);
		System.out.println(mez);
		System.out.println(gallony);
		
		if (milkyway.getMass() > mez.getMass() && milkyway.getMass() > gallony.getMass())
		{
			highMass = milkyway;
		} else if (mez.getMass() > gallony.getMass()) {
			highMass = mez;
		} else {
			highMass = gallony;
		}
		
		if (milkyway.getVelocity() < mez.getVelocity() && milkyway.getVelocity() < gallony.getVelocity())
		{
			lowVel = milkyway;
		} else if (mez.getVelocity() < gallony.getVelocity()) {
			lowVel = mez;
		} else {
			lowVel = gallony;
		}
		
		System.out.println("Galaxy With:");
		System.out.println("\tGreatest Mass: " + highMass.getName());
		System.out.println("\tLowest Velocity: " + lowVel.getName());
	}
}
