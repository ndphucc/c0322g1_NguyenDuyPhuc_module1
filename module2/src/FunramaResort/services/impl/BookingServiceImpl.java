package FunramaResort.services.impl;

import FunramaResort.model.*;
import FunramaResort.services.BookingService;
import FunramaResort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    @Override
    public void addBooking() {
        String customerId = chooseCustomer().getId();
        String facilityId = chooseFacility().getId();
        System.out.println("Nhập id");
        String bookingId = scanner.nextLine();
        System.out.println("Nhập ngày bắt đầu ");
        String startDay = scanner.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String endDay = scanner.nextLine();
        bookingSet.add(new Booking(bookingId, startDay, endDay, customerId, facilityId));
    }


    @Override
    public void displayListBooking() {
        for (Booking item : bookingSet) {
            System.out.println(item);
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        for (Customer item : CustomerServiceImpl.customerList) {
            System.out.println(item);
        }
        System.out.println("Nhập id khách hàng");
        new CustomerServiceImpl().readFile();
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
}
