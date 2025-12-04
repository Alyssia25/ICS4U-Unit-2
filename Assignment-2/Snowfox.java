/**
* The hare program creates constructors.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

class Snowfox extends Animalclass {
   /**
       * @param name
       * @param colour
       * @param maxSpeed
*/
    @Override
    public Snowfox (String name, String colour, double maxSpeed) {
       super (name, colour, maxSpeed);
   }

    // public method to accelerate
    @Override
    public void accelerate(double acceleratePower, double accelerateTime) {
       double newSpeed = getCurrentSpeed() + (acceleratePower * accelerateTime * 8);
       setSpeed(newSpeed);
   }

    // public method to break
    @Override
    public void brake(double brakePower, double brakeTime) {
        double newSpeed = getCurrentSpeed() - (brakePower * brakeTime * 6);
        if (newSpeed < 0) {
        newSpeed = 0;
        }
    setSpeed(newSpeed);
   }

    // public method to provide ability
    @Override
    public String provideAbility() {
        System.out.println("-> Ice attack! gray-wolf freeze for 25 seconds!");
        return SpecialAbility;
   }

    // public method to return status as a string
    @Override
    public void status() {
       System.out.println("-> Colour: " + getColour());
       System.out.println("-> Name: " + getName());
       System.out.println("-> Speed: " + getCurrentSpeed());
       System.out.println("-> Max swpeed: " + getMaxSpeed() + "km/h");
       System.out.println("-> Special ability: " + getSpecialAbility());
   }
}
