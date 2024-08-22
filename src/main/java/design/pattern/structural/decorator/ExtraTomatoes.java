package design.pattern.structural.decorator;

public class ExtraTomatoes extends TopingsDecorator {

    public ExtraTomatoes(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with Extra Tomatoes";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 20;
    }
}
