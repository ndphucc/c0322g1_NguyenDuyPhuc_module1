package FunramaResort.services.impl;

import FunramaResort.model.Facility;
import FunramaResort.model.House;
import FunramaResort.model.Room;
import FunramaResort.model.Villa;
import FunramaResort.services.FacilityService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacityServiceImpl implements FacilityService {
    static Map<Facility,Integer> facilityMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static {
        facilityMap.put(new Villa("id dich vu 1","tên dịch vụ 1",500,567,5,"Loại cho thuê 1","tiêu chuẩn phòng 1",100,5),0);
        facilityMap.put(new House("id dich vu 2","tên dịch vụ 2",500,567,5,"Loại cho thuê 2","tiêu chuẩn phòng 1",3),0);
        facilityMap.put(new Room("id dich vu 3","tên dịch vụ 1",500,5,5,"tiêu chuẩn phòng 1","Dịch vụ miễn phí"),5);
        facilityMap.put(new Villa("id dich vu 4","tên dịch vụ 3",500,567,5,"Loại cho thuê 1","tiêu chuẩn phòng 1",100,5),5);
        facilityMap.put(new Villa("id dich vu 5","tên dịch vụ 1",500,567,5,"Loại cho thuê 1","tiêu chuẩn phòng 1",100,5),0);
    }

    @Override
    public void display() {
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility item: facilitySet) {
            System.out.println(item);
        }
    }

    @Override
    public void displayMaintain() {
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility item: facilitySet) {
            if (facilityMap.get(item)>4){
                System.out.println(item);
            };
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập mã dịch vụ");
        String idFacility =scanner.nextLine();
        System.out.println("Nhâp tên dịch vụ");
        String serviceName= scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double usableArea= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuế");
        double taxCosts= Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        int maxPerson= Integer.parseInt(scanner.nextLine());
        String rentalType= getRentalType();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard= scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int floorNumbers= Integer.parseInt(scanner.nextLine());
        facilityMap.put(new Villa(idFacility,serviceName,usableArea,taxCosts,maxPerson,rentalType,roomStandard,poolArea,floorNumbers),0);
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
        String idFacility =scanner.nextLine();
        System.out.println("Nhâp tên dịch vụ");
        String serviceName= scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double usableArea= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuế");
        double taxCosts= Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        int maxPerson= Integer.parseInt(scanner.nextLine());
        String rentalType= getRentalType();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard= scanner.nextLine();
        System.out.println("Nhập số tầng");
        int floorNumbers= Integer.parseInt(scanner.nextLine());
        facilityMap.put(new House(idFacility,serviceName,usableArea,taxCosts,maxPerson,rentalType,roomStandard,floorNumbers),0);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập mã dịch vụ");
        String idFacility =scanner.nextLine();
        System.out.println("Nhâp tên dịch vụ");
        String serviceName= scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double usableArea= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuế");
        double taxCosts= Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        int maxPerson= Integer.parseInt(scanner.nextLine());
        String rentalType= getRentalType();
        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        facilityMap.put(new Room(idFacility,serviceName,usableArea,taxCosts,maxPerson,rentalType,freeService),0);
    }
}
