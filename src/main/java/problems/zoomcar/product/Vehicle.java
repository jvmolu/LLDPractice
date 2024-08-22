package problems.zoomcar.product;

public class Vehicle {
    int vehicleID;

    int vehicleNumber;
    String vehicleName;
    VehicleType vehicleType;
    int dailyRentalRate;
    int hourlyRentalRate;
    int refundableDeposit;
    VehicleAvailability vehicleAvailability;
    int vehicleRating;
    String CompanyName;




    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getDailyRentalRate() {
        return dailyRentalRate;
    }

    public void setDailyRentalRate(int dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

    public int getHourlyRentalRate() {
        return hourlyRentalRate;
    }

    public void setHourlyRentalRate(int hourlyRentalRate) {
        this.hourlyRentalRate = hourlyRentalRate;
    }

    public int getRefundableDeposit() {
        return refundableDeposit;
    }

    public void setRefundableDeposit(int refundableDeposit) {
        this.refundableDeposit = refundableDeposit;
    }

    public VehicleAvailability getVehicleAvailability() {
        return vehicleAvailability;
    }

    public void setVehicleAvailability(VehicleAvailability vehicleAvailability) {
        this.vehicleAvailability = vehicleAvailability;
    }

    public int getVehicleRating() {
        return vehicleRating;
    }

    public void setVehicleRating(int vehicleRating) {
        this.vehicleRating = vehicleRating;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

}
