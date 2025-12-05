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

    // Getter and Setter for current speed (used in Hare class)
    public int getCurrentSpeed() { 
        return this.currentSpeed; 
        }
    public void setCurrentSpeed(int speed) { 
        this.currentSpeed = speed; 
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
           this.currentSpeed = newSpeed;
       }
   }
       
    // public method to accelerate
    public abstract void accelerate(int acceleratePower, int accelerateTime);

   // public method to break
   public abstract void brake(int brakePower, int brakeTime);

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
