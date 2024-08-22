package problems.zoomcar.product;

public enum VehicleAvailability {
    AVAILABLE("Available"),
    BOOKED("Booked");

    private final String availability;

    VehicleAvailability(String availability) {
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }
}
