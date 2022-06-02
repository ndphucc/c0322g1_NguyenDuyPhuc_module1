package FunramaResort.model;

public class Booking {
    private String bookingId;
    private String startDay;
    private String endDay;
    private String customerId;
    private String facilityId;

    public Booking() {
    }

    public Booking(String bookingId, String startDay, String endDay, String customerId, String facilityId) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.facilityId = facilityId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    @Override
    public String toString() {
        return "Booking{" +
                " bookingId = " + bookingId +
                ", startDay = " + startDay + '\'' +
                ", endDay = " + endDay + '\'' +
                ", customerId = " + customerId + '\'' +
                ",facilityId = " + facilityId + '\'' +
                '}';
    }
}
