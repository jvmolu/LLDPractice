package solid.InterfaceSegmentedPrinciple;

public class Car implements CarInterface, Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public void startMoving() {
        System.out.println("Car started moving");
    }

    @Override
    public void stopMoving() {
        System.out.println("Car stopped moving");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    // car specific methods
    @Override
    public void trunOnAC() {
        System.out.println("AC is on");
    }

    @Override
    public void turnOffAC() {
        System.out.println("AC is off");
    }

    @Override
    public void trunkOpen() {
        System.out.println("Trunk is open");
    }

    @Override
    public void trunkClose() {
        System.out.println("Trunk is closed");
    }
}
