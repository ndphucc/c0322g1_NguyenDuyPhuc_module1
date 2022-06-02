package tai_khoan_ngan_hang.model;

public abstract class BankAccount {
    private String id;
    private String accountCode;
    private String name;
    private String date;

    public BankAccount() {
    }

    public BankAccount(String id, String accountCode, String name, String date) {
        this.id = id;
        this.accountCode = accountCode;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", accountCode='" + accountCode + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
