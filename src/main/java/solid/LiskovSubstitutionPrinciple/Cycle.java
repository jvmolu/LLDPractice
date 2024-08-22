package solid.LiskovSubstitutionPrinciple;

public class Cycle implements Vehicle{

    // as cycle does not have an engine, we will throw an exception
    // as it is narrowing the scope of the parent class method
    // this is a violation of Liskov Substitution Principle
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Cycle does not have an engine");
    }

    @Override
    public void stopEngine() {
        throw new UnsupportedOperationException("Cycle does not have an engine");
    }

    @Override
    public void startMoving() {
        System.out.println("Cycle started moving");
    }

    @Override
    public void stopMoving() {
        System.out.println("Cycle stopped moving");
    }

    @Override
    public void accelerate() {
         throw new UnsupportedOperationException("Cycle does not have an engine");
    }
}
