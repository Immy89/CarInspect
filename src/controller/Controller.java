package controller;

/**
 * This is the application's single controller. All calls to the model pass through here.
 */

import model.Display;
import integration.Garage;

public class Controller {
    Display display;
    Garage garage;
    /**
     * Creates a new instance using the specified database manager.
     *
     * @param
     */
    public Controller(){

    }

    public void newInspection(){
        display.updateQueueNo();
        garage.openGarageDoor();
    }

    public void closeGarageDoor(){
        garage.closeGarageDoor();
    }
}
