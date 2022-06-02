package tai_khoan_ngan_hang.service.Impl;

import tai_khoan_ngan_hang.model.BankAccount;
import tai_khoan_ngan_hang.model.PaymentAccount;
import tai_khoan_ngan_hang.model.SavingAccount;
import tai_khoan_ngan_hang.service.BankAccountService;
import tai_khoan_ngan_hang.untils.ReadAndWrite;
import tai_khoan_ngan_hang.untils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountServiceImpl implements BankAccountService {
    static Scanner scanner = new Scanner(System.in);
    List<BankAccount> paymentAccountList = new ArrayList<>();
    public static final String REGEX_NUMBER = "^[0-9]+$";

    private String moneySave() {
        System.out.println("Nhập số tiền gửi tiết kiệm: ");
        return Regex.number(REGEX_NUMBER);
    }

    private String cardNumber() {
        System.out.println("Nhập số thẻ");
        return Regex.number(REGEX_NUMBER);
    }

    private String money() {
        System.out.println("Nhập số tiền trong tài khoản");
        return Regex.number(REGEX_NUMBER);
    }

    @Override
    public void addSavingAccount() {
        readFile();
        String id = ""+(Integer.parseInt(paymentAccountList.get(paymentAccountList.size() - 1).getId()) + 1);
        System.out.println("Nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String date = scanner.nextLine();
        Double money = Double.parseDouble(moneySave());
        System.out.println("Nhập ngày gửi tiết kiệm");
        String sentDate = scanner.nextLine();
        System.out.println("Nhập lãi suất");
        Double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập kì hạn");
        Double tenor = Double.parseDouble(scanner.nextLine());
        SavingAccount savingAccount = new SavingAccount(id, accountCode, name, date, money, sentDate, interestRate, tenor);
        paymentAccountList.add(savingAccount);
        writeFile();
        System.out.println("Đã thêm mới thành công");
        writeFile();
    }

    @Override
    public void addPayAccount() {
        readFile();
        String id = ""+(Integer.parseInt(paymentAccountList.get(paymentAccountList.size() - 1).getId()) + 1);
        String accountCode = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String date = scanner.nextLine();
        int cardNumber = Integer.parseInt(cardNumber());
        double money = Double.parseDouble(money());
        PaymentAccount paymentAccount = new PaymentAccount(id, accountCode, name, date, cardNumber, money);
        paymentAccountList.add(paymentAccount);
        writeFile();
        System.out.println("Đã thêm mới thành công");
        writeFile();
    }


    @Override
    public void delete() {

    }

    @Override
    public void display() {
        readFile();
        for (BankAccount paymentAccount : paymentAccountList) {
            System.out.println(paymentAccount);
        }
    }

    @Override
    public void search() {
        boolean check = true;
        System.out.println("Nhập tên muốn tìm kiếm");
        String inputName = scanner.nextLine();
        for (BankAccount savingAccount : paymentAccountList) {
            if (savingAccount.getName().contains(inputName)) {
                check = false;
                System.out.println("Tên cần tìm:" + savingAccount);
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên này");
        }
    }
    public void readFile() {
        paymentAccountList.clear();
        List<String[]> strings = ReadAndWrite.readFile("D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv");
        for (String[] item: strings) {
            if (item.length==8) {
                paymentAccountList.add(new SavingAccount(item[0],item[1],item[2],item[3],Double.parseDouble(item[4]),item[5],Double.parseDouble(item[6]),Double.parseDouble(item[7])));
            }else if (item.length==6) {
                paymentAccountList.add(new PaymentAccount(item[0],item[1],item[2],item[3],Integer.parseInt(item[4]),Double.parseDouble(item[5])));
            }
        }
    }
    public void writeFile() {
        ReadAndWrite.deleteFile("D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv");
        for (BankAccount item: paymentAccountList) {
            String line = item.getInfo();
            ReadAndWrite.writeFile("D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv",line);
        }
    }
}
