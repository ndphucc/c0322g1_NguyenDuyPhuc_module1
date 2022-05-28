package FunramaResort.services.impl;

import FunramaResort.model.Facility;
import FunramaResort.model.House;
import FunramaResort.model.Room;
import FunramaResort.model.Villa;
import FunramaResort.services.FacilityService;
import FunramaResort.utils.ReadAndWriteFile;

import java.util.*;

public class FacityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    static Map<Villa, Integer> villaList = new LinkedHashMap<>();
    static Map<House, Integer> houseList = new LinkedHashMap<>();
    static Map<Room, Integer> roomList = new LinkedHashMap<>();
    static String VILLA_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\villa.csv";
    static String HOUSE_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\house.csv";
    static String ROOM_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\contract.csv";

    @Override
    public void display() {
        writeHouseFile();
        writeRoomFile();
        writeVillaFile();
        Set<House> houseSet = houseList.keySet();
        for (House item : houseSet) {
            System.out.println(item);
        }
        Set<Villa> villaSet = villaList.keySet();
        for (Villa item : villaSet) {
            System.out.println(item);
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room item : roomSet) {
            System.out.println(item);
        }
    }

    @Override
    public void displayMaintain() {
        readHouseFile();
        readRoomFile();
        readVillaFile();
        Set<House> houseSet = houseList.keySet();
        for (House item : houseSet) {
            if (houseList.get(item) >= 5) {
                System.out.println(item);
            }
        }
        Set<Villa> villaSet = villaList.keySet();
        for (Villa item : villaSet) {
            if (villaList.get(item) >= 5) {
                System.out.println(item);
            }
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room item : roomSet) {
            if (roomList.get(item) >= 5) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập mã dịch vụ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhâp tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuế");
        double taxCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        String rentalType = getRentalType();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int floorNumbers = Integer.parseInt(scanner.nextLine());
        villaList.put(new Villa(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType, roomStandard, poolArea, floorNumbers), 0);
    }

    public static void writeVillaFile() {
        ReadAndWriteFile.clearFile(VILLA_PATH);
        Set<Villa> villaSet = villaList.keySet();
        for (Villa item : villaSet) {
            String line = item.getId() + ","
                    + item.getServiceName() + ","
                    + item.getUsableArea() + "'"
                    + item.getTaxCosts() + ","
                    + item.getMaxPerson() + ","
                    + item.getRentalType() + ","
                    + item.getRoomStandard() + ","
                    + item.getPoolArea() + ","
                    + item.getFloorNumbers() + ","
                    + villaList.get(item);
            ReadAndWriteFile.writeFile(VILLA_PATH, line);
        }
    }

    public static void readVillaFile() {
        villaList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile(VILLA_PATH);
        for (String[] item : strings
        ) {
            villaList.put(new Villa(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), Integer.parseInt(item[4]), item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8])), Integer.parseInt(item[9]));

        }
    }

    public static void writeHouseFile() {
        ReadAndWriteFile.clearFile(HOUSE_PATH);
        Set<House> houses = houseList.keySet();
        for (House item : houses) {
            String line = item.getId() + ","
                    + item.getServiceName() + ","
                    + item.getUsableArea() + "'"
                    + item.getTaxCosts() + ","
                    + item.getMaxPerson() + ","
                    + item.getRentalType() + ","
                    + item.getRoomStandard() + ","
                    + item.getFloorNumbers() + ","
                    + houseList.get(item);
            ReadAndWriteFile.writeFile(HOUSE_PATH, line);
        }
    }

    public static void readHouseFile() {
        houseList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile(HOUSE_PATH);
        for (String[] item : strings
        ) {
            houseList.put(new House(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7])), Integer.parseInt(item[8]));
        }
    }

    public String getRentalType() {
        System.out.println("Chọn kiểu thuê");
        System.out.println("1.Năm");
        System.out.println("2.Tháng");
        System.out.println("3.Ngày");
        System.out.println("4.Giờ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                return "Năm";
            case 2:
                return "Tháng";
            case 3:
                return "Ngày";
            case 4:
                return "Giờ";
            default:
                System.out.println("Không hợp lệ");
                getRentalType();
        }
        return "";
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập mã dịch vụ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhâp tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuế");
        double taxCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        String rentalType = getRentalType();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng");
        int floorNumbers = Integer.parseInt(scanner.nextLine());
        houseList.put(new House(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType, roomStandard, floorNumbers), 0);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập mã dịch vụ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhâp tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuế");
        double taxCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        String rentalType = getRentalType();
        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        roomList.put(new Room(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType, freeService), 0);
    }

    public static void writeRoomFile() {
        ReadAndWriteFile.clearFile(ROOM_PATH);
        Set<Room> roomSet = roomList.keySet();
        for (Room item : roomSet) {
            String line = item.getId() + ","
                    + item.getServiceName() + ","
                    + item.getUsableArea() + "'"
                    + item.getTaxCosts() + ","
                    + item.getMaxPerson() + ","
                    + item.getRentalType() + ","
                    + item.getFreeService() + ","
                    + roomList.get(item);
            ReadAndWriteFile.writeFile(ROOM_PATH, line);
        }
    }

    public static void readRoomFile() {
        roomList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile(ROOM_PATH);
        for (String[] item : strings
        ) {
            roomList.put(new Room(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), Integer.parseInt(item[4]), item[5], item[6]), Integer.parseInt(item[7]));

        }
    }


}