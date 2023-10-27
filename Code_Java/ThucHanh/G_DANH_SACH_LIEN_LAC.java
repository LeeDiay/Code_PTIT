package ThucHanh;

import java.util.*;
import java.io.*;

public class G_DANH_SACH_LIEN_LAC {

    public static boolean check(String s) {
        if (s.trim().length() != 8) {
            return false;
        }
        if (s.charAt(2) != ':' && s.charAt(5) != ':') {
            return false;
        }
        String[] a = s.trim().split(":");
        int a00 = Integer.parseInt(a[0]), a01 = Integer.parseInt(a[1]), a02 = Integer.parseInt(a[2]);
        if (a00 >= 0 && a00 <= 23 && a01 >= 0 && a01 <= 59 && a02 >= 0 && a02 <= 59) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNext()) {
            String tmp = sc.next();
            s += tmp + " ";
        }
        s = s.replace(".", " ");
        s = s.replace(",", " ");
        TreeSet<String> ts = new TreeSet<>();
        String[] a = s.trim().split("\\s+");
        for (String x : a) {
            if (check(x)) {
                ts.add(x);
            }
        }
        for (String x : ts) {
            System.out.println(x);
        }
    }
}