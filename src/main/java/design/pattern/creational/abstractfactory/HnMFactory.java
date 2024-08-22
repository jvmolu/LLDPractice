package design.pattern.creational.abstractfactory;

public class HnMFactory implements BrandFactory{
    @Override
    public Cloth getCloth(String clothType) {
        if (clothType == null) {
            return null;
        }
        if (clothType.equalsIgnoreCase("TSHIRTS")) {
            return new TShirt("Red", "M", "Round Neck");
        } else if (clothType.equalsIgnoreCase("TROUSERS")) {
            return new Trouser("Blue", "32", "Slim Fit");
        } else if (clothType.equalsIgnoreCase("SKIRTS")) {
            return new Skirt("Black", "S", "Mini Skirt");
        }
        return null;
    }
}
