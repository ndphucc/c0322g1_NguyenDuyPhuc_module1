package FunramaResort.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String serviceName, double usableArea, double taxCosts, int maxPerson, String rentalType, String freeService) {
        super(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                " idFacility = " + super.getId() +
                ",serviceName = " + super.getServiceName() + '\'' +
                ", usableArea = " + super.getUsableArea() +
                ", taxCosts = " + super.getTaxCosts() +
                ", maxPerson = " + super.getMaxPerson() +
                ", rentalType = " + super.getRentalType() + '\'' +
                "freeService = " + freeService + '\'' +
                '}';
    }
}
