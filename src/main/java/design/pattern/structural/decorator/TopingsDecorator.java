package design.pattern.structural.decorator;

public abstract class TopingsDecorator implements BasePizza {

    protected BasePizza basePizza;

    public TopingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();
}
