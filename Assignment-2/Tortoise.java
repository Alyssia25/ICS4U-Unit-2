/**
* The hare program creates constructors.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

class Tortoise extends to Animalclass {
   /**
       * @param name
       * @param colour
       * @param maxSpeed
*/
   public Tortoise (String name, String colour, double maxSpeed) {
       super (name, colour, maxSpeed);
   }

   // public method to accelerate
   public void accelerate(double acceleratePower,
       double accelerateTime) {
       int newSpeed = getCurrentSpeed()
       += (acceleratePower * accelerateTime * 2);
       setSpeed(newSpeed);
   }

   // public method to break
   public void brakeTortoise(double brakePower,
       double brakeTime) {
       int newSpeed = getCurrentSpeed()
       -= (brakePower * brakeTime * 4);
       setSpeed(newSpeed);
   }

   public String provideAbility {
       return SpecialAbility; + "-> Shield time! speed up for 20 seconds!";
   }

   // public method to return status as a string
   public void status() {
       System.out.println("-> Colour: " + getcolour);
       System.out.println("-> Name: " + getname);
       System.out.println("-> Speed: " + getCurrentSpeed);
       System.out.println("-> Max swpeed: " + getMaxSpeed + "km/h");
       System.out.println("-> Special ability: " + getSpecialAbility);
   }
}
