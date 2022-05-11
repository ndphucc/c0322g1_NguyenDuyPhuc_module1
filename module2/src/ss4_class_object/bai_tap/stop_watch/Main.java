package ss4_class_object.bai_tap.stop_watch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        double arr[]=new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Math.random() * 1000;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    double x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        stopWatch.stop();
        System.out.println("thoi gian xu li : "+stopWatch.getElapsedTime());
    }


}
