package integration;

/**
 * This class helps the display to update what is displayed.
 */
public class DisplayManager {

    /**
     * Creates a instance of DisplayManager.
     */
    public DisplayManager(){
    }

    /**
     * This method updates the current queue number by adding 1 to it if the current queue number is
     * less than 999. If not less than 999 it sets the new queue number to 1.
     * @param currentQueueNo represents the current queue number containing a value between 1 and 999.
     * @return the new queue number.
     */
    public int updateQueueNo(int currentQueueNo){
        final int lowestQueueNo = 1;
        final int highestQueueNo = 999;
        int newQueueNo;
        if (currentQueueNo < highestQueueNo)
            newQueueNo = currentQueueNo++;
        else
            newQueueNo = lowestQueueNo;
        return newQueueNo;
    }
}
