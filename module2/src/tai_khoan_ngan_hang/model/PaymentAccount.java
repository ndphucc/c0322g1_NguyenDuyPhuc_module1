package tai_khoan_ngan_hang.model;

public class PaymentAccount extends BankAccount {
    private int cardNumber;
    private double money;

    public PaymentAccount() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getAccountCode()
                , super.getName()
                , super.getDate()
                , this.getCardNumber()
                , this.getMoney());
    }

    public PaymentAccount(String id, String accountCode, String name, String date, int cardNumber, double money) {
        super(id, accountCode, name, date);
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "cardNumber=" + cardNumber +
                ", money=" + money +
                '}';
    }
}
