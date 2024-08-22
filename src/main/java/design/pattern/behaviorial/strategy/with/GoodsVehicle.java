package design.pattern.behaviorial.strategy.with;

import design.pattern.behaviorial.strategy.with.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
