package problems.zoomcar;

public enum ReservationStatus {

        PENDING("pending"),
        CONFIRMED("confirmed"),
        CANCELLED("cancelled"),
        COMPLETED("completed");

        private final String status;

        ReservationStatus(String status) {
            this.status = status;
        }
}
