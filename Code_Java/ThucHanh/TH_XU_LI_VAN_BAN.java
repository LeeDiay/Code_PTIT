/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class TH_XU_LI_VAN_BAN {
    public static int john(String s) {
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x))
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ts = new TreeSet<>();
        while (sc.hasNext()) {
            String tmp = sc.next();
            if (john(tmp) == 1)
                ts.add(tmp);
        }
        for (String x : ts) {
            System.out.println(x);
        }
    }
}
