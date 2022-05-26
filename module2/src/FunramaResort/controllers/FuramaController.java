package FunramaResort.controllers;


import FunramaResort.services.impl.CustomerServiceImpl;
import FunramaResort.services.impl.EmployeeServiceImpl;
import FunramaResort.services.impl.FacityServiceImpl;

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
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }

    public static void displayEmployeeManagement() {
        System.out.println("1.Display list employees");
        System.out.println("2.Add new employee");
        System.out.println("3.Edit employee");
        System.out.println("4.Return main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                new EmployeeServiceImpl().display();
                break;
            case 2:
                new EmployeeServiceImpl().addNew();
                break;
            case 3:
                new EmployeeServiceImpl().edit();
                break;
            case 4:
                displayMainMenu();
        }
    }

    public static void displayCustomerManagement() {
        System.out.println("1.Display list customers");
        System.out.println("2.Add new customer");
        System.out.println("3.Edit customer");
        System.out.println("4.Return main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                new CustomerServiceImpl().display();
                break;
            case 2:
                new CustomerServiceImpl().addNew();
                break;
            case 3:
                new CustomerServiceImpl().edit();
            case 4:
                displayMainMenu();
        }
    }

    public static void displayFacilityManagement() {
        System.out.println("1.Display list facility");
        System.out.println("2.Add new facility");
        System.out.println("3.Display list facility maintenance");
        System.out.println("4.Return main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                new FacityServiceImpl().display();
                break;
            case 2:
                displayAddNewFacility();
                break;
            case 3:
                new FacityServiceImpl().displayMaintain();
                break;
            case 4:
                displayMainMenu();
        }
    }

    public static void displayBookingManagement() {
        System.out.println("1.Add new booking");
        System.out.println("2.Display list booking");
        System.out.println("3.Create new constracts");
        System.out.println("4.Display list contracts");
        System.out.println("5.Edit contracts");
        System.out.println("6.Return main menu");
    }

    public static void displayPromotionManagement() {
        System.out.println("1.Display list customers use service");
        System.out.println("2.Display list customers get voucher");
        System.out.println("3.Return main menu");
    }

    public static void displayAddNewFacility() {
        System.out.println("1.Add new Villa");
        System.out.println("2.Add new House");
        System.out.println("3.Add new Room");
        System.out.println("4.Back to menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                new FacityServiceImpl().addNewVilla();
                break;
            case 2:
                new FacityServiceImpl().addNewHouse();
                break;
            case 3:
                new FacityServiceImpl().addNewRoom();
                break;
            case 4:
                displayFacilityManagement();
        }

    }
}
