import java.util.Random;

public class Galaxy {
    private String theName = "";
    private double theMass = 0.0;
    private double theVelocity = 0.0;

    public Galaxy(String name, double mass, double velocity)
    {
        theName = name;
        theMass = mass;
        theVelocity = velocity;
    }

    public String getName()
    {
        return theName;
    }

    public double getMass() {
        return theMass;
    }

    public double getVelocity(){
        return theVelocity;
    }

    public void solarFlare(){
        Random r = new Random();

        if(r.nextBoolean())
        {
            theVelocity =- r.nextDouble();
        } else {
            theVelocity =+ r.nextDouble();
        }
    }

    public void kligonRay()
    {
        Random r = new Random();
        theMass =-  r.nextDouble();
    }

    public void collide(Galaxy collideWith)
    {
        this.theVelocity =- (collideWith.theMass / 2);
        collideWith.theVelocity =- (this.theMass / 2);
    }
    
    public String toString()
    {
    	String galaxyStr = "";
    	galaxyStr += (theName + ":\n");
    	galaxyStr += ("\tMass: " + theMass + "\n");
    	galaxyStr += ("\tVelocity: " + theVelocity + "\n");
    	return galaxyStr;
    }
}
