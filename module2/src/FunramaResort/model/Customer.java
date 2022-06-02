package FunramaResort.model;

public class Customer extends Person {
    private String customerLevel;
    private String address;

    public Customer() {
    }

    public Customer(String customerLevel, String address) {
        this.customerLevel = customerLevel;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String citizenIdentification, String phoneNumber, String email, String customerLevel, String address) {
        super(id, name, dateOfBirth, gender, citizenIdentification, phoneNumber, email);
        this.customerLevel = customerLevel;
        this.address = address;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
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
                " id = " + super.getId() +
                ", name = " + super.getName() + '\'' +
                ", dateOfBirth = " + super.getDateOfBirth() + '\'' +
                ", gender = " + super.getGender() + '\'' +
                ", citizenIdentification = " + super.getCitizenIdentification() + '\'' +
                ", phoneNumber = " + super.getPhoneNumber() + '\'' +
                ", email = " + super.getEmail() + '\'' +
                "customerLevel = " + customerLevel + '\'' +
                ", address = " + address + '\'' +
                '}';
    }
}
