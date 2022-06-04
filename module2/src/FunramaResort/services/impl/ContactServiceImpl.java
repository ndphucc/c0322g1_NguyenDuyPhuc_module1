package FunramaResort.services.impl;

import FunramaResort.model.Booking;
import FunramaResort.model.Contract;
import FunramaResort.services.ContactService;
import FunramaResort.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    static Queue<Booking> bookingContractQueue = new LinkedList();
    static LinkedList<Contract> contractLinkedList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String CONTACT_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\contract.csv";

    static {
        BookingServiceImpl.read();
        for (Booking item : BookingServiceImpl.bookingSet) {
            bookingContractQueue.add(item);
            BookingServiceImpl.bookingSet.remove(item);
        }
    }

    @Override
    public void display() {
        readFile();
        for (Booking item : bookingContractQueue
        ) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        readFile();

        System.out.println("Mã booking = " + bookingContractQueue.peek().getBookingId());

        System.out.println("Mã khách hàng = " + bookingContractQueue.peek().getCustomerId());

        System.out.println("Nhập mã hợp đồng thuê");
        String id = scanner.nextLine();

        System.out.println("Nhập tổng số tiền cọc trước ");
        Double deposit = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập tổng số tiền thanh toán ");
        double totalMoneyPayable = Double.parseDouble(scanner.nextLine());

        contractLinkedList.add(new Contract(id, bookingContractQueue.peek().getBookingId(), deposit, totalMoneyPayable, bookingContractQueue.poll().getCustomerId()));
        System.out.println("Bạn đã thêm thành công");
        writeFile();
    }

    public static void writeFile() {
        for (Contract item : contractLinkedList) {
            String line = item.getContractId() + ","
                    + item.getBookingId() + ","
                    + item.getDeposit() + ","
                    + item.getTotalMoneyPayable() + ","
                    + item.getCustomerId();
            ReadAndWriteFile.writeFile(CONTACT_PATH, line);
        }
    }

    @Override
    public void edit() {
        readFile();

        System.out.println("Nhập id bạn muốn sửa");
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
                    writeFile();
                }
            }
            if (flag) {
                System.out.println("id ko hợp lệ nhập lại");
                id = scanner.nextLine();
            }
        } while (flag);
    }

    public static void readFile() {
        List<String[]> strings = ReadAndWriteFile.readFile(CONTACT_PATH);
        for (String[] item : strings) {
            if (item.length == 9)
                contractLinkedList.add(new Contract(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), item[4]));
        }
    }

}
