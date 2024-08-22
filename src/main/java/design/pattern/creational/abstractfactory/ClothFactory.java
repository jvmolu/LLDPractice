package design.pattern.creational.abstractfactory;

public class ClothFactory {
    public static BrandFactory getBrandFactory(String brand) {
        if (brand.equalsIgnoreCase("puma")) {
            return new PumaFactory();
        } else if (brand.equalsIgnoreCase("HnM")) {
            return new HnMFactory();
        } else if(brand.equalsIgnoreCase("forever21")) {
            return new Forever21Factory();
        } else {
            return null;
        }
    }
}
