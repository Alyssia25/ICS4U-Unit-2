/**
* The hare program creates constructors.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

public class Hare extends Animalclass {
    private String color;
    private String name;
    private int maxSpeed;

    // --- Constructor starts here ---
   public Hare (String name, String color, int maxSpeed) { 
       super(name, color, maxSpeed);

       this.name = name;
       this.color = color;
       this.maxSpeed = maxSpeed;
   } 

   @Override
   // public method to accelerate
   public void accelerate(int acceleratePower, int accelerateTime) {
       int newSpeed = super.getCurrentSpeed() + (acceleratePower * accelerateTime * 8);
       super.setCurrentSpeed(newSpeed);
   }

   // public method to break
   @Override
   public void brake(int brakePower, int brakeTime) {
       int newSpeed = super.getCurrentSpeed() - (brakePower * brakeTime * 6);
       if (newSpeed < 0) {
           newSpeed = 0;
       }
   super.setCurrentSpeed(newSpeed);
   }

   // public method to provide ability
   @Override
   public String getSpecialAbility() {
       String Output = ("-> Fur-ball attack! tortoise slow down 10 seconds!");
       return Output;
   }

   // public method to return status as a string
   @Override
   public void status() {
        // Access the local 'this.' variables directly since 'getColor()' doesn't exist
        System.out.println("-> Name: " + this.name); 
        System.out.println("-> Color: " + this.color); 
        System.out.println("-> Max Speed: " + this.maxSpeed); 
        System.out.println("-> Special ability: " + this.getSpecialAbility());
   }
}
