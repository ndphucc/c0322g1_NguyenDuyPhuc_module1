package FunramaResort.services.impl;

import FunramaResort.model.*;
import FunramaResort.services.BookingService;
import FunramaResort.utils.BookingComparator;
import FunramaResort.utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static final String BOOKING_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\booking.csv";

    @Override
    public void add() {
        read();

        String customerId = chooseCustomer().getId();

        Facility facility = chooseFacility();

        String facilityId = facility.getId();

        String bookingId = "" + findID();

        System.out.println("Nhập ngày bắt đầu ");
        String startDay = scanner.nextLine();

        System.out.println("Nhập ngày kết thúc");
        String endDay = scanner.nextLine();

        bookingSet.add(new Booking(bookingId, startDay, endDay, customerId, facilityId));
        setValueBooking(facility);
        System.out.println("Bạn đã thêm thành công");
        write();
    }

    public static void write() {
        ReadAndWriteFile.clearFile(BOOKING_PATH);
        for (Booking item : bookingSet) {
            String line = item.getBookingId() + ","
                    + item.getStartDay() + ","
                    + item.getEndDay() + ","
                    + item.getCustomerId() + ","
                    + item.getFacilityId();
            ReadAndWriteFile.writeFile(BOOKING_PATH, line);
        }
    }

    public static void read() {
        List<String[]> strings = ReadAndWriteFile.readFile(BOOKING_PATH);
        bookingSet.clear();
        for (String[] item : strings) {
            bookingSet.add(new Booking(item[0], item[1], item[2], item[3], item[4]));
        }
    }

    @Override
    public void display() {
        read();
        for (Booking item : bookingSet) {
            System.out.println(item);
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        new CustomerServiceImpl().display();

        System.out.println("Nhập id khách hàng");
        String id = scanner.nextLine();

        while (true) {
            for (Customer item : CustomerServiceImpl.customerList) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            System.out.println("Bạn đã nhập sai hãy nhập lại");
            id = scanner.nextLine();
        }
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sach dich vu");
        new FacilityServiceImpl().display();

        System.out.println("Nhập id dịch vụ");
        String id = (scanner.nextLine());

        while (true) {
            Set<House> houseSet = FacilityServiceImpl.houseList.keySet();
            for (House item : houseSet) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            Set<Villa> villaSet = FacilityServiceImpl.villaList.keySet();
            for (Villa item : villaSet) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            Set<Room> roomSet = FacilityServiceImpl.roomList.keySet();
            for (Room item : roomSet) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            System.out.println("Bạn đã nhập sai hãy nhập lại");
            id = (scanner.nextLine());
        }
    }

    public static void setValueBooking(Object obj) {
        if (obj instanceof Villa) {
            FacilityServiceImpl.readVillaFile();
            Set<Villa> villaSet = FacilityServiceImpl.villaList.keySet();
            for (Villa item : villaSet) {
                if (((Villa) obj).getId().equals(item.getId())) {
                    int value = FacilityServiceImpl.villaList.get(item);
                    FacilityServiceImpl.villaList.remove(item);
                    FacilityServiceImpl.villaList.put(item, value + 1);
                    FacilityServiceImpl.writeVillaFile();
                    return;
                }
            }
        } else if (obj instanceof House) {
            FacilityServiceImpl.readHouseFile();
            Set<House> houseSet = FacilityServiceImpl.houseList.keySet();
            for (House item : houseSet) {
                if (((House) obj).getId().equals(item.getId())) {
                    int value = FacilityServiceImpl.houseList.get(item);
                    FacilityServiceImpl.houseList.remove(item);
                    FacilityServiceImpl.houseList.put(item, value + 1);
                    FacilityServiceImpl.writeHouseFile();
                    return;
                }
            }
        } else {
            FacilityServiceImpl.readRoomFile();
            Set<Room> roomSet = FacilityServiceImpl.roomList.keySet();
            for (Room item : roomSet) {
                if (((Room) obj).getId().equals(item.getId())) {
                    int value = FacilityServiceImpl.roomList.get(item);
                    FacilityServiceImpl.roomList.remove(item);
                    FacilityServiceImpl.roomList.put(item, value + 1);
                    FacilityServiceImpl.writeRoomFile();
                    return;
                }
            }
        }
    }

    public int findID() {
        int id = 0;
        for (Booking booking : bookingSet) {
            if (id < Integer.parseInt(booking.getBookingId())) {
                id = Integer.parseInt(booking.getBookingId());
            }
        }
        return id + 1;
    }
}
