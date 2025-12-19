/**
* The hare program creates constructors.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

public class Snowfox extends Animalclass {
   /**
    * add a variable for color as a string.
    */
   private String color;

   /**
    * add a variable for name as a string.
    */
   private String name;

   /**
    * add a variable for maxSpeed as int.
    */
   private int maxSpeed;

       /**
    * add a variable for magic number as int.
   */
   private final int eight = 8;

       /**
    * add a variable for magic number as int.
   */
   private final int six = 6;


   /**
    * @param startingName
    * @param rareColor
    * @param showMaxSpeed
    */
   public Snowfox(final String startingName,
       final String rareColor, final int showMaxSpeed) {
       super(startingName, rareColor, showMaxSpeed);

       this.name = startingName;
       this.color = rareColor;
       this.maxSpeed = showMaxSpeed;
   }

   /**
    * public method to accelerate.
    * @param acceleratePower
    * @param accelerateTime
    */
       public void accelerate(final int acceleratePower,
       final int accelerateTime) {
       int accelerate = super.getCurrentSpeed()
      + (acceleratePower * accelerateTime * eight);
       super.setCurrentSpeed(accelerate);
   }

   /**
    * public method to break.
    * @param brakePower
    * @param brakeTime
    */
   public void brake(final int brakePower,
       final int brakeTime) {
       int brake = super.getCurrentSpeed()
      - (brakePower * brakeTime * six);
       if (brake < 0) {
           brake = 0;
       }
   super.setCurrentSpeed(brake);
   }


   /**
    *  public method to provide ability.
    * @return Output
    */
   public String getSpecialAbility() {
       String Output = ("-> Ice attack! gray-wolf freeze for 25 seconds!");
       return Output;
   }

   /**
    *  public method to return status as a string.
    */
   public void status() {
       System.out.println("-> Name: " + this.name);
       System.out.println("-> Color: " + this.color);
       System.out.println("-> Max Speed: " + this.maxSpeed + "km/h");
       System.out.println("-> Special ability: " + this.getSpecialAbility());
   }
}
