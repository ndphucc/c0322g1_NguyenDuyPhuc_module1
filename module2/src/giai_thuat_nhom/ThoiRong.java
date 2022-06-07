package giai_thuat_nhom;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class ThoiRong {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(256741038);
        list.add(623958417);
        list.add(467905213);
        list.add(714532089);
        list.add(938071625);
//        miniMaxSum(list);
    }
//    public static void miniMaxSum(List<Integer> arr) {
//        BigInteger min = new BigInteger("0");
//        BigInteger max = new BigInteger("0");
//        for (int i = 0; i < arr.size(); i++) {
//            BigInteger tempMin = new BigInteger("0");
//            BigInteger tempMax = new BigInteger("0");
//            for (int j = 0; j < arr.size(); j++) {
//                if (j!=i) {
//                    tempMin+= arr.get(j);
//                    tempMax+= arr.get(j);
//                }
//            }
//            if (i==0){
//                min=tempMin;
//                max=tempMax;
//            }else {
//                if (min>tempMin) {
//                    min=tempMin;
//                }
//                if (max<tempMax) {
//                    max=tempMax;
//                }
//            }
//        }
//        System.out.println(min+" "+max);
//    }
}
