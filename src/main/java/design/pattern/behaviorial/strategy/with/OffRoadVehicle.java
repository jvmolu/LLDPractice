package design.pattern.behaviorial.strategy.with;

import design.pattern.behaviorial.strategy.with.strategy.HighSpeedDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new HighSpeedDriveStrategy());
    }
}
