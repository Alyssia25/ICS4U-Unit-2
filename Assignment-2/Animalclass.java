/**
* The AlyssiaStack program creates a Stack Object.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

public abstract class Animalclass {
   private String name;
   private String colour;
   private int currentSpeed;
   private int maxSpeed;

   public Animalclass(String name, String colour, int maxSpeed) {
       this.colour = colour;
       this.name = name;
       this.currentSpeed = 0;
       this.maxSpeed = maxSpeed;
   }

// Getter and setter for colour
   public String getColour() {
       return colour;
   }

   public void setColour(String colour) {
       this.colour = colour;
   }

   // Getter and setter for name
   public String getName() {
       return name;
   }

   public void setname(String name) {
       this.name = name;
   }

   // Getter and setter for current speed
   public int getCurrentSpeed() {
       return currentSpeed;
   }

   // Getter for read-only max speed
   public int getMaxSpeed() {
       return maxSpeed;
   }

   public void newSpeed(int newSpeed) {
       if (newSpeed > maxSpeed) {
           newSpeed = maxSpeed;


           if (newSpeed < 0);
           newSpeed = 0;
           currentSpeed = newSpeed;
       }
   }

   // public method to accelerate
   public void accelerate(double acceleratePower, double accelerateTime) {
       // Assume acceleratePower * accelerateTime gives the increase in speed
       this.currentSpeed += (acceleratePower * accelerateTime);
       if (this.currentSpeed > this.maxSpeed) {
           this.currentSpeed = this.maxSpeed;
       }
   }

   // public method to break
   public void brake(double brakePower, double brakeTime) {
       // Assume breakPower * breakTime gives the decrease in speed
       this.currentSpeed -= (brakePower * brakeTime);
       if (this.currentSpeed < 0) {
           this.currentSpeed = 0;  // speed cannot be negative
       }
   }

   // public method to special ability
   public abstract String getSpecialAbility();

   // public method to return status as a string
   public void status() {
       System.out.println("-> Colour: " + colour);
       System.out.println("-> Animal name: " + name);
       System.out.println("-> Current speed: " + currentSpeed + "km/h");
       System.out.println("-> MaxSpeed: " + maxSpeed + "km/h");
   }
}

