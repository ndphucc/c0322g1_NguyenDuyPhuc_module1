package FunramaResort.services.impl;

import FunramaResort.model.Booking;
import FunramaResort.model.Customer;
import FunramaResort.model.House;
import FunramaResort.model.Villa;
import FunramaResort.services.PromotionService;
import FunramaResort.utils.GetTime;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionServiceImpl implements PromotionService {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCustomer() {
        System.out.println("Nhập năm bạn muốn hiển thị");
        String year = scanner.nextLine();
        BookingServiceImpl.readBooking();
        FacilityServiceImpl.readVillaFile();
        FacilityServiceImpl.readHouseFile();
        for (Booking item : BookingServiceImpl.bookingSet) {
            Set<Villa> villaSet = FacilityServiceImpl.villaList.keySet();
            for (Villa villa : villaSet) {
                if (item.getFacilityId().equals(villa.getId()) && GetTime.getYearBooking(item.getStartDay()).equals(year) && villa.getRentalType().equals("Năm")) {
                    System.out.println(item);
                }
            }
            Set<House> houseSet = FacilityServiceImpl.houseList.keySet();
            for (House house : houseSet) {
                if (item.getFacilityId().equals(house.getId()) && GetTime.getYearBooking(item.getStartDay()).equals(year) && house.getRentalType().equals("Năm")) {
                    System.out.println(item);
                }
            }
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        BookingServiceImpl.readBooking();
        CustomerServiceImpl.readFile();
        Stack<Customer> customerStack = new Stack<>();
        System.out.println("Nhập số lượng voucher 10%");
        int voucher10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng voucher 20%");
        int voucher20 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng voucher 50%");
        int voucher50 = Integer.parseInt(scanner.nextLine());
        int sumVoucher = voucher10 + voucher20 + voucher50;
        for (Booking booking : BookingServiceImpl.bookingSet) {
            if (GetTime.getMonthBooking(booking.getStartDay()).equals(GetTime.getMonthDateTime()) && sumVoucher != 0) {
                for (Customer customer : CustomerServiceImpl.customerList) {
                    if (booking.getCustomerId().equals(customer.getId())) {
                        customerStack.add(customer);
                        sumVoucher--;
                        break;
                    }
                }
            }
        }
        for (Customer customer : customerStack) {
            if (voucher10 > 0) {
                System.out.println(customer + " bạn đã trúng vorcher 10%");
                voucher10--;
            } else if (voucher20 > 0) {
                System.out.println(customer + " bạn đã trúng vorcher 20%");
                voucher20--;
            } else {
                System.out.println(customer + " bạn đã trúng vorcher 50%");
            }
        }
    }
}
