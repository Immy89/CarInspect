package controller;

import model.Display;
import integration.Garage;

/**
 * This is the application's single controller. All calls to the model pass through here.
 */
public class Controller {
    Display display;
    Garage garage;

    /**
     * Creates a new instance using the specified ...
     *
     * @param
     */
    public Controller(){

    }

    /**
     * This method specifies that a new inspection is about to start and therefor updates the
     * present queue number on the display and opens the door.
     */
    public void newInspection(){
        display.updateQueueNo();
        garage.openGarageDoor();
    }

    /**
     * This method closes the garage door.
     */
    public void closeGarageDoor(){
        garage.closeGarageDoor();
    }
}
