/*
   * copyright (5) 2025 Alyssia fung
* The Vehicle Class creat a vehicle
*
* @author  Alyssia
* @version 1.0
* @since   2025-11-17
*/


    #include <iostream>
    #include <string>
    #include <algorithm>  // required for std::min and std::max


class Vehicleclass {
    private:
    std::string colour;
    std::string licensePlate;
    const int numberofDoors;
    double speed;
    const int maxSpeed;


public:
    // Constructor
    Vehicleclass(std::string licensePlate, std::string colour, int numberofDoors, int maxSpeed) {
        this->licensePlate(licensePlate)
        this->colour(colour)
        this->numberofDoors(numberofDoors)
        this->maxSpeed(maxSpeed) 
        this->speed = 0.0;
    }


   // Getter and setter for license plate number
    std::string getLicensePlateNumber() const {
        return licensePlate;
    }


    void setLicensePlatenumber(std::string licensePlate) {
        this->licensePlate = licensePlate;
    }


    // Getter and setter for colour
    std::string getColour() const {
        return colour;
    }


    void setColour(std::string colour) {
        this->colour = colour;
    }


    // Getter for read-only number of doors
    int getNumberOfDoors() const {
        return numberofDoors;
    }


    // Getter for read-only speed
    double getSpeed() const {
        return speed;
    }


    // Getter for read-only max speed
    int getMaxSpeed() const {
        return maxSpeed;
    }


    // public method to accelerate
    void accelerate(double acceleratePower, double accelerateTime) {
       // Assume acceleratePower * accelerateTime gives the increase in speed
        this->speed += (acceleratePower*accelerateTime);
       // use std::min to ensure speed doesn't exceed maxSpeed
        this->speed = std::min(this->speed, (double)this->maxSpeed);
    }


    // public method to break
    void brakeVehicle(double brakePower, double brakeTime) {
       // Assume breakPower * breakTime gives the decrease in speed
       this->speed -= (brakePower * brakeTime);
       // use std::maax to ensure speed doesn't go below 0
        this->speed = std::max(this->speed, 0.0);
    }


   // public method to return status as a string (void return as in original)
   void status() const {  // Mark method as const since it doesn't modify object state
        std::cout << "-> Colour: " << colour << std::endl;
        std::cout << "-> License: " << licensePlate << std::endl;
        std::cout << "-> Door: " << numberofDoors << std::endl;
        std::cout << "-> Speed: " << speed << std::endl;
        std::cout << "-> MaxSpeed: " << maxSpeed << "km/h" << std::endl;


        return 0;
    }
}
