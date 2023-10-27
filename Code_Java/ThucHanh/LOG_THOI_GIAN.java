/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class LOG_THOI_GIAN {

    static boolean check(String s) {
        String a[] = s.split(":");
        if (a.length != 3) {
            return false;
        }
        try {
            int hour = Integer.parseInt(a[0]);
            if (hour < 0 || hour > 23) {
                return false;
            }
            int min = Integer.parseInt(a[1]);
            if (min < 0 || min > 59) {
                return false;
            }
            int giay = Integer.parseInt(a[2]);
            if (giay < 0 || giay > 59) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    static boolean check2(int i, String s) {
        if (i == -1 || s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',') {
            return true;
        }
        return false;
    }

    static boolean check3(int i, String s) {
        if (i == s.length() || s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            for (int i = 0; i <= s.length()-8; i++) {
                if (Character.isDigit(s.charAt(i))) {
                    if (check(s.substring(i, i + 8)) && check2(i - 1, s) && check3(i + 8, s)) {
                        ts.add(s.substring(i, i + 8));
                    }
                }
            }
            
        }
        for (String x : ts) {
                System.out.println(x);
            }
    }
}
//[BeginLog]
//[Boot Session: 2023/01/31 10:22:00.500]
//09:50:44.356  WINWORD (0x43A4)
//Section 2023/01/31 10:22:16, 538new
//{FILE_QUEUE_COMMIT} 10:22:16.569
//Start: 14:17:50.111over
//End: 14:17:50.899over
