package design.pattern.structural.decorator;

public class Margherita implements BasePizza{
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
