/**
 *   Class named "Cheese" (object)
 *   B.Due 2015
 */

public class Cheese         // Class "Cheese"
{       
    private double weight;      // 'instance' field (variable)
         
        // Note! Constructor, same name as class!
    public Cheese()      // default Constructor : make a Cheese object,
                                       //  3 lbs. if not weight not assigned 
        {     
           weight = 3.0 ;
        } 
    public Cheese (double weightAmount)   // Constructor directly assigns instance variable
        {
            weight = weightAmount;
        }       
  
    public double getWeight ()  // "Accessor" method (returns info, does not change object)
        {  
            return weight;
        }  
        
    public void eatCheese(int bites) // "Modifier/Mutator" method, changes instance variable
        {
            weight = weight - .1*bites;
        }         
}
