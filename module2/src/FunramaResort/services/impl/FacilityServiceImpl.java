package FunramaResort.services.impl;

import FunramaResort.exception.*;
import FunramaResort.libs.UserException;
import FunramaResort.model.House;
import FunramaResort.model.Room;
import FunramaResort.model.Villa;
import FunramaResort.services.FacilityService;
import FunramaResort.utils.ReadAndWriteFile;
import FunramaResort.utils.Regex;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    static Map<Villa, Integer> villaList = new LinkedHashMap<>();
    static Map<House, Integer> houseList = new LinkedHashMap<>();
    static Map<Room, Integer> roomList = new LinkedHashMap<>();
    static String VILLA_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\villa.csv";
    static String HOUSE_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\house.csv";
    static String ROOM_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\room.csv";


    @Override
    public void display() {
        readVillaFile();
        readHouseFile();
        readRoomFile();
        Set<House> houseSet = houseList.keySet();

        for (House item : houseSet) {
            System.out.println(item + " số lần sử dụng: " + houseList.get(item));
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
        readVillaFile();

        String idFacility = getIdFacility(new Villa());

        String serviceName = getServiceName();

        double usableArea = getArea();

        double taxCosts = getTaxCosts();

        int maxPerson = getMaxPerson();

        String rentalType = getRentalType();

        String roomStandard = getRoomStandard();

        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số tầng");
        int floorNumbers = Integer.parseInt(scanner.nextLine());

        villaList.put(new Villa(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType, roomStandard, poolArea, floorNumbers), 0);
        writeVillaFile();
    }

    public static void writeVillaFile() {
        ReadAndWriteFile.clearFile(VILLA_PATH);
        Set<Villa> villaSet = villaList.keySet();
        for (Villa item : villaSet) {
            String line = item.getId() + ","
                    + item.getServiceName() + ","
                    + item.getUsableArea() + ","
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
                    + item.getUsableArea() + ","
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
            if (item.length == 9)
                houseList.put(new House(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7])), Integer.parseInt(item[8]));
        }
    }

    public String getRentalType() {
        System.out.println("Chọn kiểu thuê");
        System.out.println("1.Năm");
        System.out.println("2.Tháng");
        System.out.println("3.Ngày");
        System.out.println("4.Giờ");
        String choose = scanner.nextLine();
        do {
            switch (choose) {
                case "1":
                    return "Năm";
                case "2":
                    return "Tháng";
                case "3":
                    return "Ngày";
                case "4":
                    return "Giờ";
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    @Override
    public void addNewHouse() {
        readHouseFile();

        String idFacility = getIdFacility(new House());

        String serviceName = getServiceName();

        double usableArea = getArea();

        double taxCosts = getTaxCosts();

        int maxPerson = getMaxPerson();

        String rentalType = getRentalType();

        String roomStandard = getRoomStandard();

        System.out.println("Nhập số tầng");
        int floorNumbers = Integer.parseInt(scanner.nextLine());

        houseList.put(new House(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType, roomStandard, floorNumbers), 0);
        writeHouseFile();
    }

    @Override
    public void addNewRoom() {
        readRoomFile();

        String idFacility = getIdFacility(new Room());

        String serviceName = getServiceName();

        double usableArea = getArea();

        double taxCosts = getTaxCosts();

        int maxPerson = getMaxPerson();

        String rentalType = getRentalType();

        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();

        roomList.put(new Room(idFacility, serviceName, usableArea, taxCosts, maxPerson, rentalType, freeService), 0);
        writeRoomFile();
    }

    public static void writeRoomFile() {
        ReadAndWriteFile.clearFile(ROOM_PATH);
        Set<Room> roomSet = roomList.keySet();
        for (Room item : roomSet) {
            String line = item.getId() + ","
                    + item.getServiceName() + ","
                    + item.getUsableArea() + ","
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
        for (String[] item : strings) {
            roomList.put(new Room(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), Integer.parseInt(item[4]), item[5], item[6]), Integer.parseInt(item[7]));
        }
    }

    public static String getServiceName() {
        String serviceName;
        do {
            try {
                System.out.println("Nhâp tên dịch vụ");
                serviceName = scanner.nextLine();
                if (Regex.regexServiceName(serviceName)) {
                    return serviceName;
                }
                throw new InvalidServiceNameException("Tên phải bắt đầu bằng chữ hoa");
            } catch (InvalidServiceNameException e) {
                System.out.println(e.getMessage());
            }

        } while (true);
    }

    public static double getArea() {
        do {
            try {
                System.out.println("Nhập diện tích sử dụng");
                String area = scanner.nextLine();
                double result = UserException.parseDouble(area);
                if (result <= 30) {
                    throw new InvalidAreaException("diện tích phải lớn hơn 30");
                } else {
                    return result;
                }
            } catch (InvalidAreaException e) {
                System.out.println(e.getMessage());
            }

        } while (true);
    }

    public static double getTaxCosts() {
        do {
            try {
                System.out.println("Nhập chi phí thuế");
                String taxCosts = scanner.nextLine();
                double result = UserException.parseDouble(taxCosts);
                if (result <= 0) {
                    throw new InvalidTaxCostsException("chi phí thuế phải lớn hơn 30");
                } else {
                    return result;
                }
            } catch (InvalidTaxCostsException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static int getMaxPerson() {
        do {
            try {
                System.out.println("Nhập số người tối đa");
                String maxPerson = scanner.nextLine();
                int result = UserException.parseInteger(maxPerson);
                if (result <= 0 || result > 19) {
                    throw new InvalidMaxPersonException("số người tối đa phải lớn hơn 0 và bé hơn 20");
                } else {
                    return result;
                }
            } catch (InvalidMaxPersonException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static String getRoomStandard() {
        do {
            try {
                System.out.println("Nhập tiêu chuẩn phòng");
                String roomStandard = scanner.nextLine();
                if (Regex.regexServiceName(roomStandard)) {
                    return roomStandard;
                } else {
                    throw new InvalidRoomStandardException("Chữ cái đầu phải là chữ hoa");
                }
            } catch (InvalidRoomStandardException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static String getIdFacility(Object a) {
        String idFacility;
        if (a instanceof House) {
            readHouseFile();
            do {
                try {
                    System.out.println("Nhập mã dịch vụ");
                    idFacility = scanner.nextLine();
                    boolean flag = true;
                    if (Regex.regexHouseId(idFacility)) {
                        Set<House> houseSet = houseList.keySet();
                        for (House house : houseSet) {
                            if (house.getId().equals(idFacility)) {
                                System.out.println("id đã tồn tại");
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            return idFacility;
                        }
                    } else {
                        throw new InvalidHouseException("Mã dịch vụ không hợp lệ");
                    }
                } catch (InvalidHouseException e) {
                    System.out.println(e.getMessage());
                }

            } while (true);
        } else if (a instanceof Villa) {
            readVillaFile();
            do {
                try {
                    System.out.println("Nhập mã dịch vụ");
                    idFacility = scanner.nextLine();
                    boolean flag = true;
                    if (Regex.regexVillaId(idFacility)) {
                        Set<Villa> villaSet = villaList.keySet();
                        for (Villa villa : villaSet) {
                            if (villa.getId().equals(idFacility)) {
                                System.out.println("id đã tồn tại");
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            return idFacility;
                        }
                    } else {
                        throw new InvalidIdVillaException("Mã dịch vụ không hợp lệ");
                    }
                } catch (InvalidIdVillaException e) {
                    System.out.println(e.getMessage());
                }

            } while (true);
        } else {
            readRoomFile();
            do {
                try {
                    System.out.println("Nhập mã dịch vụ");
                    idFacility = scanner.nextLine();
                    boolean flag = true;
                    if (Regex.regexRoomId(idFacility)) {
                        Set<Room> roomSet = roomList.keySet();
                        for (Room room : roomSet) {
                            if (room.getId().equals(idFacility)) {
                                System.out.println("id đã tồn tại");
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            return idFacility;
                        }
                    } else {
                        throw new InvalidRoomException("Mã dịch vụ không hợp lệ");
                    }
                } catch (InvalidRoomException e) {
                    System.out.println(e.getMessage());
                }
            } while (true);
        }
    }
}