package giai_thuat_nhom;

public class SoDep {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3};
        int a = arr[0];
        int b = arr[arr.length - 1];
        int j = arr.length - 2;
        for (int i = 1; i <= j; ) {
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            if ((i == j) && (a == b)) {
                System.out.println("dep");
                break;
            } else {
                if (a < b) {
                    a = a + arr[i];
                    i++;

                } else {
                    b = b + arr[j];
                    j--;

                }
            }
        }
        System.out.println("xau");
    }

}
