package problems.zoomcar;

public enum BillStatus {

            PENDING("pending"),
            PAID("paid"),
            CANCELLED("cancelled");

            private final String status;

            BillStatus(String status) {
                this.status = status;
            }
}
