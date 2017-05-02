package integration;

/**
 * The Garage that the inspection is performed in.
 */
public class Garage {
    boolean isGarageOpen = false;

    /**
     * Creates a new instance of Garage.
     */
    public Garage(){
    }

    /**
     * This method sets isGarageOpen to true to show that the garage is open.
     */
    public void openGarageDoor(){
        isGarageOpen = true;
    }

    /**
     * This method sets isGarageOpen to false to show that the garage is closed.
     */
    public void closeGarageDoor(){
        isGarageOpen = false;
    }
}
