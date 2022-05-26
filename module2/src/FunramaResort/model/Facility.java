package FunramaResort.model;

public abstract class Facility {
    private String idFacility;
    private String serviceName;
    private double usableArea;
    private double taxCosts;
    private int maxPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idFacility,String serviceName, double usableArea, double taxCosts, int maxPerson, String rentalType) {
        this.idFacility=idFacility;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.taxCosts = taxCosts;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
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
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", taxCosts=" + taxCosts +
                ", maxPerson=" + maxPerson +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
