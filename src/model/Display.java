package model;

/**
 * Created by kim89 on 2017-05-01.
 */

import integration.DisplayManager;

public class Display {
    DisplayManager displayManager;
    int presentQueueNo = 1;

    public Display(DisplayManager displayManager){
    }

    public void updateQueueNo(){
        presentQueueNo = displayManager.updateQueueNo(presentQueueNo);
    }
}
