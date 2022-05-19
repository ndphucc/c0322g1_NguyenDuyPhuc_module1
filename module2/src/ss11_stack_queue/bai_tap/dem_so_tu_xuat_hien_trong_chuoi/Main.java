package ss11_stack_queue.bai_tap.dem_so_tu_xuat_hien_trong_chuoi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] temp = str.split(" ");
        for (String s : temp) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            str = s;
            System.out.println("Từ " + str + " xuất hiện " + hashMap.get(str) + " lần");
        }

    }
}
