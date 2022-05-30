package casestudy.service.Impl;

import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Vila;
import casestudy.service.FacilityService;
import casestudy.utils.ReadAndWrite;
import casestudy.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d[1-9]\\d{2,})$";

    private static Map<Vila, Integer> villaList = new LinkedHashMap<>();
    private static Map<House, Integer> houseList = new LinkedHashMap<>();
    private static Map<Room, Integer> roomList = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Set<Vila> vilaSet = villaList.keySet();
        for (Vila vila : vilaSet) {
            System.out.println(vila);
        }
        Set<House> houseSet = houseList.keySet();
        for (House house : houseSet) {
            System.out.println(house);
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            System.out.println(room);
        }
    }

    @Override
    public void displayMaintain() {
        Set<Vila> vilaSet = villaList.keySet();
        for (Vila vila : vilaSet) {
            if (villaList.get(vila) >= 5) {
                System.out.println(vila);
            }
        }
        Set<House> houseSet = houseList.keySet();
        for (House house : houseSet) {
            if (houseList.get(house) >= 5) {
                System.out.println(house);
            }
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            if (roomList.get(room) >= 5) {
                System.out.println(room);
            }
        }
    }

    public String getStyleRental() {
        do {
            System.out.println("Chọn kiểu thuê");
            System.out.println("1.Năm");
            System.out.println("2.Tháng");
            System.out.println("3.Ngày");
            System.out.println("1.Giờ");
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
                    System.out.println("Chọn sai rồi!! Chọn lại đi");
                    getStyleRental();
            }
        } while (true);
    }

    @Override
    public void addNewVilla() {
        String id = inputIdVilla();
        String name = inputName();
        double areaUse = Double.parseDouble(inputAreaUse());
        int rentalPrice = Integer.parseInt(inputRentalPrice());
        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());
        String styleRental = getStyleRental();
        String standardVilla = inputStandard();
        double areaPool = Double.parseDouble(inputAreaPool());
        int floor = Integer.parseInt(inputFloor());
        Vila vila = new Vila(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        //villaList.put(vila, 0);
        String line = id + "," + name + "," + areaUse + "," + rentalPrice + "," + rentalPeopleMax + "," + styleRental + "," +
                standardVilla + "," + standardVilla + "," + areaPool + "," + floor;
        ReadAndWrite.writeFile("src\\casestudy.data\\villa.csv", line);
        System.out.println("Đã thêm mới thành công");
    }

    private String inputIdVilla() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVVL-YYYY");
    }

    private String inputIdHouse() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVHO-YYYY");
    }

    private String inputIdRoom() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVRO-YYYY");
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai mã định dạng. Tên dịch vụ phải viết hoa");
    }

    private String inputRentalPrice() {
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai mã định dạng. Giá tiền phải số dương");
    }

    private String inputAreaUse() {
        System.out.println("Nhập diện tích: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai mã định dạng. Diện tích phải lớn hơn 30m^2 ");
    }

    private String inputRentalPeopleMax() {
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Bạn đã nhập sai mã định dạng. Số lượng người tối đa phải >0 và nhỏ hơn <20");
    }

    private String inputStandard() {
        System.out.println("Nhập tiêu chuẩn dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai mã định dạng. Tên dịch vụ phải viết hoa");
    }

    private String inputAreaPool() {
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai mã định dạng. Diện tích phải lớn hơn 30m^2");
    }

    private String inputFloor() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai mã định dạng. Số tầng phải là số nguyên dương");
    }


    @Override
    public void addNewHouse() {
        String id = inputIdHouse();
        String name = inputName();
        double areaUse = Double.parseDouble(inputAreaUse());
        int rentalPrice = Integer.parseInt(inputRentalPrice());
        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());
        String styleRental = getStyleRental();
        String standardRoom = inputStandard();
        int floor = Integer.parseInt(inputFloor());
        House house = new House(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardRoom, floor);
        String line = id + "," + name + "," + areaUse + "," + rentalPrice + "," + rentalPeopleMax + "," + styleRental + "," +
                standardRoom + "," + floor;
        ReadAndWrite.writeFile("src\\casestudy.data\\house.csv", line);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
        String id = inputIdRoom();
        String name = inputName();
        double areaUse = Double.parseDouble(inputAreaUse());
        int rentalPrice = Integer.parseInt(inputRentalPrice());
        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());
        String styleRental = getStyleRental();
        String freeService = inputStandard();
        Room room = new Room(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        String line = id + "," + name + "," + areaUse + "," + rentalPrice + "," + rentalPeopleMax + "," + styleRental + "," +
                freeService;
        ReadAndWrite.writeFile("src\\casestudy.data\\room.csv", line);
        System.out.println("Đã thêm mới thành công");
    }
}

