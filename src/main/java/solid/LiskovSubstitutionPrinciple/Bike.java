package solid.LiskovSubstitutionPrinciple;

public class Bike implements Vehicle{
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
}
