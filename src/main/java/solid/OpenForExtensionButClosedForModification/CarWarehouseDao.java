package solid.OpenForExtensionButClosedForModification;

public class CarWarehouseDao implements CarDao {

    private final Car car;

    public CarWarehouseDao(Car car) {
        this.car = car;
    }

    @Override
    public void saveCar() {
        // print this.car saved to database
        System.out.println(this.car + " saved to warehouse");
    }
}
