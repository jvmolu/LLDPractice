package problems.zoomcar;

import problems.zoomcar.Reservation;

import java.util.ArrayList;

public class ReservationManager {

    ArrayList<Reservation> reservations;


    public ReservationManager() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void updateReservation(Reservation reservation) {
        for (Reservation r : reservations) {
            if (r.getReservationId().equals(reservation.getReservationId())) {
                r = reservation;
            }
        }
    }
    public Reservation getReservationByID(String reservationId) {
        for(Reservation reservation : reservations) {
            if(reservation.getReservationId().equals(reservationId)) {
                return reservation;
            }
        }
        return null;
    }
}
