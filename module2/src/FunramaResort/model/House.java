package FunramaResort.model;

public class House extends Facility {
    private String roomStandard;
    private int floorNumbers;

    public House() {
    }

    public House(String roomStandard, int floorNumbers) {
        this.roomStandard = roomStandard;
        this.floorNumbers = floorNumbers;
    }

    public House(String idFacility, String serviceName, double usableArea, double taxCosts, int maxPerson, String rentalType, String roomStandard, int floorNumbers) {
        super(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.floorNumbers = floorNumbers;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    @Override
    public String toString() {
        return "House{" +
                "idFacility" + super.getId() +
                " serviceName = " + super.getServiceName() + '\'' +
                ", usableArea = " + super.getUsableArea() +
                ", taxCosts = " + super.getTaxCosts() +
                ", maxPerson = " + super.getMaxPerson() +
                ", rentalType = " + super.getRentalType() + '\'' +
                "roomStandard = " + roomStandard + '\'' +
                ", floorNumbers = " + floorNumbers +
                '}';
    }
}
