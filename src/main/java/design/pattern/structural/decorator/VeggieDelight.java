package design.pattern.structural.decorator;

public class VeggieDelight implements BasePizza{
    @Override
    public String getDescription() {
        return "VeggieDelight";
    }

    @Override
    public double getCost() {
        return 150;
    }
}

