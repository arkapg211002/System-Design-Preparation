package LowLevelDesign.LLDElevatorDesign;



public class InternalButtons {

    InternalDispatcher dispatcher = new InternalDispatcher();

    int[] availableButtons = {1,2,3,4,5,6,7,8,9,10};
    int buttonSelected;

    void pressButton(int destination, ElevatorCar elevatorCar) {

        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }

}
