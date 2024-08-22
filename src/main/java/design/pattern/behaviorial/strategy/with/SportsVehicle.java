package design.pattern.behaviorial.strategy.with;

import design.pattern.behaviorial.strategy.with.strategy.HighSpeedDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new HighSpeedDriveStrategy());
    }


}
