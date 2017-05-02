package model;

import integration.DisplayManager;

/**
 * The display that displays the queue number.
 */
public class Display {
    DisplayManager displayManager;
    int currentQueueNo = 1;

    /**
     * Creates a new instance of the display.
     * @param displayManager to use when updating the display.
     */
    public Display(DisplayManager displayManager){
    }

    /**
     * This method receives help from the displayManager to update the current queue number by 1.
     */
    public void updateQueueNo(){
        currentQueueNo = displayManager.updateQueueNo(currentQueueNo);
    }
}
