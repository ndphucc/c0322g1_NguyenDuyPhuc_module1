package casestudy.models.preson;

import java.util.Date;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String age, boolean gender, int identityCard, int phoneNumber, String mail, String customerType, String address) {
        super(id, name, age, gender, identityCard, phoneNumber, mail);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerCode=" +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

