package problems.zoomcar;

import problems.zoomcar.product.Vehicle;

public class Reservation {
    Vehicle vehicle;
    String reservationId;
    Customer customer;

    String DateOfReservation;
    String DateOfReturn;
    String DateOfPickup;

    Location pickupLocation;
    Location dropLocation;

    ReservationStatus status;

    public Reservation(Vehicle vehicle, String reservationId, Customer customer, String dateOfReservation, String dateOfReturn, String dateOfPickup, Location pickupLocation, Location dropLocation, ReservationStatus status) {
        this.vehicle = vehicle;
        this.reservationId = reservationId;
        this.customer = customer;
        DateOfReservation = dateOfReservation;
        DateOfReturn = dateOfReturn;
        DateOfPickup = dateOfPickup;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public ReservationStatus getStatus() {
        return status;
    }


    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public Reservation(Vehicle vehicle, String reservationId, Customer customer, String dateOfReservation, String dateOfReturn, String dateOfPickup) {
        this.vehicle = vehicle;
        this.reservationId = reservationId;
        this.customer = customer;
        DateOfReservation = dateOfReservation;
        DateOfReturn = dateOfReturn;
        DateOfPickup = dateOfPickup;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDateOfReservation() {
        return DateOfReservation;
    }

    public void setDateOfReservation(String dateOfReservation) {
        DateOfReservation = dateOfReservation;
    }

    public String getDateOfReturn() {
        return DateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        DateOfReturn = dateOfReturn;
    }

    public String getDateOfPickup() {
        return DateOfPickup;
    }

    public void setDateOfPickup(String dateOfPickup) {
        DateOfPickup = dateOfPickup;
    }
}
