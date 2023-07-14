package LowLevelDesign.LLDElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {

    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {

        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.id =1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar1.id =2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}
