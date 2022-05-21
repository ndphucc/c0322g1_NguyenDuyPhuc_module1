package giai_thuat_nhom;

import javax.xml.soap.Node;
import java.util.HashSet;
import java.util.Set;

public class MyList {
    public static void main(String[] args) {
        int x=20;
        int count=0;
        for (int i = 2; i <=20 ; i++) {
            if(i%2==0) {
                count++;
                if (count==3) {
                    System.out.println("-"+i);
                    count=0;
                }else {
                    System.out.println(i);
                }
            }
        }
    }
}