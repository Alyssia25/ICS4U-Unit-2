/**
* The AlyssiaStack program creates a Stack Object.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

public abstract class Animalclass {
   /**
    * add a variable for name as a string.
   */
   private String name;

   /**
    * add a variable for color as a string.
   */
   private String colour;

   /**
    * add a variable for currentSpeed as an int.
   */
   private int currentSpeed;

   /**
    * add a variable for maxSpeed as an final int.
   */
   private final int maxSpeed;

       /**
    * @param startingName
    * @param rareColor
    * @param showMaxSpeed
    */
   public Animalclass(final String startingName, final String rareColor,
       final int showMaxSpeed) {
       this.colour = rareColor;
       this.name = startingName;
       this.currentSpeed = 0;
       this.maxSpeed = showMaxSpeed;
   }

   /**
       * Getter for colour.
       * @return colour
   */
   public String getColour() {
       return colour;
   }

   /**
       * Setter for colour.
       * @param rareColor
   */
   public void setColour(final String rareColor) {
       this.colour = rareColor;
   }

   /**
       * Getter for name.
       * @return name
   */
   public String getName() {
       return name;
   }

   /**
       * Setter for name.
       * @param startingName
   */
   public void setname(final String startingName) {
       this.name = startingName;
   }

   /**
       * Getter for current speed.
       * @return currentSpeed
   */
   public int getCurrentSpeed() {
       return this.currentSpeed;
       }

   /**
       *Setter for current speed.
       * @param speed
   */
   public void setCurrentSpeed(final int speed) {
       this.currentSpeed = maxSpeed;
       }

   /**
       * Getter for read-only max speed.
       * @return maxSpeed
    */
   public int getMaxSpeed() {
       return maxSpeed;
   }

   /**
    * public method to accelerate.
    * @param acceleratePower
    * @param accelerateTime
   */
   public abstract void accelerate(int acceleratePower,
       int accelerateTime);

   /**
    * public method to break.
    * @param brakePower
    * @param brakeTime
   */
   public abstract void brake(int brakePower, int brakeTime);

   /**
    * public method to SpecialAbility.
    * @return SpecialAbility
   */
   public abstract String getSpecialAbility();

   /**
    *  public method to return status as a string.
   */
   public void status() {
       System.out.println("-> Colour: " + colour);
       System.out.println("-> Animal name: " + name);
       System.out.println("-> Current speed: " + currentSpeed + "km/h");
       System.out.println("-> MaxSpeed: " + maxSpeed + "km/h");
   }
}
