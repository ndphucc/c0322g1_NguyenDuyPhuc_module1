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
    public void addBooking() {
        readBooking();
        String customerId = chooseCustomer().getId();
        Facility facility = chooseFacility();
        String facilityId = facility.getId();
        System.out.println("Nhập id");
        String bookingId = scanner.nextLine();
        System.out.println("Nhập ngày bắt đầu ");
        String startDay = scanner.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String endDay = scanner.nextLine();
        bookingSet.add(new Booking(bookingId, startDay, endDay, customerId, facilityId));
        setValueBooking(facility);
        writeBooking();
    }

    public static void writeBooking() {
        ReadAndWriteFile.clearFile(BOOKING_PATH);
        for (Booking item : bookingSet) {
            String line = item.getBookingId() + ","
                    + item.getStartDay() + ","
                    + item.getEndDay() + ","
                    + item.getCustomerId() + ","
                    + item.getFacilityId();
            ReadAndWriteFile.writeFile(BOOKING_PATH,line);
        }
    }
    public static void readBooking() {
        List<String[]> strings= ReadAndWriteFile.readFile(BOOKING_PATH);
        bookingSet.clear();
        for (String[] item: strings) {
            bookingSet.add(new Booking(item[0],item[1],item[2],item[3],item[4]));
        }
    }

    @Override
    public void displayListBooking() {
        readBooking();
        for (Booking item : bookingSet) {
            System.out.println(item);
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        new CustomerServiceImpl().display();
        System.out.println("Nhập id khách hàng");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Customer item : CustomerServiceImpl.customerList) {
                if (item.getId().equals(id)) {
                    check = false;
                    return item;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai hãy nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sach dich vu");
        new FacityServiceImpl().display();
        System.out.println("Nhập id dịch vụ");
        boolean check = true;
        String id = (scanner.nextLine());
        while (check) {
            Set<House> houseSet = FacityServiceImpl.houseList.keySet();
            for (House item : houseSet) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            Set<Villa> villaSet = FacityServiceImpl.villaList.keySet();
            for (Villa item : villaSet) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            Set<Room> roomSet = FacityServiceImpl.roomList.keySet();
            for (Room item : roomSet) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai hãy nhập lại");
                id = (scanner.nextLine());
            }
        }
        return null;
    }
    public static void setValueBooking(Object obj) {
        if (obj instanceof Villa) {
            FacityServiceImpl.readVillaFile();
            Set<Villa> villaSet = FacityServiceImpl.villaList.keySet();
            for (Villa item: villaSet) {
                if (((Villa) obj).getId().equals(item.getId())) {
                    int value = FacityServiceImpl.villaList.get(item);
                    FacityServiceImpl.villaList.remove(item);
                    FacityServiceImpl.villaList.put(item,value+1);
                    FacityServiceImpl.writeVillaFile();
                    return;
                }
            }
        }
        else if (obj instanceof House) {
            FacityServiceImpl.readHouseFile();
            Set<House> houseSet = FacityServiceImpl.houseList.keySet();
            for (House item: houseSet) {
                if (((House) obj).getId().equals(item.getId())) {
                    int value = FacityServiceImpl.houseList.get(item);
                    FacityServiceImpl.houseList.remove(item);
                    FacityServiceImpl.houseList.put(item,value+1);
                    FacityServiceImpl.writeHouseFile();
                    return;
                }
            }
        }
        else  {
            FacityServiceImpl.readRoomFile();
            Set<Room> roomSet = FacityServiceImpl.roomList.keySet();
            for (Room item: roomSet) {
                if (((Room) obj).getId().equals(item.getId())) {
                    int value = FacityServiceImpl.roomList.get(item);
                    FacityServiceImpl.roomList.remove(item);
                    FacityServiceImpl.roomList.put(item,value+1);
                    FacityServiceImpl.writeRoomFile();
                    return;
                }
            }
        }
    }
}
