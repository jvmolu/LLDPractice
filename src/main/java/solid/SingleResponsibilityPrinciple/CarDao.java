package solid.SingleResponsibilityPrinciple;

public class CarDao {

    private final Car car;

    public CarDao(Car car) {
        this.car = car;
    }

    public void saveCar() {
        // print this.car saved to database
        System.out.println(this.car + " saved to database");
    }

}
