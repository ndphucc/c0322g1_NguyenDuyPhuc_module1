package FunramaResort.model;

public class Contract {
    private String contractId;
    private String bookingId;
    private double deposit;
    private double totalMoneyPayable;
    private String customerId;

    public Contract() {
    }

    public Contract(String contractId, String bookingId, double deposit, double totalMoneyPayable, String customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalMoneyPayable = totalMoneyPayable;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoneyPayable() {
        return totalMoneyPayable;
    }

    public void setTotalMoneyPayable(double totalMoneyPayable) {
        this.totalMoneyPayable = totalMoneyPayable;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                " contractId = " + contractId +
                ", bookingId = " + bookingId + '\'' +
                ", deposit = " + deposit +
                ", totalMoneyPayable = " + totalMoneyPayable +
                ", customerId = " + customerId +
                '}';
    }
}
