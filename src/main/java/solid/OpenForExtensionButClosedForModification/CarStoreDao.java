package solid.OpenForExtensionButClosedForModification;

public class CarStoreDao implements CarDao {
    private final Car car;

    public CarStoreDao(Car car) {
        this.car = car;
    }

    @Override
    public void saveCar() {
        // print this.car saved to database
        System.out.println(this.car + " saved to store");
    }
}
