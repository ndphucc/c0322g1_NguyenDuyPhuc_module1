package FunramaResort.controllers;


import FunramaResort.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    displayEmployeeManagement();
                    break;
                case "2":
                    displayCustomerManagement();
                    break;
                case "3":
                    displayFacilityManagement();
                    break;
                case "4":
                    displayBookingManagement();
                    break;
                case "5":
                    displayPromotionManagement();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayEmployeeManagement() {
        do {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    new EmployeeServiceImpl().display();
                    break;
                case "2":
                    new EmployeeServiceImpl().add();
                    break;
                case "3":
                    new EmployeeServiceImpl().edit();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);


    }

    public static void displayCustomerManagement() {
        do {
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    new CustomerServiceImpl().display();
                    break;
                case "2":
                    new CustomerServiceImpl().add();
                    break;
                case "3":
                    new CustomerServiceImpl().edit();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);


    }

    public static void displayFacilityManagement() {
        do {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    new FacilityServiceImpl().display();
                    break;
                case "2":
                    displayAddNewFacility();
                    break;
                case "3":
                    new FacilityServiceImpl().displayMaintain();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);

    }

    public static void displayBookingManagement() {
        do {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Return main menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    new BookingServiceImpl().add();
                    break;
                case "2":
                    new BookingServiceImpl().display();
                    break;
                case "3":
                    new ContactServiceImpl().add();
                    break;
                case "4":
                    new ContactServiceImpl().display();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayPromotionManagement() {
        do {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    new PromotionServiceImpl().displayCustomer();
                    break;
                case "2":
                    new PromotionServiceImpl().displayCustomerGetVoucher();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);

    }

    public static void displayAddNewFacility() {
        do {
            System.out.println("1.Add new Villa");
            System.out.println("2.Add new House");
            System.out.println("3.Add new Room");
            System.out.println("4.Back to menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    new FacilityServiceImpl().addNewVilla();
                    break;
                case "2":
                    new FacilityServiceImpl().addNewHouse();
                    break;
                case "3":
                    new FacilityServiceImpl().addNewRoom();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }

        } while (true);
    }
}
