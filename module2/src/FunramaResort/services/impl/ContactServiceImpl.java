package FunramaResort.services.impl;


import FunramaResort.model.Booking;
import FunramaResort.model.Contract;
import FunramaResort.services.ContactService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    static Queue<Booking> bookingContractQueue = new LinkedList();
    LinkedList<Contract> contractLinkedList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        for (Booking item : BookingServiceImpl.bookingSet) {
            bookingContractQueue.add(item);
            BookingServiceImpl.bookingSet.remove(item);
        }
    }

    @Override
    public void display() {
        for (Booking item : bookingContractQueue
        ) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Mã booking = " + bookingContractQueue.peek().getBookingId());
        System.out.println("Mã khách hàng = " + bookingContractQueue.peek().getCustomerId());
        System.out.println("Nhập mã hợp đồng thuê");
        String id = scanner.nextLine();
        System.out.println("Nhập tổng số tiền cọc trước ");
        Double deposit = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tổng số tiền thanh toán ");
        double totalMoneyPayable = Double.parseDouble(scanner.nextLine());
        contractLinkedList.add(new Contract(id, bookingContractQueue.peek().getBookingId(), deposit, totalMoneyPayable, bookingContractQueue.peek().getCustomerId()));
        bookingContractQueue.remove();
        System.out.println("Bạn đã thêm thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập id bạn muốn xóa");
        String id = scanner.nextLine();
        boolean flag = true;
        do {
            for (Contract item : contractLinkedList) {
                if (id.equals(item.getContractId())) {
                    flag = false;
                    System.out.println("Nhập mã booking");
                    String bookingId = scanner.nextLine();
                    System.out.println("Nhập mã khách hàng");
                    String customerId = scanner.nextLine();
                    System.out.println("Nhập tổng số tiền cọc trước ");
                    Double deposit = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập tổng số tiền thanh toán ");
                    double totalMoneyPayable = Double.parseDouble(scanner.nextLine());
                    item.setBookingId(bookingId);
                    item.setCustomerId(customerId);
                    item.setDeposit(deposit);
                    item.setTotalMoneyPayable(totalMoneyPayable);
                    System.out.println("Đã sữa thành công");
                }
            }
            if (flag) {
                System.out.println("id ko hợp lệ nhập lại");
                id = scanner.nextLine();
            }
        } while (flag);
        for (Contract item : contractLinkedList
        ) {
            if (id.equals(item.getContractId())) {

            }
        }
    }

    @Override
    public void remove() {

    }
}
