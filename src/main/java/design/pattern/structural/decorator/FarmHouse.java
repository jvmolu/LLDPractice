package design.pattern.structural.decorator;

public class FarmHouse implements BasePizza{
    @Override
    public String getDescription() {
        return "FarmHouse";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
