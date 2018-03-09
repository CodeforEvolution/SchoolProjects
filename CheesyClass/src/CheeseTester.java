/**
 *  This is a 'tester' or 'driver' to implement the Cheese class.
 */

public class CheeseTester
{
     public static void main( String[] args )
  {
      Cheese block1 = new Cheese();     // construct 'default' Cheese object (note 'new')
      System.out.println( block1.getWeight() );     // print weight
      block1.eatCheese(2);                          // 'eat' some of cheese
      System.out.println( block1.getWeight() );     // print weight
      System.out.println();
      
      Cheese block2 = new Cheese(10.0); // construct another Cheese, ‘assign’ weight
      System.out.println( block2.getWeight() );     // print weight
      block2.eatCheese(1);                          // 'eat' some of cheese
      System.out.println( block2.getWeight() );     // print weight
      System.out.println();
      
      Cheese block3 = new Cheese();
      block3.eatCheese(5);
      System.out.println(block3.getWeight());
      System.out.println();
      
      Cheese block4 = new Cheese(20.0);
      block4.eatCheese(10);
      System.out.println(block4.getWeight());
      System.out.println();
  }
}
