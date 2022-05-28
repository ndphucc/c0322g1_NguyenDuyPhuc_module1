package FunramaResort.model;

public abstract class Facility {
    private String id;
    private String serviceName;
    private double usableArea;
    private double taxCosts;
    private int maxPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idFacility, String serviceName, double usableArea, double taxCosts, int maxPerson, String rentalType) {
        this.id = idFacility;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.taxCosts = taxCosts;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String idFacility) {
        this.id = idFacility;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getTaxCosts() {
        return taxCosts;
    }

    public void setTaxCosts(double taxCosts) {
        this.taxCosts = taxCosts;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id = " + id +
                "serviceName = '" + serviceName + '\'' +
                ", usableArea = " + usableArea +
                ", taxCost = " + taxCosts +
                ", maxPerson = " + maxPerson +
                ", rentalType = '" + rentalType + '\'' +
                '}';
    }
}
