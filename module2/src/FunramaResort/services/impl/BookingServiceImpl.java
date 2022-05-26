package FunramaResort.services.impl;

import FunramaResort.model.*;
import FunramaResort.services.BookingService;
import FunramaResort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static {

    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }

    }

    @Override
    public void displayListBooking() {

    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        for (Customer item : CustomerServiceImpl.customerList) {
            System.out.println(item);
        }
        System.out.println("Nhập id khách hàng");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer item : CustomerServiceImpl.customerList) {
                if (id == item.getId()) {
                    check = false;
                    return item;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai hãy nhập lại");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
    public static Facility chooseFacility() {
        System.out.println("Danh sach dich vu");
        Set<Facility> facilitySet = FacityServiceImpl.facilityMap.keySet();
        for (Facility item:facilitySet) {
            System.out.println(item);
        }
        System.out.println("Nhập id dịch vụ");
        boolean check = true;
        String id = (scanner.nextLine());
        while (check) {
            for (Facility item:facilitySet) {
               if (item.getIdFacility().equals(id)) {
                   check=false;
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
