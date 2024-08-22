package problems.zoomcar;

public class Payment {
    String paymentId;
    Bill bill;

    public Payment(String paymentId, Bill bill) {
        this.paymentId = paymentId;
        this.bill = bill;
    }

    public void makePayment() {
        bill.billStatus = BillStatus.PAID;
    }
}
