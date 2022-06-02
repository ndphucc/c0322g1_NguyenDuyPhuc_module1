package tai_khoan_ngan_hang.model;

public class SavingAccount extends BankAccount {
    private double money;
    private String savingsDay;
    private double interestRate;
    private double tenor;

    public SavingAccount() {
    }

    public SavingAccount(String id, String accountCode, String name, String date, double money, String savingsDay, double interestRate, double tenor) {
        super(id, accountCode, name, date);
        this.money = money;
        this.savingsDay = date;
        this.interestRate = interestRate;
        this.tenor = tenor;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getAccountCode()
                , super.getName()
                , super.getDate()
                , this.getMoney()
                , this.getDate()
                , this.getInterestRate()
                , this.getTenor());
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String getDate() {
        return savingsDay;
    }

    @Override
    public void setDate(String Date) {
        this.savingsDay = Date;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getTenor() {
        return tenor;
    }

    public void setTenor(double tenor) {
        this.tenor = tenor;
    }


    @Override
    public String toString() {
        return "SavingAccount{" +
                "money=" + money +
                ", date='" + savingsDay + '\'' +
                ", interestRate=" + interestRate +
                ", tenor=" + tenor +
                '}';
    }
}
