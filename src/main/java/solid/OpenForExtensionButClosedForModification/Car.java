package solid.OpenForExtensionButClosedForModification;

public class Car {
    // example of a class that is open for extension but closed for modification
    private String name;
    private String color;
    private String model;

    public Car(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Car repainted to " + color);
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("Car model changed to " + model);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Car name changed to " + name);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    // save car to database method in dao class

}
