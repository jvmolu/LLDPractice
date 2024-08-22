package design.pattern.behaviorial.strategy.with;

import design.pattern.behaviorial.strategy.with.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
