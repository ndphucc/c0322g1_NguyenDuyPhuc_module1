package ss2_vong_lap.bai_tap;

public class DispalyLess100Prime {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int num = 2;
            boolean flag = true;
            while (num <= Math.sqrt(i)) {
                if (i % num == 0) {
                    flag = false;
                    break;
                }
                num++;
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
