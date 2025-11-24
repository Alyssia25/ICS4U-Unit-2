/*


* This is the main code that runs with the Vehicle Class.


*


* @author  Alyssia


* @version 1.0


* @since   2025-11-17


*/


/**
*
* This is the Main program.
*
*/

class Vehicle {

#include <iostream>
#include <string>


using namespace std;


int main() {
    string statusString = "Status:";
    string newSpeedString = "New speed: ";
    string newColorString = "New color: ";
    string changingColorString = "Changing color: ";


    const int fourConst = 4;
    const int twoHundredEightyFourConst = 284;
    const int tenConst = 10;
    const int threeHundredTwentyConst = 320;
    const int oneHundredConst = 100;
    const int fortyFiveConst = 45;
    const int fiveConst = 5;


    cout << "Created Ford focus" << endl;
    Vehicle fordFocus("840-C4RRO", "white", 4, 204);
    cout << "status:" << endl;
    fordFocus.status();
    cout << "Accelerating, 10 of power for 10 sec." << endl;
    fordFocus.accelerate(10, 10);
    cout << "New speed: " << fordFocus.getSpeed() << endl;
    cout << "Changing colour to black:" << endl;
    fordFocus.setColour("black");
    cout << "New colour: " << fordFocus.getColour() << endl;
    cout << endl;


    // New Ferrari
    cout << "Created a Ferrari" << endl;
    Vehicle ferrari("VHD-35HU", "red", 2, 320);
    cout << "status:" << endl;
    ferrari.status();
    cout << "Accelerating, 100 of power for 4 sec." << endl;
    ferrari.accelerate(100, 4);
    cout << newSpeedString << ferrari.getSpeed() << endl;
    cout << "Breaking, 10 of power for 10 sec." << endl;
    ferrari.brakeVehicle(10, 10);
    cout << "New speed: " << ferrari.getSpeed() << endl;
    cout << "Changing colour: ";
    ferrari.setColour("racing red"); // Corrected typo in color name
    cout << "New colour: " << ferrari.getColour() << endl;
    cout << endl;


    // New Citroen Ami
    cout << "Created a Citroen Ami" << endl;
    Vehicle citroenAmi("FS-005-00", "blue", 5, 45);
    cout << "status:" << endl;
    citroenAmi.status();
    cout << "Accelerating, 5 of power for 10 sec." << endl;
    citroenAmi.accelerate(5, 10);
    cout << "New speed: " << citroenAmi.getSpeed() << endl;
    cout << "Breaking, 2 of power for 10 sec." << endl;
    citroenAmi.brakeVehicle(2, 10);
    cout << "New speed: " << citroenAmi.getSpeed() << endl;
    cout << "Changing colour: " << endl;
    citroenAmi.setColour("purple");
    cout << "New colour: " << citroenAmi.getColour() << endl;
    cout << endl;


    cout << "\ndone. " << endl;
    return 0;
    }
}
