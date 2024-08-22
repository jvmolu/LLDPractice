package solid.LiskovSubstitutionPrinciple;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
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
}
