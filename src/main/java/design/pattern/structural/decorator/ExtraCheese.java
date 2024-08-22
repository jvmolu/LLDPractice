package design.pattern.structural.decorator;

public class ExtraCheese extends TopingsDecorator {

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with Extra Cheese";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 50;
    }
}
