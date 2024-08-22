package design.pattern.structural.decorator;

public class ExtraMushroom extends TopingsDecorator {

    public ExtraMushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with Extra Mushroom";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 30;
    }
}
