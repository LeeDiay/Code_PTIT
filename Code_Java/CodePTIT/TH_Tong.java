/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

/**
 *
 * @author DELL
 */

import java.util.*;
import java.io.*;

public class TH_Tong {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while (sc.hasNext()) {
            try {
                long x = Long.parseLong(sc.next());
                if (x > Integer.MAX_VALUE) {
                    tong += x;
                }
            } catch (Exception e) {
            }
        }
        System.out.println(tong);
    }
}
