package integration;

/**
 * Created by kim89 on 2017-05-01.
 */
public class Garage {
int isGarageOpenOrClosed = 0;

    public Garage(){
    }

    public void openGarageDoor(){
        isGarageOpenOrClosed = 1;
    }

    public void closeGarageDoor(){
        isGarageOpenOrClosed = 0;
    }
}
