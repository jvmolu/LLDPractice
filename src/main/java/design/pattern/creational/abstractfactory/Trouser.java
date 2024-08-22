package design.pattern.creational.abstractfactory;

public class Trouser implements Cloth {

    private String color;
    private String size;
    private String type;

    public Trouser(String color, String size, String type) {
        this.color = color;
        this.size = size;
        this.type = type;
    }

    @Override
    public String getColor() {
        System.out.println("Color : " + color);
        return color;
    }

    @Override
    public String getSize() {
        System.out.println("Size : " + size);
        return size;
    }

    @Override
    public String getType() {
        System.out.println("Type : " + type);
        return type;
    }
}
