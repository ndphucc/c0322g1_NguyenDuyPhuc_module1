package FunramaResort.model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floorNumbers;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int floorNumbers) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }

    public Villa(String serviceName, double usableArea, double taxCosts, int maxPerson, String rentalType, String roomStandard, double poolArea, int floorNumbers) {
        super(serviceName, usableArea, taxCosts, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumbers=" + floorNumbers +
                '}';
    }
}
