package solid.InterfaceSegmentedPrinciple;

public class Bike implements BikeInterface, Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bike engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped");
    }

    @Override
    public void startMoving() {
        System.out.println("Bike started moving");
    }

    @Override
    public void stopMoving() {
        System.out.println("Bike stopped moving");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }

    // bike specific methods
    @Override
    public void kickStart() {
        System.out.println("Bike is kick started");
    }

    @Override
    public void stopKickStart() {
        System.out.println("Bike is stopped kick started");
    }


    @Override
    public void turnOnHeadlight() {
        System.out.println("Headlight is on");
    }

    @Override
    public void turnOffHeadlight() {
        System.out.println("Headlight is off");
    }

}
